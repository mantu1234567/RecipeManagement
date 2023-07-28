package com.geekster.RecipeManagementService.controllers;

import com.geekster.RecipeManagementService.dto.SignInInput;
import com.geekster.RecipeManagementService.dto.SignOutSignInOutput;
import com.geekster.RecipeManagementService.dto.SignUpInput;
import com.geekster.RecipeManagementService.models.User;
import com.geekster.RecipeManagementService.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("signUp")
    public String signUp(@Valid @RequestBody SignUpInput signUpInput) {

        return userService.signUp(signUpInput);
    }

    @PostMapping("signIn")
    public SignOutSignInOutput signIn(@Valid @RequestBody SignInInput signInInput) {
        return userService.signIn(signInInput);
    }

    @DeleteMapping("signOut/{email}/{token}")
    public SignOutSignInOutput signOut(@PathVariable String email,@PathVariable String token) {
        return userService.signOut(email,token);
    }

    @DeleteMapping("/{email}")
    public String deleteBasedOnEmail(@PathVariable String email) {
        if(userService.deleteBasedOnEmail(email)) {
            return "Deleted user successfully";
        }
        return "Email Address does not present";
    }

    @GetMapping("all/users")
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }

}

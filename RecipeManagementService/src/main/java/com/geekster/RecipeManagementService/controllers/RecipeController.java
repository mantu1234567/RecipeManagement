package com.geekster.RecipeManagementService.controllers;

import com.geekster.RecipeManagementService.dto.RecipeDto;
import com.geekster.RecipeManagementService.models.Recipe;
import com.geekster.RecipeManagementService.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recipe")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @PostMapping("add/recipes")
    public String addRecipe(@RequestBody RecipeDto recipeDto) {

        return recipeService.addRecipe(recipeDto);
    }

    @GetMapping("user/all/by/{token}")
    public List<Recipe> getAllRecipeBySpecificUser(@PathVariable String token) {
        return recipeService.getAllRecipeByToken(token);
    }

    @DeleteMapping("/{token}/{recipeName}")
    public String deleteByRecipeName(@PathVariable String token,@PathVariable String recipeName) {
        if(recipeService.isDeleted(token,recipeName)) {
            return "deleted recipe successfully";
        }
        return "Invalid token or recipe name";
    }

    @PutMapping("update/recipe/{id}/{ingredients}")
    public String updateIngredientsByRecipeId(@PathVariable Long id,@PathVariable String ingredients) {
        return recipeService.updateIngredientsByRecipeId(id,ingredients);
    }

    @GetMapping("get/all/recipe")
    public List<Recipe> getAllRecipe() {
        return recipeService.getAllRecipe();
    }

}

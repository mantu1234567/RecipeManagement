
# RecipeManagement

This is a Recipe Management Service, which allows users to manage their recipes.
It provides functionalities for signing up, signing in, adding, updating, and deleting recipes.

## Getting Started

These instructions will help you set up the project on your local machine.

### Prerequisites

- Java 8 or higher
- Spring Boot
- Maven
- MySQL (or any other compatible database)

### Installation

1. Clone the repository.
2. Set up your database and update the database configuration in 'application.properties'.
3. Run the application using Maven or your preferred IDE.

### Usage

1. Sign up with a new account using the '/user/signUp' endpoint.
2. Sign in using the '/user/signIn' endpoint to get an authentication token.
3. Use the authentication token to perform CRUD operations on recipes using the '/recipe' endpoints.

## API Endpoints

- POST /user/signUp - Sign up a new user
- POST /user/signIn - Sign in with existing user credentials
- DELETE /user/signOut/{email}/{token} - Sign out with email and token
- DELETE /user/{email} - Delete a user based on email
- GET /user/all/users - Get a list of all users
- POST /recipe/add/recipes - Add a new recipe
- GET /recipe/user/all/by/{token} - Get all recipes for a specific user
- DELETE /recipe/{token}/{recipeName} - Delete a recipe by recipe name
- PUT /recipe/update/recipe/{id}/{ingredients} - Update ingredients for a recipe by ID
- GET /recipe/get/all/recipe - Get a list of all recipes

## Authors
Mantu kumar

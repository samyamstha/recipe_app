package com.samyam.recipe_app.services;

import com.samyam.recipe_app.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}

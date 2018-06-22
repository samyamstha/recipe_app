package com.samyam.recipe_app.services;

import com.samyam.recipe_app.commands.RecipeCommand;
import com.samyam.recipe_app.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}

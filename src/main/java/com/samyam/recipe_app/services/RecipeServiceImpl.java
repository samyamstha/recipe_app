package com.samyam.recipe_app.services;

import com.samyam.recipe_app.domain.Recipe;
import com.samyam.recipe_app.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        for (Recipe recipe : recipeRepository.findAll()) {
            recipeSet.add(recipe);
            System.out.println("Recipe " + recipe.getDescription());
        }
        return recipeSet;
    }
}

package com.samyam.recipe_app.repositories;

import com.samyam.recipe_app.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}

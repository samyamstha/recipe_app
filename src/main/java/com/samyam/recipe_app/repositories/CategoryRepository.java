package com.samyam.recipe_app.repositories;

import com.samyam.recipe_app.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long>{
}

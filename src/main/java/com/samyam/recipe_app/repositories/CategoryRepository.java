package com.samyam.recipe_app.repositories;

import com.samyam.recipe_app.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long>{

    Optional<Category> findByDescription(String description);
}

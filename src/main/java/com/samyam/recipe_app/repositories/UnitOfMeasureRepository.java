package com.samyam.recipe_app.repositories;

import com.samyam.recipe_app.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {


    Optional<UnitOfMeasure> findByDescription(String description);
}

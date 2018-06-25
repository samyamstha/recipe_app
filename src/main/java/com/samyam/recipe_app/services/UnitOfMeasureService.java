package com.samyam.recipe_app.services;

import com.samyam.recipe_app.commands.UnitOfMeasureCommand;

import java.util.Set;


public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}

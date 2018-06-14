package com.samyam.recipe_app.controllers;


import com.samyam.recipe_app.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {


    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/home"})
    public String home(Model model){
        log.debug("Getting Index Page.");
        model.addAttribute("recipes", recipeService.getRecipes());
        return  "index";
    }


}

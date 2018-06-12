package com.samyam.recipe_app.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent> {




    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        init();
    }



    public void init(){

    }
}

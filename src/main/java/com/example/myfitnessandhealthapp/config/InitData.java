package com.example.myfitnessandhealthapp.config;


import com.example.myfitnessandhealthapp.model.Ingredient;
import com.example.myfitnessandhealthapp.repository.IngredientRepository;
import com.example.myfitnessandhealthapp.repository.RecipeIngredientRepository;
import com.example.myfitnessandhealthapp.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeIngredientRepository recipeIngredientRepository;

    @Override
    public void run(String... args) throws Exception {

        ingredientRepository.save(new Ingredient("Chicken Breast", 31.0, 0.0, 3.6, 165));
        ingredientRepository.save(new Ingredient("Rice (white)", 2.7, 28.0, 0.3, 130));
        ingredientRepository.save(new Ingredient("Broccoli", 2.8, 6.6, 0.3, 34));
        ingredientRepository.save(new Ingredient("Olive Oil", 0.0, 0.0, 100.0, 884));
        ingredientRepository.save(new Ingredient("Egg (whole)", 13.0, 1.1, 11.0, 155));
        ingredientRepository.save(new Ingredient("Banana", 1.3, 23.0, 0.3, 96));
        ingredientRepository.save(new Ingredient("Salmon", 20.0, 0.0, 13.0, 208));
        ingredientRepository.save(new Ingredient("Oats", 13.0, 66.0, 6.0, 389));
    }

}

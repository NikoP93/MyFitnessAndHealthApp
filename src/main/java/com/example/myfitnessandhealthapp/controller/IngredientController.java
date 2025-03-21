package com.example.myfitnessandhealthapp.controller;

import com.example.myfitnessandhealthapp.model.Ingredient;
import com.example.myfitnessandhealthapp.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/ingredients")
    public List<Ingredient> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }
}

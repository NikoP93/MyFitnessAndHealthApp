package com.example.myfitnessandhealthapp.service;

import com.example.myfitnessandhealthapp.repository.RecipeIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeIngredientService {

    @Autowired
    private RecipeIngredientRepository recipeIngredientRepository;
}

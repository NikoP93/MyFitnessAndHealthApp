package com.example.myfitnessandhealthapp.service;

import com.example.myfitnessandhealthapp.model.Ingredient;
import com.example.myfitnessandhealthapp.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    public List<Ingredient> getAllIngredients() {
       return ingredientRepository.findAll();
    }
}

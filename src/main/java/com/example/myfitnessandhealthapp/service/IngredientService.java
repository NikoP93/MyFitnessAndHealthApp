package com.example.myfitnessandhealthapp.service;

import com.example.myfitnessandhealthapp.model.Ingredient;
import com.example.myfitnessandhealthapp.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    public List<Ingredient> getAllIngredients() {
       return ingredientRepository.findAll();
    }

    public Optional<Ingredient> getIngredientById(int id) {
        return ingredientRepository.findById(id);
    }

    public ResponseEntity<Ingredient> addIngredient(Ingredient ingredient) {
        Ingredient newIngredient = ingredientRepository.save(ingredient);
        return new ResponseEntity<>(newIngredient, HttpStatus.OK);
    }
}

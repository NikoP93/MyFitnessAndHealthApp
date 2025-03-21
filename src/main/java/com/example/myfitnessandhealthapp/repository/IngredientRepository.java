package com.example.myfitnessandhealthapp.repository;

import com.example.myfitnessandhealthapp.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}

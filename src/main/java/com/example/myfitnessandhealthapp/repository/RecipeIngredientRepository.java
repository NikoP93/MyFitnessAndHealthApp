package com.example.myfitnessandhealthapp.repository;

import com.example.myfitnessandhealthapp.model.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Integer> {
}

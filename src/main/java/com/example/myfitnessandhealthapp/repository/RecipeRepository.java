package com.example.myfitnessandhealthapp.repository;

import com.example.myfitnessandhealthapp.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}

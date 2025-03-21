package com.example.myfitnessandhealthapp.service;


import com.example.myfitnessandhealthapp.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;


}

package com.example.myfitnessandhealthapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


import java.util.HashSet;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recipeid;
    private String recipeName;


    @OneToMany(mappedBy = "recipe")
    @JsonBackReference
    private Set<RecipeIngredient> ingredients = new HashSet<>();

    public Set<RecipeIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<RecipeIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getRecipeid() {
        return recipeid;
    }

    public void setRecipeid(int recipeid) {
        this.recipeid = recipeid;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
}

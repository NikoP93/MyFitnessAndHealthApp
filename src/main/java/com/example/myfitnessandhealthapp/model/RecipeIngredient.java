package com.example.myfitnessandhealthapp.model;

import jakarta.persistence.*;

@Entity
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recipeIngredientid;
    private double weightInGrams;

    @ManyToOne
    @JoinColumn(name = "recipeidfk",referencedColumnName = "recipeid")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "ingredientidfk",referencedColumnName = "ingredientid")
    private Ingredient ingredient;

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public int getRecipeIngredientid() {
        return recipeIngredientid;
    }

    public void setRecipeIngredientid(int recipeIngredientid) {
        this.recipeIngredientid = recipeIngredientid;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weight) {
        this.weightInGrams = weight;
    }
}

package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import java.util.ArrayList;
import java.util.List;

public class ProduitService {
    private List<Produit> menuItems;
    private static ProduitService instance;

    private ProduitService() {
        // Hna khwina l-lista mn l-pizzas l-qdam li kano kay-dirou erreur (7 dyal params)
        menuItems = new ArrayList<>();
    }

    public static ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    public void addNewRecipe(Produit p) {
        menuItems.add(p);
    }

    public List<Produit> getAllItems() {
        return menuItems;
    }

    public Produit findById(int id) {
        for (Produit p : menuItems) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
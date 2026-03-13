package com.example.pizzarecipes.classes;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private float duree;
    private String description; // Rdditha l-dakhel
    private String details;
    private String preparation;

    private static int comp = 0;

    // L-constructeur khass y-akhed 5 dyal l-7wayj bach y-khdem m3a l-izafat l-jdad
    public Produit(String nom, int nbrIngredients, float duree, int photo, String description) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.duree = duree;
        this.photo = photo;
        this.description = description;
    }

    // --- Les Getters (Bach n-jbdou l-ma3loumat) ---

    public int getId() { return id; }
    public String getNom() { return nom; }
    public int getNbrIngredients() { return nbrIngredients; }
    public int getPhoto() { return photo; }
    public float getDuree() { return duree; }
    public String getDescription() { return description; }
    public String getDetails() { return details; }
    public String getPreparation() { return preparation; }

    // --- Les Setters (Bach n-beddlou l-ma3loumat) ---

    public void setNom(String nom) { this.nom = nom; }
    public void setNbrIngredients(int nbrIngredients) { this.nbrIngredients = nbrIngredients; }
    public void setPhoto(int photo) { this.photo = photo; }
    public void setDuree(float duree) { this.duree = duree; }
    public void setDescription(String description) { this.description = description; }
    public void setDetails(String details) { this.details = details; }
    public void setPreparation(String preparation) { this.preparation = preparation; }
}
# 🍕 Gourmet Pizza Recipes - Lab 6



## 📖 À Propos du Projet
Cette application Android, développée dans le cadre du **Lab 6**, est une vitrine interactive de recettes de pizzas gourmandes. Conçue avec une interface utilisateur moderne et épurée, elle permet aux utilisateurs de parcourir une liste de pizzas alléchantes et d'en découvrir les détails (ingrédients, temps de préparation, description complète).

Le projet met en avant l'utilisation des composants classiques d'Android (`ListView`, `BaseAdapter`) tout en respectant une architecture logicielle propre (MVC & Singleton).

---

## ✨ Fonctionnalités Principales
- 📋 **Liste Dynamique :** Affichage optimisé des pizzas via un adaptateur personnalisé (`PizzaAdapter`).
- 🔍 **Vue Détaillée :** Une page complète pour chaque pizza avec image grand format, système de notation (RatingBar) et description.
- 🚀 **Performances :** Gestion des données centralisée grâce au design pattern **Singleton** (`ProduitService`).
- 🎨 **UI/UX Moderne :** Design soigné avec une palette de couleurs cohérente et une typographie claire.

---

## 🏗️ Architecture du Projet (MVC)

L'application est structurée selon le modèle **Modèle-Vue-Contrôleur** pour séparer la logique métier de l'interface utilisateur :

| Dossier | Rôle | Classes Clés |
| :--- | :--- | :--- |
| 📦 `classes` (Model) | Structure des données | `Produit.java` (POJO) |
| ⚙️ `service` (Controller/Data) | Gestion de l'état (Singleton) | `ProduitService.java` |
| 🔄 `adapter` (Controller/View) | Liaison Vue/Données | `PizzaAdapter.java` |
| 📱 `ui` (View/Controller) | Activités Android | `ListPizzaActivity`, `PizzaDetailActivity` |

---



## 🛠️ Technologies & Outils
* **Langage :** Java
* **Interface :** XML (LinearLayout, ScrollView, ImageView, RatingBar)
* **IDE :** Android Studio
* **Gestionnaire de versions :** Git / GitHub

---
  ## 📸 Captures d'Écran




---


## 🎥 Démonstration de l'Application

Voici un aperçu de l'application en cours d'utilisation, montrant la navigation entre la liste des pizzas et les détails d'une recette :




---

## 👤 Auteur

* **École Normale Supérieure de Marrakech**
  
* **Réalisé par :** SALMA LAKHAL
  
* **Filière  :** CLE_INFO_S5
  
* **Année universitaire :** 2025/2026
  
* **Encadré par :** Pr. Mohamed LACHGAR

* **Cours :** Programmation Mobile : Android avec Java
  
---

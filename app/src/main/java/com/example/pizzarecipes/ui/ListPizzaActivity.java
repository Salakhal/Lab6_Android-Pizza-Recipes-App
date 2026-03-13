package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzarecipes.R;
import com.example.pizzarecipes.adapter.PizzaAdapter;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;
import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        // 1. Kan-zidou l-pizzas b description dyalhom bach t-matchi l-classe Produit l-jdida
        if (ProduitService.getInstance().getAllItems().isEmpty()) {
            ProduitService.getInstance().addNewRecipe(new Produit("SPINACH PIZZA", 2, 25f, R.drawable.pizza1,
                    "Une pizza saine avec des épinards frais et du fromage fondant."));

            ProduitService.getInstance().addNewRecipe(new Produit("DEEP-DISH SAUSAGE PIZZA", 8, 45f, R.drawable.pizza2,
                    "Style Chicago avec une croûte épaisse et beaucoup de saucisse."));

            ProduitService.getInstance().addNewRecipe(new Produit("HOMEMADE PIZZA", 4, 50f, R.drawable.pizza3,
                    "Le goût authentique du fait maison avec des ingrédients frais."));

            ProduitService.getInstance().addNewRecipe(new Produit("PESTO CHICKEN PIZZA", 3, 50f, R.drawable.pizza4,
                    "Un mélange savoureux de poulet grillé et de sauce pesto maison."));
        }

        // 2. Kan-rabtou l-ListView m3a d-design
        ListView lv = findViewById(R.id.my_gourmet_list);

        // 3. Kan-jbdou l-lista kamla mn l-Service
        List<Produit> pizzas = ProduitService.getInstance().getAllItems();

        // 4. Kan-3tiw l-lista l-Adapter bach y-rassamha f l-ecran
        lv.setAdapter(new PizzaAdapter(this, pizzas));

        // 5. Mli kay-wrek l-user 3la pizza, kan-dih l-page dyal Details
        lv.setOnItemClickListener((parent, view, pos, id) -> {
            Intent it = new Intent(this, PizzaDetailActivity.class);
            // Kan-siftou l-ID dyal l-pizza li t-cliquat
            it.putExtra("pizza_id", pizzas.get(pos).getId());
            startActivity(it);
        });
    }
}
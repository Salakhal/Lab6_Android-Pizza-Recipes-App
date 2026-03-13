package com.example.pizzarecipes.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

public class PizzaDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        // 1. Linking Views
        ImageView imgPizza = findViewById(R.id.detail_img);
        TextView tvTitle = findViewById(R.id.detail_title);
        TextView tvIngredients = findViewById(R.id.detail_ingredients);
        TextView tvTime = findViewById(R.id.detail_time); // T-akkdi blli had l-ID kayn f XML
        TextView tvDesc = findViewById(R.id.detail_description);

        // 2. Getting Data
        int id = getIntent().getIntExtra("pizza_id", -1);
        Produit p = ProduitService.getInstance().findById(id);

        // 3. Filling Data
        if (p != null) {
            imgPizza.setImageResource(p.getPhoto());
            tvTitle.setText(p.getNom());
            tvDesc.setText(p.getDescription());

            // Sta3mlt Strings simple bach ma-ydirch lik warning ktir
            String ingredientsText = "Ingrédients: " + p.getNbrIngredients();
            String timeText = "Préparation: " + p.getDuree() + " min";

            tvIngredients.setText(ingredientsText);
            tvTime.setText(timeText);
        }
    }
}
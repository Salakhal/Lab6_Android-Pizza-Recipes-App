package com.example.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private final Context ctx;
    private final List<Produit> pizzas;

    public PizzaAdapter(Context ctx, List<Produit> pizzas) {
        this.ctx = ctx;
        this.pizzas = pizzas;
    }

    @Override public int getCount() { return pizzas.size(); }
    @Override public Object getItem(int i) { return pizzas.get(i); }
    @Override public long getItemId(int i) { return pizzas.get(i).getId(); }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(ctx).inflate(R.layout.row_pizza, parent, false);
        }

        // ✅ 1. Khedmna b l-IDs jdad li drna f z-zwaq dyal row_pizza.xml
        ImageView img = convertView.findViewById(R.id.img_recipe_cover);
        TextView tvNom = convertView.findViewById(R.id.tv_recipe_title);
        TextView tvNbrPersonnes = convertView.findViewById(R.id.tv_ingredients_count);
        TextView tvDuree = convertView.findViewById(R.id.tv_preparation_time);

        Produit p = pizzas.get(pos);

        // ✅ 2. Khedmna b s-smiyat s-s7a7 dyal Produit w zedna String.valueOf bach ma-tbqach erreur setText(float)
        img.setImageResource(p.getPhoto());
        tvNom.setText(p.getNom());

        // Hna 7ttina 3adad l-mqadir (Ingredients) 7it bghaha l-prof f blass Prix
        tvNbrPersonnes.setText(String.valueOf(p.getNbrIngredients()));

        // Zdnaha " min" f l-lkher bach t-ban wa3ra (ex: 25 min)
        tvDuree.setText(p.getDuree() + " min");

        return convertView;
    }
}
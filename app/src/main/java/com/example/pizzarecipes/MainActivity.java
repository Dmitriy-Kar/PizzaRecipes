package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private GridLayoutManager layoutManager;
    private int columnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        columnCount = getResources().getInteger(R.integer.column_count);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();


        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_1,
                getResources().getString(R.string.pizza_1_title),
                getResources().getString(R.string.pizza_1_description), Utils.PIZZA_1_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_2,
                getResources().getString(R.string.pizza_2_title),
                getResources().getString(R.string.pizza_2_description), Utils.PIZZA_2_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_3,
                getResources().getString(R.string.pizza_3_title),
                getResources().getString(R.string.pizza_3_description), Utils.PIZZA_3_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_4,
                getResources().getString(R.string.pizza_4_title),
                getResources().getString(R.string.pizza_4_description), Utils.PIZZA_4_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_5,
                getResources().getString(R.string.pizza_5_title),
                getResources().getString(R.string.pizza_5_description), Utils.PIZZA_5_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_6,
                getResources().getString(R.string.pizza_6_title),
                getResources().getString(R.string.pizza_6_description), Utils.PIZZA_6_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_7,
                getResources().getString(R.string.pizza_7_title),
                getResources().getString(R.string.pizza_7_description), Utils.PIZZA_7_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_8,
                getResources().getString(R.string.pizza_8_title),
                getResources().getString(R.string.pizza_8_description), Utils.PIZZA_8_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_1,
                getResources().getString(R.string.pizza_9_title),
                getResources().getString(R.string.pizza_9_description), Utils.PIZZA_9_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_10,
                getResources().getString(R.string.pizza_10_title),
                getResources().getString(R.string.pizza_10_description), Utils.PIZZA_10_RECIPE));





        /*pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_2, Utils.PIZZA_2_TITLE, Utils.PIZZA_2_DESCRIPTION, Utils.PIZZA_2_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_3, Utils.PIZZA_3_TITLE, Utils.PIZZA_3_DESCRIPTION, Utils.PIZZA_3_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_4, Utils.PIZZA_4_TITLE, Utils.PIZZA_4_DESCRIPTION, Utils.PIZZA_4_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_5, Utils.PIZZA_5_TITLE, Utils.PIZZA_5_DESCRIPTION, Utils.PIZZA_5_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_6, Utils.PIZZA_6_TITLE, Utils.PIZZA_6_DESCRIPTION, Utils.PIZZA_6_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_7, Utils.PIZZA_7_TITLE, Utils.PIZZA_7_DESCRIPTION, Utils.PIZZA_7_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_8, Utils.PIZZA_8_TITLE, Utils.PIZZA_8_DESCRIPTION, Utils.PIZZA_8_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_9, Utils.PIZZA_9_TITLE, Utils.PIZZA_9_DESCRIPTION, Utils.PIZZA_9_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_10, Utils.PIZZA_10_TITLE, Utils.PIZZA_10_DESCRIPTION, Utils.PIZZA_10_RECIPE));
*/
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems, this);
        layoutManager = new GridLayoutManager(this, columnCount);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
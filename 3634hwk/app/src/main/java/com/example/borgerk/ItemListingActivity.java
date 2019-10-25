package com.example.borgerk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;

public class ItemListingActivity extends AppCompatActivity {
    private TextView nameTV;
    private TextView priceTV;
    private TextView descTV;
    private TextView qtyTV;
    private ImageView imageIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_listing);

        Intent intent = getIntent();

        int itemID = intent.getIntExtra("ItemID", 0);

        Item item = MenuItems.getMenuItemById(itemID);

        nameTV = findViewById(R.id.item_listing_name_tv);
        priceTV = findViewById(R.id.item_listing_price_tv);
        descTV = findViewById(R.id.item_listing_desc_tv);
        imageIV = findViewById(R.id.item_listing_image_iv);
        qtyTV = findViewById(R.id.item_listing_qty_cart_tv);
        nameTV.setText(item.getItemName());
        priceTV.setText("$" + Double.toString(item.getItemPrice()));
        descTV.setText(item.getItemDesc());
        imageIV.setImageResource(item.getImageDrawableId());
        qtyTV.setText("In Order: " + Integer.toString(item.getQuantityCart()));

    }

    public void clickincrease (View v){
        //adds quantity when button is clicked and instantly displays update
        Intent intent = getIntent();
        int itemID = intent.getIntExtra("ItemID", 0);
        Item item = MenuItems.getMenuItemById(itemID);
        item.addQuantityCart();
        qtyTV = findViewById(R.id.item_listing_qty_cart_tv);
        qtyTV.setText("In Order: " + Integer.toString(item.getQuantityCart()));
    }

    public void clickdecrease(View v) {
        //removes quantity when button is clicked and instantly displays update
        Intent intent = getIntent();
        int itemID = intent.getIntExtra("ItemID", 0);
        Item item = MenuItems.getMenuItemById(itemID);
        item.removeQuantityCart();
        qtyTV = findViewById(R.id.item_listing_qty_cart_tv);
        qtyTV.setText("In Order: " + Integer.toString(item.getQuantityCart()));

    }

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    public void backClickListing(View v){
        //return to main screen
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);


    }

}


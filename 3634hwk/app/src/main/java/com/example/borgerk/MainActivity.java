package com.example.borgerk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ItemAdapter itemAdapter = new ItemAdapter();
        itemAdapter.setData(MenuItems.getAllMenuItems());
        recyclerView.setAdapter(itemAdapter);
    }

    public void viewOrderClick(View v) {
        DecimalFormat df = new DecimalFormat("0.00");
        setContentView(R.layout.order_details);
        //order total calculated through a loop that sums the (cart quantity * item price) for all items
        double ordertotal = 0;
        int itemID = 1;
        Item firstitem = MenuItems.getMenuItemById(1);
        int numberofitems = firstitem.getNumberOfItems();
        while (itemID < numberofitems+1) {
            Item item = MenuItems.getMenuItemById(itemID);
            ordertotal = ordertotal + (item.getQuantityCart() * item.getItemPrice());
            itemID++;
        }
        TextView totalTV;
        totalTV = findViewById(R.id.order_total);
        totalTV.setText("Order Total: $" + df.format(ordertotal));

        TextView orderTV;
        orderTV = findViewById(R.id.order_items);

        String ordertext = "Items: \n\n";
        itemID = 1;

        //loop adds to string the item, quanaity and total price of all individual items
        // (only if quantity exceeds 0), then returns a new line

        while (itemID < numberofitems+1) {
            Item item = MenuItems.getMenuItemById(itemID);
            if (item.getQuantityCart() > 0) {
                double itemtotal = item.getQuantityCart() * item.getItemPrice();
                ordertext = ordertext + Integer.toString(item.getQuantityCart()) + "x "
                + item.getItemName() +" - $" + String.valueOf(df.format(itemtotal)) + "\n";
            }
            itemID++;
        }
        orderTV.setText(ordertext);

    }
    public void backClick(View v) {
        //return to main screen
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ItemAdapter itemAdapter = new ItemAdapter();
        itemAdapter.setData(MenuItems.getAllMenuItems());
        recyclerView.setAdapter(itemAdapter);
    }
}

package com.example.borgerk;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private ArrayList<Item> itemsToAdapt;

    public void setData(ArrayList<Item> itemsToAdapt) {
        this.itemsToAdapt = itemsToAdapt;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_entry, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        final Item itemAtPosition = itemsToAdapt.get(position);

        holder.nameTV.setText(itemAtPosition.getItemName());
        holder.imageIV.setImageResource(itemAtPosition.getImageDrawableId());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, ItemListingActivity.class);
                intent.putExtra("ItemID", itemAtPosition.getItemID());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemsToAdapt.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView nameTV;
        public ImageView imageIV;

        public ItemViewHolder(View v) {
            super(v);
            view = v.findViewById(R.id.view);
            nameTV = v.findViewById(R.id.item_text);
            imageIV = v.findViewById(R.id.item_image);
        }


    }
}

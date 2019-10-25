package com.example.borgerk;

public class Item {

    private int itemID;
    private String itemName;
    private String itemDesc;
    private double itemPrice;
    private int imageDrawableId;
    //quantityCart used for quantity added in order, numberofitems used in constructer to count total menu items
    private int quantityCart;
    private static int numberOfItems = 0;

    public Item(int itemID, String itemName, String itemDesc, double itemPrice, int imageDrawableId) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemPrice = itemPrice;
        this.imageDrawableId = imageDrawableId;
        quantityCart = 0;
        numberOfItems++;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

    public int getQuantityCart() {
        return quantityCart;
    }

    public void setQuantityCart(int quantityCart) {
        this.quantityCart = quantityCart;
    }

    public void addQuantityCart() { quantityCart++; }

    //cannot remove quantity to less than 0

    public void removeQuantityCart() {
        if (quantityCart > 0)
        quantityCart = quantityCart - 1;
    }

    public int getNumberOfItems() {return numberOfItems;}
}

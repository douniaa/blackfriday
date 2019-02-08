package com.indev.blackfriday;

public class Product {

    private String name;
    private int price;
    private int quantity;
    private int restquantity;
    private int saledTotal;

    public Product(int productQuantity ,String productName ,int productPrice){
        name= productName;
        price=productPrice;
        quantity =productQuantity;
        restquantity=productQuantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public int getRestquantity() {
        return restquantity;
    }

    public int getSaledTotal() {
        return saledTotal;
    }

    public int sales5product(){
        int result=0;
        if(quantity%5==0){
            result = 5 * price;
            result = result + (result * 20/100);

            restquantity=restquantity-5;
        }
        saledTotal += result;
        return result;
    }



}

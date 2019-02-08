package com.indev.blackfriday;
import java.util.*;
public class Stock {
    ArrayList<Product> Products;


    public Stock(){
        Products = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        Products.add(product);
    }

    public int getAll() {
        int result=0;
        int diffrence=0;
        for(Product produit : Products){

            diffrence = produit.getQuantity() - produit.getRestquantity();

            if(diffrence != 0){
                result = result+ produit.getSaledTotal();
                result= result+ (produit.getRestquantity() * produit.getPrice());

            }else{
                result = result + (produit.getPrice() * produit.getQuantity()) ;
            }
    }
        return  result;
    }

    public int salesone(String name){
        int result=0;
        for(Product produit : Products){
            if(produit.getName().equals(name)){
              result =  produit.sales5product();
            }
        }
        return  result;
    }

}

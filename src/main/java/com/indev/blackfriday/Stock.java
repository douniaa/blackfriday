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

                result= result + (produit.getRestquantity() * produit.getPrice());
                System.out.println("result 1 "+produit.getRestquantity());
            }else{
                System.out.println("result 2 "+result);
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
        if(result == -1){
            throw new RuntimeException();
        }
        return  result;
    }
    public String saleshistory(){
        String result ="";
        for (Product p : Products){
            result=result+p.History();
        }
        return  result;
    }
    public void blackfriday(){
        for (Product p : Products){
            p.setSalenum(10);
        }

    }

}

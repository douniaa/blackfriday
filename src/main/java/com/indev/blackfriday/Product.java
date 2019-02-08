package com.indev.blackfriday;

public class Product {

    private String name;
    private int price;
    private int quantity;
    private int restquantity;
    private int saledTotal;
    private String salesHistory;
    private int salenum=5;
    private int salespercent=20;

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

    public void setSalenum(int salenum) {
        this.salenum = salenum;
    }

    public int sales5product(){
        int result=0;System.out.println(salenum);

        if(quantity%salenum==0 && restquantity!=0){

            if(salenum==10){
                salespercent=10;

            }
            result = salenum * price;
            result = result + (result * salespercent/100);

            restquantity=restquantity-salenum;
        }else {
            return -1;
        }
        saledTotal += result;
        return result;
    }
    public String History(){
        int salesnum = quantity - restquantity;
        salesHistory = salesnum+":"+name+"s";
        return salesHistory;
    }



}

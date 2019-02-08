package com.indev.blackfriday;

public class Company {

    private Stock stock;
    public Company(){
        stock = new Stock();
    }
    public float sells(String capsule) {
        return stock.salesone(capsule);
    }

    public void stock(int quantity, String name, int price) {

        stock.addProduct(new Product(quantity,name,price));

    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
       return stock.getAll();
    }

    public  Company blackFriday() {
            stock.blackfriday();
            return this;
    }

    public String salesHistory() {

        return stock.saleshistory();
    }
}

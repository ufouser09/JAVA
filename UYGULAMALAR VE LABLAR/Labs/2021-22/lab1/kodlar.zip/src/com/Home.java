package com;

public abstract class Home {
    private double price;
    private String location;


    public Home(double price,String location){
        this.price=price;
        this.location=location;
    }
    public abstract double discountedPrice();
    public double getPrice(){
        return price;
    }
    public void setprice(double price){
        this.price=price;
    }
    public String getLocation(){
        return location;
    }
    public void setlocation(String location){
        this.location=location;
    }

}

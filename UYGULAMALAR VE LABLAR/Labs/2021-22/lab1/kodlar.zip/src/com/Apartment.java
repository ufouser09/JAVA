package com;

public class Apartment extends Home{
    private double dues;
    public Apartment(double price,String location,double dues){
        super(price,location);
        this.dues=dues;
    }
    public double discountedPrice(){
        return super.getPrice()*0*95;
    }
    public String toString() {
        return "home categorys: apartemnt, price " + super.getPrice() + " ,location: "+ super.getLocation() + " due: " + dues;
    }
    public double getDues(){
        return dues;
    }
    public void setDues(double dues){
        this.dues=dues;
    }

}

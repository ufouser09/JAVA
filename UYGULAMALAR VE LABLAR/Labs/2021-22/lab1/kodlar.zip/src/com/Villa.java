package com;

public class Villa extends Home {
    public Villa(double price,String location){
        super(price,location);
    }
    public double discountedPrice(){
        return super.getPrice()*0.90;
    }
    public String toString() {
        return "Home's category's: Villa, Ucreti " + super.getPrice() + " ,Location: "+ super.getLocation() ;
    }
}

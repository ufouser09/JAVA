package com;

public class EstateAgent {
    private String name;
    private Home[] h;
    public EstateAgent() {
        h=new Home[7];
    }
    public void hasHome(Home home) {
        for(int i=0;i<7;i++) {
            if(h[i]==null) {
                h[i]=home;
                break;
            }
        }

    }
    public void listHome(){
        System.out.println("home is here:");
        for(int i=0;i<7;i++) {
            if(h[i]!=null)
                System.out.println(h[i]);
        }

    }
    public void sellHome(Home home,Customer cust){
        for(int i=0;i<7;i++) {
            if(h[i]==home) {
                cust.buyHome(home);
                h[i]=null;
                break;
            }
        }


    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

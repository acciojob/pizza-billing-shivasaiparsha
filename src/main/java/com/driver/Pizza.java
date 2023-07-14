package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

     private int extratoppingsprice;
     private int extracheesprice;
     private boolean  cheesadded;
     private boolean toppingsadded;
     private int baseprice;
     boolean billgenarated;

     private int bagprice;
     private boolean bagadded;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
           this.extracheesprice=80;
           this.cheesadded=false;
           this.toppingsadded=false;
           this.bagprice=20;
           this.bagadded=false;
           this.billgenarated=false;
           if(this.isVeg==true)
           {
               this.baseprice=300;
               this.extratoppingsprice=70;
           }
           else
           {
               this.baseprice=400;
               this.extratoppingsprice=120;
           }

           this.price=baseprice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.cheesadded==false)
        {
            this.price+=this.extracheesprice;
            this.cheesadded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.toppingsadded==false)
        {
            this.price+=this.extratoppingsprice;
            this.toppingsadded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(this.bagadded==false) {
            this.price += this.bagprice;
            this.bagadded=true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill="Base Price Of The Pizza: "+this.baseprice+"\n";
       if(this.billgenarated==false)
       {
           if (this.cheesadded == true) {
               this.bill += "Extra Cheese Added: " + this.extracheesprice + "\n";
           }

           if (this.toppingsadded == true) {
               this.bill += "Extra Toppings Added: " + this.extratoppingsprice + "\n";
           }

           if (this.bagadded == true) {
               this.bill += "Paperbag Added: " + this.bagprice + "\n";
           }

            this.bill += "Total Price: "+this.price+"\n";
          this. billgenarated=true;
       }
        return this.bill;
    }
}

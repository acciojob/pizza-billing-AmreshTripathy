package com.driver;

public class Pizza {

    private int price;
    private int totalPrice;
    private Boolean isVeg;
    private Boolean isExtraCheeseAdded;
    private Boolean isExtraToppingsAdded;
    private Boolean isTakewayAdded;
    private String bill;

    public Pizza(Boolean isVeg) {
        // your code goes here
        this.isVeg = isVeg;
        if (this.isVeg)
            this.price = 300;
        else
            this.price = 400;

        this.bill = "";
        this.bill += "Base Price Of The Pizza: " + this.price + "\n";

        this.totalPrice += this.price;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isTakewayAdded = false;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!this.isExtraCheeseAdded && !this.isExtraToppingsAdded) {
            this.isExtraCheeseAdded = true;
            this.bill += "Extra Cheese Added: " + 80 + "\n";
            this.totalPrice += 80;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!this.isExtraToppingsAdded) {
            this.isExtraToppingsAdded = true;
            if (this.isVeg) {
                this.totalPrice += 70;
                this.bill += "Extra Toppings Added: " + 70 + "\n";
            } else {
                this.totalPrice += 120;
                this.bill += "Extra Toppings Added: " + 120 + "\n";
            }
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (!this.isTakewayAdded) {
            this.isTakewayAdded = true;
            this.bill += "Paperbag Added: " + 20 + "\n";
            this.totalPrice += 20;
        }
    }

    public String getBill() {
        // your code goes here
        this.bill += "Total Price: " + this.totalPrice + "\n";
        return this.bill;
    }
}

package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean isExtraCheeseAdded;
    private Boolean isExtraToppingsAddedVeg;
    private Boolean isExtraToppingsAddedNonVeg;
    private Boolean isTakewayAdded;
    private String bill;

    public Pizza(Boolean isVeg) {
        // your code goes here
        this.price = 0;
        this.isVeg = isVeg;
        this.bill = "";
        if (this.isVeg) {
            this.price += 300;
            this.bill += "Base Price Of The Pizza: " + 300 + "\n";
        } else {
            this.price += 400;
            this.bill += "Base Price Of The Pizza: " + 400 + "\n";
        }

        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAddedVeg = false;
        this.isExtraToppingsAddedNonVeg = false;
        this.isTakewayAdded = false;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!this.isExtraCheeseAdded && !this.isExtraToppingsAddedVeg && !isExtraToppingsAddedNonVeg) {
            this.isExtraCheeseAdded = true;
            this.bill += "Extra Cheese Added: " + 80 + "\n";
            this.price += 80;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!this.isExtraToppingsAddedVeg && this.isVeg) {
            this.isExtraToppingsAddedVeg = true;
            this.isExtraCheeseAdded = true;
            this.price += 70;
            this.bill += "Extra Toppings Added: " + 70 + "\n";
        } else if (!this.isExtraToppingsAddedNonVeg && !this.isVeg){
            this.isExtraToppingsAddedNonVeg = true;
            this.isExtraCheeseAdded = true;
            this.price += 120;
            this.bill += "Extra Toppings Added: " + 120 + "\n";
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (!this.isTakewayAdded) {
            this.isTakewayAdded = true;
            this.bill += "Paperbag Added: " + 20 + "\n";
            this.price += 20;
        }
    }

    public String getBill() {
        // your code goes here
        this.bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}

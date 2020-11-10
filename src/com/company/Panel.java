package com.company;

public abstract class Panel {

    private int quantity;
    private int Price;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(){
        this.Price = quantity*2;
    }

    @Override
    public String toString(){
        return String.format("Total price is %d" ,Price);
    }

}

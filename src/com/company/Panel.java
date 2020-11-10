package com.company;

public abstract class Panel {

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalValue(){
        return 2*quantity;
    }

    @Override
    public String toString(){
        return String.format("Total price is : %d", getTotalValue());
    }


}

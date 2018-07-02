package Stalls;

import ThemeParkControl.Visitor;

public class IceCreamStall extends Stall implements Interfaces.IControl, Interfaces.ITicketed {

    public IceCreamStall(String name, String owner, String spot){
        super(name, owner, spot);
    }


    public void controlReport() {

    }


    public double defaultPrice() {
        return 2.8;
    }



    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}


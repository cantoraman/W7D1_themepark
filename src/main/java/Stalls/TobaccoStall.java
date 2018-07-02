package Stalls;

import ThemeParkControl.Visitor;

public class TobaccoStall extends Stall implements Interfaces.IControl, Interfaces.ITicketed {
    public TobaccoStall(String name, String owner, String spot) {
        super(name, owner, spot);
    }


    public void controlReport() {

    }


    public double defaultPrice() {
        return 6.6;
    }


    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}

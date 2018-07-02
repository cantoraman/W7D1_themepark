package Stalls;

import ThemeParkControl.Visitor;

public class CandyFlossStall extends Stall implements Interfaces.IControl, Interfaces.ITicketed {

    public CandyFlossStall(String name, String owner, String spot){
        super(name, owner, spot);
    }


    public void controlReport() {

    }



    public double defaultPrice() {
        return 4.20;
    }



    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}

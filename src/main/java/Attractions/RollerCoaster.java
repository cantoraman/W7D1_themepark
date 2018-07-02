package Attractions;

import ThemeParkControl.Visitor;

public class RollerCoaster extends Attraction implements Interfaces.IControl, Interfaces.ITicketed {

    public RollerCoaster(String name){
        super(name);
    }



    public void controlReport() {

    }



    public double defaultPrice() {
        return 8.4;
    }


    public double priceFor(Visitor visitor) {
        if (visitor.getHeight()>=200)
        return defaultPrice()*2;

        return defaultPrice();
    }
}

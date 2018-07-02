package Attractions;

import ThemeParkControl.Visitor;

public class Dodgems extends Attraction implements Interfaces.IControl, Interfaces.ITicketed {

    public Dodgems(String name){
        super(name);
    }


    public void controlReport() {

    }



    public double defaultPrice() {
        return 4.5;
    }


    public double priceFor(Visitor visitor) {

        if (visitor.getAge()<12)
        return defaultPrice()/2;

        return defaultPrice();
    }
}

package Attractions;

import ThemeParkControl.Visitor;

public class RollerCoaster extends Attraction implements Interfaces.IControl, Interfaces.ITicketed, Interfaces.ISecurity {

    public RollerCoaster(String name){
        super(name);
    }



    public void controlReport() {

    }



    public double defaultPrice() {
        return 8.4;
    }


    public double priceFor(Visitor visitor) {
        if (visitor.getHeight()>=2.00)
        return defaultPrice()*2;

        return defaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge()>12 && visitor.getHeight()>1.45)
        return true;

        return false;
    }
}

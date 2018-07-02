package Attractions;

import ThemeParkControl.Visitor;

public class Playground extends Attraction implements Interfaces.IControl, Interfaces.ISecurity {

    public Playground(String name){
        super(name);
    }



    public void controlReport() {

    }


    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge()>15)
        return false;

        return true;
    }
}

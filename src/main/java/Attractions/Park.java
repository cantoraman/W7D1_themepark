package Attractions;


import Interfaces.IControl;
import Interfaces.IReviewed;

import java.util.Collection;

public class Park extends Attraction implements IControl, Collection<IReviewed> {

    public Park(String name){
        super(name);
    }

    public void controlReport(){

    }
}

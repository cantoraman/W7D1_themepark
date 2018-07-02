import Attractions.*;
import Stalls.*;
import ThemeParkControl.ThemePark;
import ThemeParkControl.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestThemePark {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;

    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setup(){
        themePark = new ThemePark("Dreamland");
        dodgems = new Dodgems("Carmageddon");
        visitor1 = new Visitor("Can", 33, 1.78, 100);
        visitor2 = new Visitor("Doruk", 10, 1.10, 100);

    }

    @Test
    public void canGetName_dodgems(){
        assertEquals("Carmageddon", dodgems.getName());
    }

    @Test
    public void canVisitorVisit(){
        themePark.visit(visitor1, dodgems);
        assertEquals(95.5, visitor1.getMoney(), 0);
    }

//    @Test
//    public void canRideRollerCoaster__tall(){
//
//        assertEquals(90, visitor1.getMoney());
//    }

}

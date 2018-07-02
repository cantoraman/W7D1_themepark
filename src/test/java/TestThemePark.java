import Attractions.*;
import Stalls.*;
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

    Visitor visitor;

    @Before
    public void setup(){
        themePark = new ThemePark("Dreamland");
        dodgems = new Dodgems("Carmageddon");
    }

    @Test
    public void canGetName_dodgems(){
        assertEquals("Carmageddon", dodgems.getName());
    }




}

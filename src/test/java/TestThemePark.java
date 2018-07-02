import Attractions.*;
import Interfaces.IReviewed;
import Stalls.*;
import ThemeParkControl.ThemePark;
import ThemeParkControl.Visitor;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
        park = new Park("Adventure Park");
        playground = new Playground("Green Castle");
        rollerCoaster = new RollerCoaster("Space Mountain");
        candyFlossStall = new CandyFlossStall("Cotton Dream", "Randall Flagg", "E01");
        iceCreamStall = new IceCreamStall("Frozen Dream", "Annie Wilkes", "E02");
        tobaccoStall = new TobaccoStall("Smoky Dream", "Jack Torrence", "E03");
        themePark.addReviewed(dodgems);
        // big question, how can I manually add these to reviewed list??

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




}

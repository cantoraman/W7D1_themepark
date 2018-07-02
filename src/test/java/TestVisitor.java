import Attractions.*;
import Stalls.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestVisitor {


    Visitor visitor;

    @Before
    public void setup(){
       visitor = new Visitor("Can", 25, 1.78, 100);

    }

}

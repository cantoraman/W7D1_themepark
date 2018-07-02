package ThemeParkControl;
import Interfaces.IControl;
import Interfaces.ITicketed;
import Stalls.CandyFlossStall;

import java.util.ArrayList;

public class ThemePark {

    private String name;

    private ArrayList<IControl> operationList;


    public ThemePark(String name) {
        this.name = name;
    }

    public void visit(Visitor visitor, ITicketed ticketed) {
        visitor.subtractMoney(ticketed.priceFor(visitor));
    }
}

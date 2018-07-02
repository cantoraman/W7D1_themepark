package ThemeParkControl;
import Interfaces.IControl;
import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Stalls.CandyFlossStall;

import java.util.ArrayList;

public class ThemePark {

    private String name;

    private ArrayList<IControl> operationList;
    private ArrayList<IReviewed> reviewedList;


    public ThemePark(String name) {
        this.name = name;
        this.reviewedList = new ArrayList<>();
    }

    public void visit(Visitor visitor, ITicketed ticketed) {
        visitor.subtractMoney(ticketed.priceFor(visitor));
    }

    public ArrayList<IReviewed> getAllReviewed(){

        return reviewedList;

    }

    public void addReviewed(IReviewed reviewed){
        reviewedList.add(reviewed);
    }
}

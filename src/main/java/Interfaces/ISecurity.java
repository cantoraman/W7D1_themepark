package Interfaces;

import ThemeParkControl.Visitor;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);

}

package Interfaces;

import ThemeParkControl.Visitor;

public interface ITicketed {

    double defaultPrice();
    double priceFor(Visitor visitor);
}

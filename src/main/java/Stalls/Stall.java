package Stalls;

public abstract class Stall implements Interfaces.IReviewed {

    private String name;
    private String owner;
    private String spot;
    private int rating;

    public Stall(String name, String owner, String spot){
        this.name = name;
        this.owner = owner;
        this.spot = spot;
    }



}

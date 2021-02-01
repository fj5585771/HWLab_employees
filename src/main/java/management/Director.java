package management;

import management.Manager;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNumber, String depName, double budget){
        super("Dave", "JA332233A", 100000, "Technology");
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }


}

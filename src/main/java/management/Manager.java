package management;

import staff.Employee;

public class Manager extends Employee {

    private String depName;

    public Manager(String name, String niNumber, String depName){
        super(name, niNumber, 50000);
        this.depName = depName;
    }

    public String getDepName(){
       return this.depName = depName;
    }
}

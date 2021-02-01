package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

//    getter

    public String getName(){
        return name;
    }

    public String getNiNumber(){
        return niNumber;
    }

    public double getSalary(){
        return salary;
    }

////    setter
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setNiNumber(int niNumber){
//        this.niNumber = niNumber;
//    }
//
//    public void setSalary(double salary){
//        this.salary = salary;
//    }

    public double raiseSalary(){
       return this.salary += 10000;
    }

    public double payBonus(){
        return this.salary *= 1.15;
    }

}

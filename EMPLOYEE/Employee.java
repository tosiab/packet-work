package EMPLOYEE;
public class Employee {
    private double salary;
    public Employee(double s){
        salary = s;
    }
    public double increase(double ss){
        if(ss>=0){
            salary = salary + ss;
        }
        return ss;
    }
    public double getPay(){
        double Pay = salary;
        return Pay;
    }
}

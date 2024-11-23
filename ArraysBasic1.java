

import java.util.Scanner;

public class EmployeeLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id for employee 1");
        int id1= sc.nextInt();
        System.out.println("Enter age for employee 1");
        float age1 = sc.nextFloat();
        System.out.println("Enter id for employee 2");
        int id2= sc.nextInt();
        System.out.println("Enter age for employee 2");
        float age2 = sc.nextFloat();
        Employee e1 = new Employee(id1,age1);
        Employee e2 = new Employee(id2,age2);
        Employee[] err = new Employee[2];
        err[0] = e1;
        err[1] = e2;

        System.out.println("Printing details for all the employees");
        for( Employee er  : err){
            System.out.println(er.getAge() + " " + er.getID());
        }


    }
}
//  



public class Employee {

    private int id;
    private float age;
    public Employee(int id, float age){
        this.id = id;
        this.age=age;
    }
    public float getAge(){
        return this.age;
    }
    public int getID(){
        return this.id;
    }
}





package OJ;

import java.util.Stack;

class Employee {
    public int age;
}

public class test{
    //System.out.println();

    public static void main(String[] args) {
        Employee em = new Employee();
        em.age = 100;
        System.out.println(em.age);
        changeEmployee(em);
        System.out.println(em.age);
        Stack<String> test = new Stack<>();
        for(String item : test){
            System.out.println(item);
        }
    }

    public static void changeEmployee(Employee em){
        em = new Employee();
        em.age = 1000;
    }
}

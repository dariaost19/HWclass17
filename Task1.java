package Homework14;

public class Task1 {
   // Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.
    String name;
    String lastname;
    int age;
    Task1(String name1,String lastname1,int age1){
     name=name1;
     lastname=lastname1;
     age=age1;


    }

    Task1(){

    }
    void printInfo(){
     System.out.println("Name: "+name +" , LastName : "+lastname+" , age " +age);
    }
}

package Homework14;

public class StudentInfo {
    ////5) Write a Student class   that have instance variables name and address.
    //    // Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.

    String name;
    String address;

    StudentInfo(String Name,String Address){
        name=Name;
        address=Address;



    }
    void displayInfo(){
        System.out.println("Student name is "+name +" and address is : "+ address);

    }
}

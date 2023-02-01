package Homework14;

public class Student {
    //2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.
  String name;
  int grade1;
  int grade2;
  int grade3;
  int AverageGrade;
  Student (String Name,int Grade1, int Grade2,int Grade3){
      name=Name;
      grade1=Grade1;
      grade2=Grade2;
      grade3=Grade3;
      AverageGrade=(Grade1+Grade2+Grade3)/3;

  }
  void  PrintStudent(){
      System.out.println("Average grade is :"+AverageGrade);

  }
}

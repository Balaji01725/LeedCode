package LeedCodeProblem.Array;
class student{
    int rollno;
    String name;
    int age;
}
public class objectOfAnArray {
    public static void main(String[] args) {

        student s1 = new student();
        s1.rollno = 1;
        s1.name = "balaji";
        s1.age = 20;

        student s2 = new student();
        s2.rollno = 2;
        s2.name = "john";
        s2.age = 21;

        student s3 = new student();
        s3.rollno = 3;
        s3.name = "ranga";
        s3.age = 22;

        student[] students = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //for (int i = 0; i < students.length; i++) {
         //   System.out.println(students[i].name +" : "+students[i].age+ ":" +students[i].rollno);
        for( student std:students){
            System.out.println(std.name+":"+std.age);
        }
    }
}

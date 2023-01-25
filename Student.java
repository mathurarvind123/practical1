class Student1
{  
int slno;       
String name;
}
class Student
{
public static void main(String[] args){  // method of Student class

Student1 s = new Student1();   // creating a object
s.slno= 01;
s.name= "Arvind";
System.out.println(s.slno);
System.out.println(s.name);

s.slno= 02;
s.name= "mathur";
System.out.println(s.slno);
System.out.println(s.name);
}
}
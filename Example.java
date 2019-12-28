import java.util.*;

class myException extends Exception                    //exception class
{
  myException(String s)
   {
      super(s);
   }
}
public class Example extends ex                                   //Launcher class
{


  public static void main(String[] args)
 {

   try                                                  //try block to chk exception
    { 
  
    Scanner s=new Scanner(System.in);

       System.out.println("Enter details of 1st student ");

       System.out.println("Enter name");

      String a1=s.next();
       System.out.println("Enter rollno");

       int a2=s.nextInt();

        if(a2<100 || a2>1000 )                           //chking for exception in rollno
         { 
           throw new myException(" ");

         }  
       System.out.println("Enter age");

      int a3=s.nextInt();

        if(a3>20  || a3<4)                                       //chking for exception in age
         {
           throw new myException(" ");      
         }
       System.out.println("Enter details of 2nd student");

       System.out.println("Enter name");

      String a4=s.next();

       System.out.println("Enter rollno");

       int a5=s.nextInt();

        if(a5<100 || a5>1000 )                          //chking for exception in rollno
         {
           throw new myException(" ");

         }
       System.out.println("Enter age");

     int a6=s.nextInt();
 
        if(a6>20 || a6<4)                                        //chking for exception in age
         {
            throw new myException(" ");

         }
     Student s1=new Student(a1,a2,a3);
     Student s2=new Student(a4,a5,a6);
   
       System.out.println(
s1.equals(s2));
   
    }

  catch(myException ex)                                   //exception handled
  { 
    System.out.println("wrong input");
  }

 }	
    
}
 class Student                                               //utility class
 {


   private String name;
 
   private int rollno;
   
   private int age;

       
   public Student(String name, int rollno, int age)                 //constructor
    { 
           
       this.name = name;
    
       this.rollno = rollno;
  
       this.age = age;
 
    }

    
   public boolean equals(Object o)                                  //equals method overridden
    {
         
       
      if (o == null || getClass() != o.getClass()) 
      { 
      
       return false;
   
      }
          
   Student s1 = (Student) o;
   
         return rollno == s1.rollno &&
 age == s1.age &&
 name.equals(s1.name);
       
    }
  
 }

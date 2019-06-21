import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @ interface TestAnnotation
{
    String Developer() default "Rahul";
    String Expirydate();
}
public class Anotation
{
    @TestAnnotation(Developer="data", Expirydate="01-10-2020")
    void fun1()
    {
        System.out.println("Test method 1");
    }
    @TestAnnotation(Developer="fair", Expirydate="01-10-2020")
    void fun2()
    {
        System.out.println("Test method 2");
    }
    public static void main(String args[])
    {
        System.out.println("Hello");
    }
}

/*
    SuppressWarnings Annotation
*/

// class DeprecatedTest
//  {
//     @Deprecated
//     public void Display()
//      {
//         System.out.println("Deprecatedtest display()");
//      }
//  }
// public class Anotation
//  {   
//     @SuppressWarnings({"checked", "deprecation"})
//      public static void main(String args[])
//      {
//          DeprecatedTest d1 = new DeprecatedTest();
//          d1.Display();
//       }
//   }

/*
    Override Annotation
*/

// class Base
// {
//      public void Display()
//      {
//          System.out.println("Base display()");
//      }     
//      public static void main(String args[])
//      {
//          Base t1 = new Anotation();
//          t1.Display();
//      }    
// }
// class Anotation extends Base
// {
//      @Override
//      public void Display()
//      {
//          System.out.println("Derived display()");
//      }
// }

// class Anotation extends Base
// {
//      //@Override
//      public void display(int x)
//      {
//          System.out.println("Derived display(int )");
//      }
//      public static void main(String args[])
//      {
//          Anotation obj = new Anotation();
//          obj.display();
//      }
// }

// public class Anotation {
    
//     private String name;
//     private int id;
    
//     /**
//      *  Constructor
//      **/
//     public Anotation() {
//         name = "Java Passion!";
//     }
    
//     public String getName() {
//         return name;
//     }
    
//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }
    
//     /**
//      *  Test of equals method overriding vs. overloading
//      *  For exercise 1 change this method
//      **/
//    @Override
//     public boolean equals(Object otherName) {
//         String newName = (String) otherName;
//         int comparison = name.compareTo(newName);
        
//         return (comparison == 0);
//     }
    

//     public static void main(String[] args) {
//         // TODO code application logic here
//     }
    
// }
/*
    Depreccated Annotation
*/

// public class Anotation
// {
//     @Deprecated
//     public void Display()
//     {
//         System.out.println("Deprecatedtest display()");
//     }
//    public static void main(String args[])
//     {
//         Anotation d1 = new Anotation();
//         d1.Display();
//     }
// }
// class Base
// {
//      public void display()
//      {
//          System.out.println("Base display()");
//      }
// }

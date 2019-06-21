// A Simple Java program to show working of user defined 
// Generic functions 

// We don't need to typecast individual members of ArrayList 
import java.util.*; 

public class Generic 
{ 
    public static void main(String[] args) 
    { 
        // Creating a an ArrayList with String specified 
        ArrayList <String> al = new ArrayList<> (); 

        al.add("Sachin"); 
        al.add("Rahul"); 

        // Typecasting is not needed 
        String s1 = al.get(0); 
        String s2 = al.get(1); 

        System.out.println(al);

  
        ArrayList <Integer> a = new ArrayList<> ();
        a.add(6);
        int i1 = a.get(0); 
        System.out.println(i1);   
    } 
} 


// class Generic 
// { 
//     // A Generic method example 
//     static <T> void genericDisplay (T element) 
//     { 
//         System.out.println(element.getClass().getName() + 
//                         " = " + element); 
//     } 

//     // Driver method 
//     public static void main(String[] args) 
//     { 
//         // Calling generic method with Integer argument 
//         genericDisplay(11); 

//         // Calling generic method with String argument 
//         genericDisplay("GeeksForGeeks"); 

//         // Calling generic method with double argument 
//         genericDisplay(1.0); 
//     } 
// }

// class Test<T, U> 
// { 
//     T obj1; // An object of type T 
//     U obj2; // An object of type U 

//     // constructor 
//     Test(T obj1, U obj2) 
//     { 
//         this.obj1 = obj1; 
//         this.obj2 = obj2; 
//     } 

//     // To print objects of T and U 
//     public void print() 
//     { 
//         System.out.println(obj1); 
//         System.out.println(obj2); 
//     } 
// } 

// // Driver class to test above 
// class Generic 
// { 
//     public static void main (String[] args) 
//     { 
//         Test <String, Integer> obj = new Test<String, Integer>("GfG", 15); 

//         obj.print();
//         Test <Integer , Integer> obj2 = new Test<Integer ,Integer>(5,5);
//         obj2.print();
//     } 
// }

// class Test<T> 
// { 
//     // An object of type T is declared 
//     T obj; 
//     Test(T obj) {  
//     	this.obj = obj;  
//     }  // constructor 
//     public T getObject() {
//      	return this.obj;
//     } 
// } 

// public class Generic{
// 	 public static void main (String[] args) { 
//         // instance of Integer type 
//         Test <Integer> iObj = new Test<Integer>(15); 
//         System.out.println(iObj.getObject()); 
//         Double a = iObj.getObject() + 10.88;
//         System.out.println(a);
//         // instance of String type 
//         Test <String> sObj = new Test<String>("GeeksForGeeks"); 
//         System.out.println(sObj.getObject() + iObj.getObject()); 

//     } 
// }
import java.io.*; 
import java.util.*; 
  
class Student { 
  
    // attributes of Student class 
    String name = null; 
    int id = 0; 
  
    // default constructor 
    Student() {} 
  
    // parameterized constructor 
    Student(String name, int id) 
    { 
        this.name = name; 
        this.id = id; 
    }
    public String getName(){
    return name;
    // Overriding clone() method 
    }
    public int getId(){
        return id;
    }

} 

public class NormalStudent{
    public static void main(String[] args) 
    { 
        // create an instance of Student 
        Student s1 = new Student("Ahmad", 121);
  
        // Try to clone s1 and assign 
        // the new object to s2 
        Student s2 = s1.clone(); 
    } 
}
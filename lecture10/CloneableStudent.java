import java.io.*; 
import java.util.*; 
  
class CStudent implements Cloneable { 
  
    // attributes of Student class 
    String name = null; 
    int id = 0; 
  
    // default constructor 
    CStudent() {} 
  
    // parameterized constructor 
    CStudent(String name, int id) 
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

    // by simply calling Object class 
    // clone() method. 
    @Override
    protected Object clone() 
        throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 

}
    public class CloneableStudent{
        public static void main(String[] args) throws CloneNotSupportedException 
        { 
            // create an instance of Student 
            CStudent s1 = new CStudent("Sameer", 1588748); 
  
            // Try to clone s1 and assign 
            // the new object to s2 
            CStudent s2 = (CStudent)s1.clone(); 
            System.out.println(s2.getName());
            System.out.println(s2.getId());
    } 
}
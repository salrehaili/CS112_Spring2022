public class test_apple{
    public static void main(String[] args){
        Apple a =new Apple();
        // a.p(5.1);
        System.out.println(a.toString());
    }
}



class Apple extends Fruit {
    public Apple(){
         System.out.println("Apple");
    }
    public void p(double a){
        System.out.println(a+6);
    }

    public String toString(){
        return "This is an  object";
    }
}




class Fruit{
    public Fruit(){
        System.out.println("Fruit");
    }
    public Fruit(String name) {
        System.out.println("Fruit's constructor is invoked");
    }
    public void p(int a){
        System.out.println(a);
    }
}








// 1- Constructor Chaining
// 2- Overriding
// 3- Overloading
// 4- using the keyword super
// 5- all classes are supclasess of the class Object

























// Write a program to show that constructor of a superclass is invoked before the constructor of the subclass, use the following classes:
// A is a class
// B is subclass of A
// C is subclass of B


//in this example the constructor of the C will invoke the constructor of B, and B will invoke the constructor of A





// class test for the main method
// class1
// class2 is subclass of class1
// class3 is subclass of class2
// class4 is subclass of class3
// class5 is subclass of class4


// object from class5

























// class test{
//     public static void main(String[] args){
//         new class5();
//     }
// }

// class class5 extends class4{
//     class5(){
//         System.out.println("This is class5");
//     }
// }

// class class4 extends class3{

//}
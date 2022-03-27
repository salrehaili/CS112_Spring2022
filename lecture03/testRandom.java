/*
 * Spring 2022
 * CS112-Programming II
 * Dr. Sameer M. Alrehaili
*/
//Using Random class
/*
This code showd how to generate 5 random numbers between 0 and 50.
*/
import java.util.Random;
class testRandom{
    public static void main(String[] args){
        Random r = new Random(5);
        for(int i=0;i<5;i++)
            System.out.println(r.nextInt(50));
    }
}
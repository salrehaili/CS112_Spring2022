/*
 * Spring 2022
 * CS112-Programming II
 * Dr. Sameer M. Alrehaili
*/
//Visibility Modifiers
/*
You can change the class modifier to test the 
accessibility from outside classes C2 and C3
*/
package CS112.lect04.p1;
public class C1{
	int x=1;
	private int y=2;
	public int z=3;

	String m1(){
		return "m1";
	}
	private String m2(){
		return "m2";
	}
	public String m3(){
		return "m3";
	}
}
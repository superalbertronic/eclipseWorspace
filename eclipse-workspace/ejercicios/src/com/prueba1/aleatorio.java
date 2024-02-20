package com.prueba1;
import java.util.*;
public class aleatorio {
	
	public static void main (String[] args) {
		
		double d_val = Math.random()*80;
		int valor=(int) d_val;
        System.out.println("Value in double: "+ d_val);
        int i_val = (int) Math.round(d_val);
        System.out.println("Value in int: "+i_val);
        System.out.println("Value in int: "+valor);
		
		
		
		
	}
}

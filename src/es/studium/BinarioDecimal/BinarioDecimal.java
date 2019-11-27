package es.studium.BinarioDecimal;

import java.util.Scanner;

public class BinarioDecimal {

	public static void main(String[] args) 
	{
		int a, b, c, d, e;
		
		// creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
												
		System.out.println("Indica el valor de la primera cifra número binario");
		a = teclado.nextInt();
		
		System.out.println("Indica el valor de la segunda cifra número binario");
		b = teclado.nextInt();
		
		System.out.println("Indica el valor de la tercera cifra número binario");
		c = teclado.nextInt();
		
		System.out.println("Indica el valor de la cuarta cifra número binario");
		d = teclado.nextInt();
		
		System.out.println("Indica el valor de la quinta cifra número binario");
		e = teclado.nextInt();
		
		teclado.close();
		
		System.out.println("El número decimal equivalente es:"+funConvertir(a,b,c,d,e));

	}
	
	public static int funConvertir(int a, int b, int c, int d, int e)
	{
		return((a*16)+(b*8)+(c*4)+(d*2)+(e*1));
	}

}

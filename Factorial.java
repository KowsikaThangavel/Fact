/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=src.nextInt();
		int fact=1;
		if(num<=0)
		{
			System.out.println("Sorry negative numbers couldn't be used for factorial");
		}
		else
		{
			for(int i=1;i<=num;i++)
				fact=fact*i;
			System.out.println("The factorial of the given number is"+fact);
		}
    }
}
		




 

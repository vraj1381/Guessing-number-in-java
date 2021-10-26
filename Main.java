package com.guessnum;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int a= (int) (Math.random()*100);
        int b= 0;
        do {
            System.out.println("Guess a number (If you want to skip press -1): ");
            b=sc.nextInt();
            if(a==b){
                System.out.println("VOILA !!! YOU GUESSED IT RIGHT.");
                break;
            }
            else if (a<b){
                System.out.println("You entered a larger number, try again with a smaller one.");
            }
            else{
                System.out.println("You entered a smaller number, try again with larger one.");
            }
        }while(b>=0);
        System.out.println("My number was:" + a);
    }
}

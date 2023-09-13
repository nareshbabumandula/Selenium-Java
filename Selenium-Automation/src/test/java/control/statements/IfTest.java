package control.statements;

import java.util.Scanner;

public class IfTest {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        byte a=sc.nextByte();
        System.out.println("Enter the value of b");
        byte b=sc.nextByte();
        
        if(a>b){ // if block
            System.out.println("a is greater than b");
        }else if(a==b){
            System.out.println("a is equal to b");
        }else { // else block
            System.out.println("a is less than b");
        }

        // Enhanced if statement
        if(a>b) System.out.println("a is greater than b");

    }
}

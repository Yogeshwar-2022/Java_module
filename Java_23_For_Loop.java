/*
Syntax :
for (initialize; check_bool_expression; update){
    //code;
}
*/

import java.util.Scanner;

public class Java_23_For_Loop {
    public static void main(String[] args) {

        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        for (int i=10; i!=0; i--){
            System.out.println(i);
        }

        System.out.print("Enter number n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("First n Odd Numbers : ");
        for (int j = 0 ;j < n ; j++ ){
            System.out.println(2*j+1);
        }
        System.out.println("First n Even Numbers : ");
        for (int j = 0 ;j < n ; j++ ){
            System.out.println(2*j);
        }
    }
}


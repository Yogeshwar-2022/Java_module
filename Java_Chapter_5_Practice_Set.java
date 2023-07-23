import java.util.Scanner;

public class Java_Chapter_5_Practice_Set {
    public static void main(String[] args) {

        for(int i = 4 ; i > 0 ; i--){
            for (int j = 0 ; j < i ; j++){
                System.out.print('*');}
            System.out.print('\n');
        }

        int n___ = 10;
        int sum_e = 0;
        int p = 1;
        while (p<=n___){
            sum_e += (2*p);
            p++;
        }
        System.out.println(sum_e);

        int n = 10;
        for (int i = 1 ; i < 11 ; i++ ){
            System.out.println(n + " X " + i + " = " + n*i );
        }

        for (int i = 10 ; i > 0 ; i-- ){
            System.out.println("10" + " X " + i + " = " + 10*i );
        }


        int n_ = 10;
        int fact_f = 1 ;
        for (int i = 1 ; i <= n_ ; i++){
            fact_f = fact_f * i ;
        }
        System.out.println(fact_f);

        int i = 1;
        int fact_w = 1;
        while (i<=n){
            fact_w *= i ;
            i++;
        }
        System.out.println(fact_w);

        int a = 4;
        while (a>0){
            int b = 0;
            while (b<a){
                System.out.print("*");
                b++;
            }
            System.out.print("\n");
            a--;
        }

        // True

        int n__ = 8;
        int sum_t = 0;
        for (int j = 1 ; j < 11 ; j++ ){
            sum_t += (n__*j);
        }
        System.out.println(sum_t);

        // at least once

        int n____ = 10;
        int sum_e_ = 0;
        for(int q = 1 ; q<=n____ ; q++){
            sum_e_ += (2*q);
        }
        System.out.println(sum_e_);

    }
}

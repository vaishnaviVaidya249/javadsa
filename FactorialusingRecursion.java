import java.util.*;

public class FactorialusingRecursion {

    int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FactorialusingRecursion f=new FactorialusingRecursion();
        int value=f.fact(n);
        System.out.println(value);

    }
    
}
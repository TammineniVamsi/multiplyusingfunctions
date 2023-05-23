import java.util.*;
public class function{
    //public static void multiply(int a,int b){
        
    //}
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        multiply(a, b);


    }

    public static void multiply(int a , int b){
        int c=a*b;
        System.out.println(c);
    }
}

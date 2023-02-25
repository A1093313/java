import java.util.*;
public class A1093313_0224_1 {
    public static void main (String[]args){
        int number;
        System.out.print("請輸入一個整數:");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        if(number%2==0){
            System.out.println("您輸入的數字"+number+"為偶數");
        }
        else{
            System.out.println("您輸入的數字"+number+"為奇數");
        }
    
    }
}

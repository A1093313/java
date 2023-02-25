import java.util.*;
public class A1093313_0224_2 {
    public static void main (String[]args){
        float C,F;
        System.out.print("請輸入溫度值:");
        Scanner sc = new Scanner (System.in);
        C=sc.nextFloat();

        F=C*9/5+32;
        System.out.println("轉換後，攝氏"+C+"度為華氏"+F+"度");
    }
}

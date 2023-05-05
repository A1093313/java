import java.util.regex.*;    
import java.util.*;   

public class A1093313_0421_1{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("請輸入電子郵件地址：");
        String email = input.nextLine();

        String regx = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";  
        Pattern pattern = Pattern.compile(regx);  
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("這是一個有效的電子郵件地址。");
        } else {
            System.out.println("這不是一個有效的電子郵件地址。");
        }
    }  
}
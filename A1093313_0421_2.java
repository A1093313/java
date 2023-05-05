    import java.util.Scanner;

    public class A1093313_0421_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("請輸入日期（YYYY/MM/DD或MM/DD/YYYY格式）：");
        String dateInput = input.nextLine();

        String[] dateParts = dateInput.split("/");

        if (dateParts.length == 3) {
            // Assume YYYY/MM/DD format
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);

            System.out.println("年：" + year);
            System.out.println("月：" + month);
            System.out.println("日：" + day);
        } else if (dateParts.length == 2) {
            // Assume MM/DD/YYYY format
            int year = Integer.parseInt(dateParts[2]);
            int month = Integer.parseInt(dateParts[0]);
            int day = Integer.parseInt(dateParts[1]);

            System.out.println("年：" + year);
            System.out.println("月：" + month);
            System.out.println("日：" + day);
        } else {
            System.out.println("日期格式不正確。請使用YYYY/MM/DD或MM/DD/YYYY格式。");
        }
    }
}



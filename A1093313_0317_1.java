import java.util.Scanner;
public class A1093313_0317_1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("請輸入正整數 n：");
        int n = input.nextInt();
        System.out.print("請輸入正整數 m：");
        int m = input.nextInt();

        //  n x m 的二維陣列
        int[][] arr = new int[n][m];

        //  n x m 的值
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }

        // 用 for each 印出
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}


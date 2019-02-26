import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Mảng cho trước :");
        for ( int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + ".");
        }

        int number = 0;
        do {
            System.out.println("Nhập phần tử cần xóa :");
            number = scanner.nextInt();
            for ( int x = 0; x < arr.length; x++)
            {
                if (arr[x] == number)
                {
                    for (int i = x; i < arr.length - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    arr[arr.length-1] = 0;
                }
            }
            for ( int x = 0; x < arr.length; x++) {
                System.out.print(arr[x] + ".");
            }
        }while (number >=0);
    }
}

import java.time.Month;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        int month;
        int year;
        int choose;
        int days;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=====CHƯƠNG TRÌNH TÍNH SỐ NGÀY THEO THÁNG=====");
            System.out.println("CHỌN 1 ĐỂ SỬ DỤNG ENUM");
            System.out.println("CHỌN 2 ĐỂ KHÔNG SỬ DỤNG ENUM");
            System.out.println("CHỌN 0 ĐỂ THOÁT");
            choose = sc.nextInt();
            switch (choose) {
                case 0:
                    break;
                case 1:
                    System.out.println("MỜI BẠN NHẬP THÁNG: ");
                    month = sc.nextInt();
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            days = Month.JANUARY.maxLength();
                            System.out.println("Tháng " + month + " có " + days + " ngày");
                            break;
                        case 2:
                            days = Month.FEBRUARY.minLength();
                            System.out.println("Tháng " + month + " có " + days + " ngày");
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            days = Month.APRIL.minLength();
                            System.out.println("Tháng " + month + " có " + days + " ngày");
                            break;
                        default:
                            System.out.println("Nhập tháng không hợp lệ");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("MỜI BẠN NHẬP THÁNG: ");
                    month = sc.nextInt();
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            System.out.println("Tháng " + month + " có 31 ngày");
                            break;
                        case 2:
                            System.out.println("Tháng " + month + " có 28 ngày");
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            System.out.println("Tháng " + month + " có 30 ngày");
                            break;
                        default:
                            System.out.println("Nhập tháng không hợp lệ");
                            break;
                    }

            }


        }
        while (choose !=0 );

    }
}

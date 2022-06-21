import java.time.LocalDate;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int firstYear, firstMonth, firstDay;
        int lastYear, lastMonth, lastDay;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập mốc thời gian đầu theo định dạng năm/tháng/ngày");
            System.out.println("Năm:");
            firstYear = scanner.nextInt();
            System.out.println("Tháng:");
            firstMonth = scanner.nextInt();
            System.out.println("Ngày:");
            firstDay = scanner.nextInt();
            LocalDate localDate1 = LocalDate.of(firstYear, firstMonth, firstDay);
            String firstDate = localDate1.toString();

            System.out.println("Nhập mốc thời gian cuối theo định dạng năm/tháng/ngày");
            System.out.println("Năm:");
            firstYear = scanner.nextInt();
            System.out.println("Tháng:");
            firstMonth = scanner.nextInt();
            System.out.println("Ngày:");
            firstDay = scanner.nextInt();
            LocalDate localDate2 = LocalDate.of(firstYear, firstMonth, firstDay);
            String lastDate = localDate2.toString();

            String untilDate = "" + localDate1.datesUntil(localDate2).count();

            System.out.println("Mốc thời gian từ ngày " + firstDate + " đến ngày " + lastDate + " là " + untilDate + " ngày");


        } catch (Exception e) {
            System.out.println("Vui lòng nhập ngày đầu < ngày cuối");
        }


    }
}

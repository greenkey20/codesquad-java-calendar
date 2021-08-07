package greendev.calendar;

import java.util.Scanner;

public class Calendar_maxDays2 {
	public static void main(String[] args) {
		System.out.println("달을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		scanner.close();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d월은 %d일까지 있습니다", month, maxDays[month - 1]);
	}
}
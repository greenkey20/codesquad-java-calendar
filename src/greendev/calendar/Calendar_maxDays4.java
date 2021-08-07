package greendev.calendar;

import java.util.Scanner;

public class Calendar_maxDays4 {
	public static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth (int month) {
		return MAX_DAYS [month - 1];		
	}
	
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		Calendar_maxDays4 cal = new Calendar_maxDays4();
		System.out.println("반복 횟수를 입력하세요");
		int times = scanner1.nextInt();
					
		int i;
		for(i=0; i < times; i++) {
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("달을 입력하세요");
			int month = scanner2.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
		}
		
		scanner1.close();
	}
}

package day06_while;

public class Quiz01 {
	public static void main(String[] args) {
		int won = 1;
		for(int day=1 ; day<=30 ; day++) {
			if(day == 1) {
				won = 1;
			}else {
				won *= 2;
			}
			System.out.println(day+" : "+won);
		}
		System.out.println("30일째 예치 금액 : "+won);
	}
}

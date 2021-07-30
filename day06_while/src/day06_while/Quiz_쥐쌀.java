package day06_while;

public class Quiz_¡„Ω“ {
	public static void main(String[] args){
		int rice = 100000,mouse=2,day;

		for(day=1; rice > 0 ;day++){
			rice -=mouse * 20;
			if(day%10==0){
				mouse *= 2;
			}
		}
		day--;
		System.out.println(day+"¿œ "+mouse+"∏∂∏Æ");
	}

}

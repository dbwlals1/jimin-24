import java.util.*;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	      
	      System.out.println("숫자를 입력하세요.");
	      int num = s.nextInt();
	      int count = 0;
	      
	   if(num<=0) {
	      System.out.println("종료.");
	   }
	   else {
	      for(int i=2; i<=num; i++) {
	         
	         if(i%2 == 0 && i<3) {
	            count += 1;
	            System.out.println(i);
	         }
	         if(i % 2 == 1) {
	            if(i%3 == 0 && i>8) continue;
	            if(i%5 == 0 && i>10) continue;
	            if(i%7 == 0 && i>10) continue;
	            
	            System.out.println(i);
	            count += 1;
	         }
	   }
	      System.out.println("소수의 개수는 " + count + "개 입니다.");
	   }
	}
}
package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b14626 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    String str = br.readLine();
		int count, num;
		
		
			count = str.indexOf("*");
			int result=0;
			for(int i = 0; i<13; i++) {
				if(i==count)continue;
				num = str.charAt(i)-'0';
				if(i%2==0) {
					result += num;
				}
				else {
					result += 3*num;
				}
			}
      if (count % 2 == 0) { // 짝수 위치: 1x
      for (int i = 0; i <= 9; i++) {
        if ((result + i) % 10 == 0) {
          result = i;
          System.out.println(result);
          return;
        }
      }
    } else { // 홀수 위치: 3x
      for (int i = 0; i <= 9; i++) {
        if ((result + 3 * i) % 10 == 0) {
          result = i;
          System.out.println(result);
          return;
        }
      }
    }
		
  }
}

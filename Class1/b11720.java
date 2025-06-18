package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b11720 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    String str= br.readLine();
    int result=0;
    for(int i=0; i<count; i++){
      result += str.charAt(i)-'0';
    }
    System.out.println(result);
  }
}

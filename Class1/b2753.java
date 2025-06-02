package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2753 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt( st.nextToken());

    if((num%4==0&&num%100!=0)||num%400==0){
      System.out.println(1);
    }else{
      System.out.println(0);
    }
  }
}

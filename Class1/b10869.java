package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10869 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num1 = Integer.parseInt( st.nextToken());
    int num2 = Integer.parseInt( st.nextToken());
    System.out.printf("%d\n%d\n%d\n%d\n%d",num1+num2,num1-num2,num1*num2,num1/num2,num1%num2);
  }
}

package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b31403 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String A ,B ,D ;
    A= br.readLine();
    B= br.readLine();
    int C= Integer.parseInt(br.readLine());
    D=A+B;
    int result = Integer.parseInt(D) - C;
    int result2 = Integer.parseInt(A)+Integer.parseInt(B)-C;
    System.out.println(result2+"\n"+result);


  }

}

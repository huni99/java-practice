package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b27866 {
  public static void main(String[] args) throws Exception{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int num = Integer.parseInt(br.readLine());
    System.out.println(str.charAt(num-1));
  }
}

package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2438 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    
    for(int i=1; i<=num;i++){
      for(int j =1; j<=i ; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

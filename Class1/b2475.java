package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2475  {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum0=0;
    while (st.hasMoreTokens()) {
      int num = Integer.parseInt( st.nextToken());
      sum0+= num*num;
    }
    System.out.println(sum0%10);
  }
}

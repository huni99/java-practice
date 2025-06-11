package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10871  {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int []arr = new int[Integer.parseInt(st.nextToken())];
    int num =Integer.parseInt(st.nextToken());
    st= new StringTokenizer(br.readLine());

    StringBuilder sb = new StringBuilder();
    while (st.hasMoreTokens()) {
      int num1 = Integer.parseInt(st.nextToken());
      if(num1<num){
        sb.append(num1).append(" ");
      }
    }
    System.out.println(sb);

    
  }
}

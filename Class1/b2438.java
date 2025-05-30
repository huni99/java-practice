package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2438 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb =new StringBuilder();
    int num = Integer.parseInt(st.nextToken());
    String star ="*";
    for(int i=1; i<=num;i++){
      sb.append(star.repeat(i)).append("\n");
    
      }
      System.out.println(sb);
  }
}

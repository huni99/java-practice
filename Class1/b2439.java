package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2439 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    String n= " ";
    String star = "*";
    for(int i = num-1;  i >=0; i--){
      sb.append(n.repeat(i)).append(star.repeat(num-i)).append("\n");
    }
    System.out.println(sb);

  }
}

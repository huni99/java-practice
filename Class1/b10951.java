package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b10951 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;
    while ((str = br.readLine()) != null) {
      String[] str2 = str.split(" ");
      int a = Integer.parseInt(str2[0]);
      int b = Integer.parseInt(str2[1]);
      sb.append(a+b).append("\n");
    }
    System.out.println(sb);
  }
}

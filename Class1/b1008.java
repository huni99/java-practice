package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1008 {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    double num1 = Double.parseDouble(st.nextToken());
    double num2 = Double.parseDouble(st.nextToken());
    System.out.println(num1/num2);
  }
}

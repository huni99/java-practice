package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b9498 {
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt( st.nextToken());
    
    switch (num/10) {
      case 10:
      case 9: 
          System.out.println("A");
        break;
      case 8: 
          System.out.println("B");
        break;
      case 7: 
          System.out.println("C");
        break;
      case 6: 
          System.out.println("D");
        break;
      default:
          System.out.println("F");

        break;
    }
    }
}

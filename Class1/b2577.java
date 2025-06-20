package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2577 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int result = A*B*C;
    int[] c = new int[10];
    String r = String.valueOf(result);

    for(int i = 0; i<r.length(); i++){

      c[r.charAt(i)-'0']++;

    }
    for(int c1 : c){
      System.out.println(c1);
    }
  }
}

      // switch (r.charAt(i)) {
      //   case '0':
      //   c[0]++; 
      //     break;
      //   case '1':
      //   c[1]++; 
      //     break;
      //   case '2':
      //   c[2]++; 
      //     break;
      //   case '3':
      //   c[3]++; 
      //     break;
      //   case '4':
      //   c[4]++; 
      //     break;
      //   case '5':
      //   c[5]++; 
      //     break;
      //   case '6':
      //   c[6]++; 
      //     break;
      //   case '7':
      //   c[7]++; 
      //     break;
      //   case '8':
      //   c[8]++; 
      //     break;
      //   case '9':
      //   c[9]++; 
      //     break;
        

      
      //   default:
      //     break;
      // }
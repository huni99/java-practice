package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2884 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int H = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    if(H==0){
      if(M<45){
        H=23;
        M+=15;
      }
      else{
        M-=45;
      }
    }else{
      if(M<45){
        H-=1;
        M+=15;
      }
      else{
        M-=45;
      }

    }
    System.out.println(H+" "+M);
  }
}

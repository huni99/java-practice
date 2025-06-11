package Class1;
import java.io.*;
import java.util.StringTokenizer;
public class b10950 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num =Integer.parseInt(br.readLine());
    StringTokenizer st ;
    StringBuilder sb = new StringBuilder();
    for(int i = 0 ; i<num ; i ++){
      st = new StringTokenizer(br.readLine());
      sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
      
    }
    System.out.println(sb);


  }


  
}

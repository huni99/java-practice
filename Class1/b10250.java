package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10250 {
  public static void main(String[] args)throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    String str= null;
    StringBuilder sb = new StringBuilder();
    for(int i = 0 ; i< num; i++){

    st = new StringTokenizer(br.readLine());
    int H, W, N;
    H=Integer.parseInt(st.nextToken());
    W=Integer.parseInt(st.nextToken());
    N=Integer.parseInt(st.nextToken());

    str= String.valueOf(N%H);
    if(N/H<9){
      str+="0"+(N/H+1);

    }else{
      str+=N/H+1;
    }
    sb.append(str).append("\n");
    }
    System.out.println(sb);
  }
}

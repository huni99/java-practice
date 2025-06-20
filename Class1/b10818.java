package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b10818 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num =Integer.parseInt(br.readLine());
    int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int max=arr[0], min=arr[0] ,com;
    for(int i=0; i<num; i++){
      com=arr[i];
      if(com>max) max = com;
      if(com<min) min = com;

    }
    System.out.println(min+" "+max);
  }
}

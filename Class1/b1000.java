package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1000{
  public static void main(String[] args)  throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = br.readLine().split(" ");
    System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
    
  }

}

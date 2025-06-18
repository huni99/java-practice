package Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2562 {
  public static void main(String[] args) throws Exception{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    byte max = 0;
    byte num = 0;
    byte count = 0;
    for(byte i = 0 ; i<9; i++){
      num= Byte.parseByte(br.readLine());
      if(num>max){
        max=num;
        count= (byte)(i+1);

      }
    }
    System.out.println(max+"\n"+count);
  }
}

package stupid;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
public class Stupid {
    public static void main(String[] arg)   {        
        int result = hohoho(arg);
        System.exit(result);
    }
    public static int hohoho(String arr[]) {
        try{
            if(arr.length != 2) 
                return -1;
            String bbb,ddd= new String(Files.readAllBytes(Paths.get(arr[1]))); 
            bbb= new String(Files.readAllBytes(Paths.get(arr[0])));
            int size = bbb.length();
            if(size<4) 
                return -2;
            int RRR=0; float eee=0;
            for(int aaa=0;aaa<size-3;aaa++)
            {       
                for(int qqq=0;qqq<ddd.length()-4;qqq+=1) {
                    int vOv = 0;
                    for(int CC=0;CC<4;CC++){
                        if(bbb.charAt(aaa+CC) == ddd.charAt(qqq+CC)) 
                            vOv ++;
                    }          
            if (vOv == 4)
            {
                System.out.println("DEBUG:".concat(String.valueOf(aaa) + "," + String.valueOf(qqq)));
                RRR++; 
                eee+=1;
            }
                else           
                    ++RRR;                        
                }
            }
            System.out.println(String.valueOf(Math.round(eee)).concat("/") + String.valueOf(RRR)); 
            return 1;
            } catch(IOExceptionex){
            System.out.println("DEBUG:Error");
            return -3;
        }
    }
}

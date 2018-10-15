package stupid;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
public class Stupid {
    public static void main(String[] arg)   {        
        int result = myFun(arg);
        System.exit(result);
    }
    public static int myFun(String arr[]) {
        try{
            if(arr.length != 2) 
                return -1;
            String file1,file2= new String(Files.readAllBytes(Paths.get(arr[1]))); 
            file1 = new String(Files.readAllBytes(Paths.get(arr[0])));
            int size = file1.length();
            if(size<4) 
                return -2;
            int RRR=0; float eee=0;
            for(int i=0;i<size-3;i++)
            {       
                for(int j=0;j<file2.length()-4;j+=1) {
                    int vOv = 0;
                    for(int CC=0;CC<4;CC++){
                        if(file1.charAt(i+CC) == file2.charAt(j+CC)) 
                            vOv ++;
                    }          
            if (vOv == 4)
            {
                System.out.println("DEBUG:".concat(String.valueOf(i) + "," + String.valueOf(j)));
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

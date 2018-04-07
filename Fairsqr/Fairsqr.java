/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fairsqr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gopi
 */
public class Fairsqr {
    private static  long totalCases,testCase,lowlimit,highlimit,testNumber;
    private static boolean pelindrom=false,pelindrom1=false,sqr=false;
     private static long x3=0;
    private static  long j;
    private static int i;
     private static long x1=0,x2=0,y=0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File file= new File("C:/Users/Gopi/Desktop/input.txt");
        FileReader fr= new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String data = "",temp;
       
        while((temp=br.readLine())!=null){
            data=data + temp+ "\n";
        }
        //System.out.print(data);
        
        Scanner s1= new Scanner(data);
        totalCases=Integer.parseInt(s1.next());
        //System.out.print(totalCases);
        
        for(i=0;i<totalCases;i++){
            long count=0;
            lowlimit=Long.parseLong(s1.next());
            highlimit=Long.parseLong(s1.next());
           // System.out.println(lowlimit + "  "+highlimit);
            
            for(j=lowlimit; j<=highlimit;j++){
               testNumber=j;
                isPelindrom();
                if(pelindrom1==true){
                    // System.out.println(testNumber);
                     count++;
                }
           }
             System.out.println( "Case #"+(i+1)+": "+count);
            
        }
    }

    private static void isPelindrom() {
     String temp1=testNumber+"";
       y=temp1.trim().length()-1;
     
       x2=y;
       for(x1=0; x1<=y; x1++){
           if(x1-x2!=1){
           if(temp1.charAt((int) x1)==temp1.charAt((int) x2)){
              pelindrom=true;
           }else{
               pelindrom=false;
               break;
           }
           x2--;
           }else{
               break;
           }
       }
       
       if(pelindrom==true){
           for( x3=0; x3<=testNumber;x3++){
                    if((x3*x3)==testNumber){

                        //System.out.println( "x3 "+ testNumber);
                        //System.out.println( "x3 "+ x3);
                        break;
                    }else{

                    }
                    x2=y;
                    for(x1=0; x1<=y; x1++){
                        
                        if(x1-x2!=1){
                        if(temp1.charAt((int) x1)==temp1.charAt((int) x2)){
                            pelindrom1=true;
                        }else{
                            pelindrom1=false;
                            break;
                        }
                        
                        x2--;
                        }else{
                            break;
                        }
                    }
              } 
       }
   }
}

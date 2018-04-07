/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.a.alien.numbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author shraadhdha
 */
public class AAlienNumbers {

    static int no_input;
     static int len_il,len_ol,len_i,len_o;
    static  String index_no, input_lan, output_lan, output_no = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File input_file = new File("input.txt");
        FileReader fr = new FileReader(input_file);
        BufferedReader br = new BufferedReader(fr);
        String data = "", temp;
        
        
       
        while ((temp = br.readLine()) != null) {
            data = data + temp + "\n";
        }
        //System.out.println(data);
        Scanner scn = new Scanner(data);
        no_input = Integer.parseInt(scn.next());

        for (int i = 1; i <= no_input; i++) {
            index_no = scn.next();
            input_lan = scn.next();
            output_lan = scn.next();
            System.out.println(index_no + "  " + input_lan + "  " + output_lan);
            
            int length_of_output = Count_number_of_letter_in_output(index_no,input_lan,output_lan);
          //  System.out.println(length_of_output);
            
        }

    }

    private static int Count_number_of_letter_in_output(String index_no, String input_lan, String output_lan) {
        len_il=input_lan.length();
        len_ol=output_lan.length();
        len_i=index_no.length();
        int temp=0;
         int value=0;
        if(len_il == len_ol){
            len_o =len_i;
        } else if(len_il < len_ol){
            temp=len_ol;
            
            while(temp>=1){
                 temp=temp/len_il;
                 value++;
                 System.out.println(value + " .."+temp+" .. "+len_il);
                 
                 
             }
             
        }else if(len_il > len_ol){
             temp=len_il;
             while(temp>=1){
                 temp=temp/len_ol;
                 value++;
                 System.out.println(value + " .."+temp+" .. "+len_ol);
                 
             }
            
        }
        System.out.println(value + " ..");
        
        return len_o;
    }
}

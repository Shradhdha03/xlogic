import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class B_Lawnmower {
	
	public static void main(String[] args) throws IOException {
			
			//read input from file ...
			File file = new File("C:/Users/Gopi/Desktop/code jam/B_Lawnmower/src/input.txt");  
			FileReader fr = new FileReader(file);  
			BufferedReader br = new BufferedReader(fr);                                                   
			String data,input=""; 
			while((	data = br.readLine()) != null)   
			{  
				input=input+data+"\n";
			}                                 
			
			Scanner in= new Scanner(input);
			int count = Integer.parseInt(in.next());
			//System.out.println(count);
			String row,column;
			int r=0,c=0;
			Boolean flag=true;
			
			for(int m=0;m<count;m++){
				
				if(in.hasNext()){
					row=in.next();
					r=Integer.parseInt(row);
					//System.out.println(r);
					column=in.next();
					c=Integer.parseInt(column);
					//System.out.println(c);
				}
				
				String a[][]=new String[r][c];
				String b[][]=new String[r][c];
				for(int i=0;i<r;i++){
					for(int j=0;j<c;j++){
						if (in.hasNext()){
							a[i][j]=in.next().toString().trim();
							//System.out.println("a["+i+"]b["+j+"] :"+a[i][j]);
						}
					}
				}
				int temp=0,i,j;
				
				for( i=0;i<r;i++){
					for( j=0;j<c;j++){
						if(a[i][j].equals("1")){
							temp++;
						}
					}
					if(temp==c){
						for(int k=0;k<c;k++){
							b[i][k]="0";
						}
					}else {
						for(int k=0;k<c;k++){
							b[i][k]=a[i][k];
						}
					}
					temp=0;
				}
				temp=0;
				for( i=0;i<c;i++){
					for( j=0;j<r;j++){
						if(a[j][i].equals("1")){
							temp++;
							//System.out.println("t "+temp);
						}
					}
					if(temp==r){
						for(int k=0;k<r;k++){
							b[k][i]="0";
						}
					}
					temp=0;
				}
				temp=0;
				for( i=0;i<r;i++){
					for( j=0;j<c;j++){
						if(a[i][j].equals("2")){
							temp++;
						}
					}
					if(temp==c){
						for(int k=0;k<c;k++){
							b[i][k]="0";
						}
					}
					temp=0;
				}
				temp=0;
				for( i=0;i<c;i++){
					for( j=0;j<r;j++){
						if(a[j][i].equals("2")){
							temp++;
							//System.out.println("t "+temp);
						}
					}
					if(temp==r){
						for(int k=0;k<r;k++){
							b[k][i]="0";
						}
					}
					temp=0;
				}
			
				int s=1;
				for( i=0;i<r;i++){
					for( j=0;j<c;j++){
						//System.out.println(b[i][j]);
						if((b[i][j].equals("0"))||(b[i][j].equals("2"))){
							
							s=1;
						}else{
							s=2;
							break;
						}
						//System.out.println("s : "+s);
					}
					if(s==2){
						break;
					}
				}
				if(s==2){
					for( i=0;i<r;i++){
						for( j=0;j<c;j++){
							//System.out.println(b[i][j]);
							if((b[i][j].equals("0"))||(b[i][j].equals("1"))){
								
								s=1;
							}else{
								s=2;
								break;
							}
							//System.out.println("s:"+s);
						}
						if(s==2){
							break;
						}
					}
				}
				
				if (s==1){
					System.out.println("Case #"+(m+1)+": YES");
				}else {
					System.out.println("Case #"+(m+1)+": NO");
				}

			
			}
				
			
	}
}

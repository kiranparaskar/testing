import java.util.Scanner;

public class primeno{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println(" Enter A Number:-");
        int x = sc.nextInt();
           if(x==1||x==3||x==5||x==7){
			   
	          System.out.println("No is Prine");
			  
              }	else if(x%2==0||x%3==0||x%5==0||x%7==0){
				  
	           System.out.println("Number is Not Prime");
			   
              }else if(x%1==0||x%x==0){
				  
            	System.out.println("Number is Prime");
        }	
	}
}
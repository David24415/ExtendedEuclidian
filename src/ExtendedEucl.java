//David Dorneau
//Z23281302
//Data structures and Algorithms
//Assignment #2 Extended Euclidian 

import java.util.Scanner;
public class ExtendedEucl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan= new Scanner(System.in);
		int A=0,B=0;
		System.out.println("Please enter two values to calculate GCD:");
		A=myScan.nextInt();
		B=myScan.nextInt();
		
EEA(A,B);		//Call to function

	}
static void EEA(int a, int b)		//function definition
{
	int S=0, Old_S=1, T=1, Old_T=0, temp=0, temp1=0, temp2=0; 
	int R=b, Old_R=a, Q=0;
	
	while(R!=0)
	{
		Q=(Old_R/R);	// divide a by b
		temp=R;			//temporarily store value of b
		R=(Old_R-(Q*R));	//calculate the remainder from division
		Old_R=temp;			//set oldR equal to b
		
		
		temp1=Old_S;
		Old_S=(S-(Q*Old_S));
		S=temp1;
		
		temp2=Old_T;
		Old_T=T-(Q*Old_T);
		T=temp2;
		
	}
	
	System.out.println("The GCD = "+ Old_R);
	System.out.print("s is: "+S +" and t is: " + T);
}

}

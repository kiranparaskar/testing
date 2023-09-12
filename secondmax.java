public class secondmax{
	public static void main(String[] args){
	int x[]={11,23,34,54,1,53,89,99};
	int temp=x[0];
	int secondmaxno = 0;
	for (int i=0; i < x.length; i++){
		for (int j=0; j < x.length; j++){
		if(x[i]==x[j]){
			temp = x[j];
			x[i] = x[j];
			x[j] = temp;
		}
		}
		for (int j=x.length-2; j >= 0; j--){
			if(x[x.length-1]!=x[j]){
			secondmaxno = x[j];
			break;
			}
		}
	}
	System.out.println("Second Max Number Is:- " + secondmaxno);
	}
}
public class occurance{
	public static void main(String[] args){
		String s= "KiranParaskar";
		s= s.toLowerCase();
		char x[]=s.toCharArray();
		
		for(int i=0; i<x.length; i++){
			int num=1;
			for(int j=i+1; j<x.length; j++){
				if(x[i]==x[j]){
					num++;
					x[j]='0';
				}
			}
			if(x[i]!='0'){
				System.out.println(x[i]+"="+num);
			}
		}
 }
}
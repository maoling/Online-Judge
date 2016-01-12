import java.util.*;

public class Main__1026 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int m;
		long a,b;
		while (cin.hasNext()) {
			m = cin.nextInt(); 
			if(m == 0){
				break;
			}
			a=cin.nextLong();
            b=cin.nextLong();
            DecToOther(a+b,m);
            System.out.println();
			
		}
	}
	public static void DecToOther(long n,int k){
		if(n == 0){
			System.out.print("0");
		}
		int count = 0;
		long []data = new long[40];
		while(n!=0){
			data[count++]= n%k;
			n = n/k;
		}
		for(int i=count-1;i>=0;i--){
			System.out.print(data[i]);
		}
		
	}
	
	
}
package surendraPrograms;

public class fib {

	public static void main(String[] args) {
		int f1=0, f2=1;
		int n=12;
		while(f1<=n)
		{
			System.out.println(f1);
			int sum=f1+f2;
			f1=f2;
			f2=sum;
			
		}
		int n=6;
		int f=1;
		for(int i=1; i<=n; i++)
		{
			f*=i;
		}
		System.out.println(f);
	}
}

	}
}

class Sum 
{
	static void givenNumber(int n1)
	{
		int count=0;
		int wsum=0;
		int wsum1=0;
		while(n1>0)
		{
			if(count%2==0)
			{
				int p=n1%10;
				wsum=wsum+p;
				n1=n1/10;
			}
			else
			{
				int q=n1%10;
				wsum1=q+wsum1;
				n1=n1/10;
			}
			count++;
		}
		if(wsum>wsum1)
		{
			int wresult=wsum-wsum1;
			System.out.println("the result is : "+ wresult);
		}
		else
		{
			int wresult1=wsum1-wsum;
			System.out.println(wresult1);
		}
	}
	public static void main(String[] args) 
	{
		givenNumber(12345);	
	}
}


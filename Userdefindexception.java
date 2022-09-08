package org.excp;

public class NegativeValueException extends Exception 
{
	NegativeValueException(String message)
	{
		super(message);
	}

	@Override
	public String toString() 
	{
		return "NegativeValueException : "+getMessage();
	}
}


package org.excp;

public class UserDefinedException 
{
	void amountDeposit(int a) throws NegativeValueException
	{
		if(a<0)
		{
			throw new NegativeValueException("don't enter negative value");
		}
		else
		{
			System.out.println("valid amount");
		}
	}

	public static void main(String[] args) 
	{
	   UserDefinedException obj = new UserDefinedException();
	      try
	      {
	    	  obj.amountDeposit(-1);
	      }
	      catch(NegativeValueException e)
	      {
	    	  System.out.println(e);
	      }
	}

}


class SumOfPrime
  {
     void givenPrimeNumber(int n)
       {
           // prime numbers and sum of the prime number between 1 to 100 
           int sum = 0;
           for(int i= n; i<=100; i++)
            {
                int count =0;

               for(int j =1; j<=100; j++)
                 {
                       if(i%j==0)
                         {
                             count++;
                          }
                        }
                       if (count == 2)
                        {
                           System.out.println("the prime number between 1 to 100 is = "+i);
                           sum = sum +i;
                         }
               }
            System.out.println("sum of the prime number is = "+sum);
         }
     public static void main(String[] args)
       {
         SumOfPrime num = new SumOfPrime();
         num.givenPrimeNumber(1);
        }
  }

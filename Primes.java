public class Primes 
{
    public static void main(String[] args) 
    {
        int p=2;
        int n = Integer.parseInt(args[0]);
        boolean [] isprime=new boolean[n+1];
        isprime[0]=false;
        isprime[1]=false;
        if(isprime.length==1)
        {
            System.out.println();
        }
        for(int i=2; i<=n; i++)
        {
            isprime[i]=true;
        }
        while(p<=Math.sqrt(n))
        {
            if(prime (p))
            {
                for(int i=p*p; i<=n; i++)
                {
                    if(i%p==0)
                    {
                        isprime[i]=false;
                    }
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to "+n+":");
        int count=0;
        for(int i=2; i<=n; i++)
        {
            if(isprime[i]==true)
            {
                count++;
                System.out.println(i);
            }
        }
        int precentage=(100*count)/(n);
        System.out.println("There are "+count+" primes between 2 and "+n+" ("+precentage+"% are primes)");

    }
    public static boolean prime (int num)
    {
        int s=(int)Math.sqrt(num);
        if(num==2)
         {
            return true;
         }
         if(num%2==0)
         {
            return false;
         }
        for(int i=3; i<s; i+=2)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;

    }
}
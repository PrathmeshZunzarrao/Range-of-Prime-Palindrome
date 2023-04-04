import java.util.Scanner;
class RangeOfprimePalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting number : ");
		int start = sc.nextInt();
		System.out.print("Enter ending number : ");
		int end = sc.nextInt();

		for(int i=start; i<=end;i++)
		{
			if(checkPalindrome(i))
			{
				if(checkprime(i))
				{
					System.out.print(i+" ");
				}
			}
		}
	}


	public static boolean checkPalindrome(int num)
	{
		int rev = 0;
		int org = num;

		while(num > 0)
		{
			int rem = num % 10;
				rev = rem + rev*10;
				num = num/10;
		}

		if(org == rev)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public static boolean checkprime(int rev)
	{
		if(rev == 1)
		{
			return false;
		}
		else
		{
			for(int i=2; i<rev; i++)
			{
				if(rev % i == 0)
				{
					return false;
				}
			}
			return true;
		}
	}


}

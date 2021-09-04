package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 15;
		boolean flag = false;
		
		for(int i = 2; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Number " +num+ " is prime number ");
		}
		else 
		{
			System.out.println("Number " +num+ " is not prime number ");
		}

	}

}

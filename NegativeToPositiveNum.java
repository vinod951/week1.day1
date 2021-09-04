package week1.day1;

public class NegativeToPositiveNum {

	public static void main(String[] args) {
		
		int num = -40;
		
		if(num<0)
		{
			num = -num;
			System.out.println("The number -40 is converted to " +num);
		}
		else 
		{
			System.out.println(num);
		}

	}

}

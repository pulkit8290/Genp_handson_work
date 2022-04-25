package com.org.genp.day1;
public class Alphabet{
	public static void main(String[] args) {
	int i, j, k, l;

	for(i=0;i<=11;i++)
	{
		for(j=10;j >=i;j--)
			{
				System.out.print(" ");
			}

		for(k=0;k <=1;k++)
		{
			System.out.print("*"); 
		}

		for(l=1;l <=i;l++)
		{
			if(i >4 && i< 7)
			{
				System.out.print("**");
			}
			else
			{
				System.out.print("  ");
			}
		}

		for(k=0;k <=1;k++)
		{
			System.out.print("*"); 
		}
	
		for(j=10;j >=i;j--)
		{
			System.out.print(" ");
		}
		System.out.print("\n");
	}
	}

}


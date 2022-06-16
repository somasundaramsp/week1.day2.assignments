package week1.day2.assignments;

public class FindIntersection 
{
	
	public static void main(String[] args) 
	{
		int[] b = { 3, 2, 11, 4, 6, 7}; int[] c = { 1, 2, 8, 4, 9, 7}; int d, e;
			for (d=0; d<b.length; d++) 
			{
				for (e=0; e<c.length;e++)
				{
					if (b[d] == c[d]) 
					{
						System.out.println(b[d]);
					}
				}
			}
		
    }

}

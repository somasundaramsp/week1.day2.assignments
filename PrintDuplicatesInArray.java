package week1.day2.assignments;

public class PrintDuplicatesInArray
{

	int[] arra = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20};
	int count; int b,c;
 {
	
	for (b = 0; b <= arra.length-1;b++) 
	{
			count = 0;
	        for (c=b+1; c < arra.length; c++) 
			{
			
				if (arra[b] == arra[c]) 
				{
					count ++;
				}
				
				if (count > 0 ) 
				{
					System.out.println(arra[b]);
				break;
				}
			}
		}
  }
}
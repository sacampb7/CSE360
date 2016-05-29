package cse360assign1;

/**
 * Steven Campbell
 * CSE 360
 * Assignment 1
 * 
 * 
 * This class takes an array and inserts numbers into it 
 * in ascending order and resizes the array to keep it large enough
 * to continue storing values
 * 
 */
public class OrderedIntList 
{
	protected int[] array;  
	protected int count = 0; 
	private static boolean debug = true;

	OrderedIntList()
	{
		array = new int[10];
	}
	
	/**
	 * 
	 * The insert function inserts the numbers
	 * in ascending order, it also keeps track of the number
	 * of values inserted so it knows when to call the
	 * grow method
	 */
	public void insert (int temp) 
	{
		if(count == array.length) 
		{
			grow();
			/**
			 * Debug checks to make sure the array was 
			 * successfully grown.
			 */
			if(debug == true)
			{
				System.out.println("Grow Successful");
			}
			
		}
		
		if(count == 0)
		{
			array[0] = temp;
			count++;
		}
		
		else 
		{
			int jIndex = 0;
			boolean done = false;
			int index = 0;
			
			while(!done && index<count)
			{
				if(temp<array[index])
					done = true;
				else
				{
					index++;
					jIndex++;
				}
			}
			
			for (index = count; index>jIndex; index--) 
				array[index] = array[index-1];
			
			array[jIndex] = temp;
			/**
			 * Every time a value is successfully entered
			 * debug will print the array so we can make sure
			 * it was inserted properly
			 */
			if(debug == true)
			{
				print();
			}
				
			count++;
		}
	}
	/**
	 * The grow method resizes the array by 
	 * doubling its size each time it runs out 
	 * of space
	 */
	private void grow()
	{
		int []growArray = new int[count*2];
		
		for (int index = 0; index<count; index++)
			growArray[index] = array[index];
		
		array = growArray;
		debug = true;
	}
	
	/**
	 * Iterate through the array and prints out the values,
	 * best used for testing purposes
	 */
	public void print () 
	{
		for (int index = 0; index<count; ) 
		{
			if (index%5 == 0) 
				System.out.println();
			
			System.out.print(array[index++] + "\t");	
		}
		System.out.println();
	}
}
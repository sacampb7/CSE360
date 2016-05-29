package cse360assign1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnalytics 
{
	@Test
	public void testMean() 
	{
		Analytics num = new Analytics();
		
		num.insert(4);
		num.insert(5);
		num.insert(6);
		num.insert(7);
		num.insert(8);

		assertEquals(6, num.mean(), 0);
	}

	@Test
	public void testMedian() 
	{
		Analytics num = new Analytics();

		num.insert(1);
		num.insert(7);
		num.insert(9);
		num.insert(3);
		num.insert(6);
		
		assertEquals(6, num.median());
		
	}

	@Test
	public void testHigh() 
	{
		Analytics num = new Analytics();

		num.insert(1);
		num.insert(6);
		num.insert(8);
		num.insert(12);
		num.insert(3);
		
		assertEquals(12, num.high());
	}

	@Test
	public void testLow() 
	{
		Analytics num = new Analytics();

		num.insert(7);
		num.insert(13);
		num.insert(3);
		num.insert(8);
		num.insert(9);
		
		assertEquals(3, num.low());
	}

	@Test
	public void testNumInts() 
	{
		Analytics num = new Analytics();

		num.insert(1);
		num.insert(2);
		num.insert(3);
		num.insert(4);
		num.insert(5);
		
		assertEquals(5, num.numInts());
	}
	
	@Test
	public void testEmptyArrayMean()
	{
		Analytics num = new Analytics();

		assertEquals(-1, num.mean(), 0);
		
	}
	
	@Test
	public void testEmptyArrayMedian()
	{
		Analytics num = new Analytics();

		assertEquals(-1, num.median());
		
	}

	@Test
	public void testEmptyArrayHigh()
	{
		Analytics num = new Analytics();

		assertEquals(-1, num.high());
		
	}
	
	@Test
	public void testEmptyArrayLow()
	{
		Analytics num = new Analytics();

		assertEquals(-1, num.low());
		
	}
	
	@Test
	public void testEmptyArrayNumInts()
	{
		Analytics num = new Analytics();

		assertEquals(0, num.numInts());
		
	}
}

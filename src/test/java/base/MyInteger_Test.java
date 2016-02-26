package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	public static MyInteger OdVal; 
	public static MyInteger EvVal;
	public static MyInteger OdVal2; 
	public static MyInteger EvVal2;
	public static MyInteger TwoExcpVal;
	public static MyInteger TwoExcpVal2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		OdVal = new MyInteger(5);
		OdVal2 = new MyInteger(5);
		EvVal = new MyInteger(4);
		EvVal2 = new MyInteger(4);
		TwoExcpVal = new MyInteger(2);
		TwoExcpVal2 = new MyInteger(2);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void testIsEven(){
		assertTrue(MyInteger.isEven(EvVal));
		assertTrue(MyInteger.isEven(TwoExcpVal));
		assertFalse(MyInteger.isEven(OdVal));
		assertTrue(MyInteger.isEven(2));
		assertTrue(MyInteger.isEven(new MyInteger(2)));
		assertFalse(MyInteger.isEven(new MyInteger(5)));
	}
	
	@Test
	public void testIsOdd(){
		assertTrue(MyInteger.isOdd(OdVal));
		assertFalse(MyInteger.isOdd(TwoExcpVal));
		assertFalse(MyInteger.isOdd(EvVal));
		assertTrue(MyInteger.isOdd(OdVal));
		assertTrue(MyInteger.isOdd(new MyInteger(5)));
		assertFalse(MyInteger.isOdd(new MyInteger(2)));

	}
	
	@Test
	public void testIsPrime(){
		assertTrue(MyInteger.isPrime(OdVal));
		assertTrue(MyInteger.isPrime(TwoExcpVal));
		assertFalse(MyInteger.isPrime(EvVal));
		assertTrue(MyInteger.isPrime(OdVal));
		assertTrue(MyInteger.isPrime(TwoExcpVal));
		assertFalse(MyInteger.isPrime(EvVal));
		assertTrue(MyInteger.isPrime(new MyInteger(2)));
		assertTrue(MyInteger.isPrime(new MyInteger(5)));
		assertFalse(MyInteger.isPrime(new MyInteger(4)));

	}
	@Test
	public void testEquals(){
		assertTrue(OdVal.equals(5));
		assertFalse(OdVal.equals(3));
		assertTrue(TwoExcpVal.equals(2));
		assertFalse(TwoExcpVal.equals(1));
		assertTrue(EvVal.equals(4));
		assertFalse(EvVal.equals(2));
		assertTrue(EvVal.equals(EvVal2));
		assertTrue(OdVal.equals(OdVal2));
		assertTrue(TwoExcpVal.equals(TwoExcpVal2));
		assertFalse(EvVal.equals(OdVal2));
	}

}

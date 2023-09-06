
import static org.junit.Assert.*;
import org.junit.*;

public class GradeBookTest

{
	GradeBook one,two,three;
	
	@Before
	public void setUp() throws Exception
	{
		one = new GradeBook(5);
		two = new GradeBook(5);
		
		one.addScore(80.9);
		one.addScore(85.6);
		
		two.addScore(88.1);
		two.addScore(78.9);
		two.addScore(85.5);
	}
	
	@After
	public void tearDown() throws Exception
	{
		one=two=three=null;
	}
	
	@Test
	public void testAddScore()
	{
		assertTrue(one.addScore(70.3));
		assertTrue(one.addScore(71.9));
		assertTrue(one.addScore(74.5));
		assertFalse(one.addScore(90.9));
		
		assertTrue(two.addScore(93.2));
		assertTrue(two.addScore(81.5));
		assertFalse(two.addScore(91.2));
	}
	
	@Test
	public void testSum()
	{
		assertEquals(166.5,one.sum(),0.1);
		assertEquals(252.5,two.sum(),0.1);
	}
	
	@Test
	public void testMinimum()
	{
		assertEquals(80.9,one.minimum(),0.1);
		assertEquals(78.9,two.minimum(),0.1);
		
	}
	
	@Test
	public void testFinalScore()
	{
		assertEquals(85.6,one.finalScore(),0.1);
		assertEquals(173.6,two.finalScore(),0.1);
	}
	
	@Test
	public void testGetScoreSize()
	{
		assertEquals(2,one.getScoreSize(),0.1);
		assertEquals(3,two.getScoreSize(),0.1);
	}

	@Test
	public void testToString()
	{
	    assertEquals("80.9 85.6 ", one.toString());
		assertEquals("88.1 78.9 85.5 ", two.toString());
		
	}
}

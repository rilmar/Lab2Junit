import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BowlingTest {

	Scoresheet game = new Scoresheet();
	game.newGame();
	//
	@Before
	public void setUp() throws Exception {
	}

//	@After
//	public void tearDown() throws Exception {
//		
//	}

	@Test
	public void testOneThrow() {
		game.bowl(8);
		assertEquals("incorrect game score", 8, game.getGameScore());
		assertEquals("incorrect frame score", 8, game.getFrameScore(1));
//		assertEquals("incorrect frame score", 0, game.getFrameScore(2));
	}

	@Test
	public void testTwoThrows() {
		game.bowl(7);
		assertEquals("incorrect game score", 7, game.getGameScore());
		assertEquals("incorrect frame score", 0, game.getFrameScore(1));
		game.bowl(2);
		assertEquals("incorrect game score", 9, game.getGameScore());
		assertEquals("incorrect frame score", 0, game.getFrameScore(1));
		
		//testing two strikes in a row
		game.newGame();
		game.bowl(10);
		game.bowl(10);
		game.bowl(2);
		assertEquals("incorrect game score", 36, game.getGameScore());
		assertEquals("incorrect frame score", 20, game.getFrameScore(0));
		assertEquals("incorrect frame score", 10, game.getFrameScore(1));
	}
	
	@Test
	public void testThreeThrows() {
		
	}
	
	@Test
	public void testSpareCountsToNextFrame() {
		
	}
	
	@Test
	public void testStrikeMovesToNextFrame() {
		
	}
	
	@Test
	public void testStrikeCountsNextFrameScores() {
		
	}
	
	@Test
	public void testSpareOnLastFrame() {
		
	}
	
	@Test
	public void testStrikeOnLastFrame() {
		
	}
	
	@Test
	public void testThrowOn11thFrame() {
		
	}
	
	@Test
	public void test() {
		
	}
}
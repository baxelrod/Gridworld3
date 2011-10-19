import info.gridworld.actor.*;
import info.gridworld.grid.*;

import org.junit.*;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 *  Jumper tests:.
 *  test01 - jumper next to edge of grid - should turn
 *  test02 - 2-in-front of jumper off grid - should turn
 *  test03 - TODO Description
 *  test04 - TODO Description
 *  test05 - TODO Description
 *  test06 - TODO Description
 *  test07 - TODO Description
 *  
 *  @author  TODO Your Name(s)
 *  @version TODO Date
 *
 *  @author  Period: TODO
 *  @author  Assignment - GridWorld Part 3 Jumper
 *
 *  @author  Sources: TODO
 */
public class JUJumperTest
{
    /*
     * Variables used by the test methods.
     *   These variables must be static so that their values survive from
     *   test method to test method
     */
    private static Grid<Actor> grid = new BoundedGrid<Actor>( 8, 8 );
    private static ActorWorld world = new ActorWorld( grid );
    private static Jumper jumper1;

    /**
     * test01 - jumper next to edge of grid - should turn.
     */
    @Test
    public void test01()
    {
        jumper1 = new Jumper();
        Location loc = new Location( 0, 3 );
        world.add( loc, jumper1 );
        jumper1.act();

        assertTrue( testOccupied( loc, jumper1, Location.NORTHEAST ) );
    }

    /**
     * test02 - 2-in-front of jumper off grid - should turn.
     */
    @Test
    public void test02()
    {
        Location loc = new Location( 1, 3 );
        jumper1.moveTo( loc );
        jumper1.act();

        assertTrue( testOccupied( loc, jumper1, Location.EAST ) );
    }

    /**
     * test03 - TODO Description
     */
    @Test
    public void test03()
    {
        // TODO complete test
    }

    /**
     * test04 - TODO Description
     */
    @Test
    public void test04()
    {
        // TODO complete test
    }

    /**
     * test05 - TODO Description
     */
    @Test
    public void test05()
    {
        // TODO complete test
    }

    /**
     * test06 - TODO Description
     */
    @Test
    public void test06()
    {
        // TODO complete test
    }

    /**
     * test07 - TODO Description
     */
    @Test
    public void test07()
    {
        // TODO complete test
    }

    /**
     * Test helper method to test for empty location.
     * 
     * @param loc null location if empty
     * @return true if all assertions pass
     */
    private boolean testEmpty(Location loc)
    {
        Actor empty = grid.get( loc );
        assertNull( "<<<<< " + loc + " should be empty. >>>>>", empty );
        
        return true;
    }

    /**
     * Test helper method to test that object is in a location, and has
     * a consistent loc, and direction dir.
     * 
     * @param loc location that should be occupied
     * @param a   actor that should be in location loc
     * @param dir direction this actor should be facing
     * @return true if all assertions pass
     */
    private boolean testOccupied(Location loc, Actor a, int dir)
    {
        Actor found = grid.get( loc );
        assertSame( "<<<<< " + loc + " should contain the actor. >>>>>",
            a, found );
        assertEquals( "<<<<< Loc should be " + loc + " >>>>>",
            loc, found.getLocation() );
        assertEquals( "<<<<< Dir should be " + dir + " >>>>>",
            dir, found.getDirection() );
        
        return true;
    }

    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( JUJumperTest.class );
    }

    /**
     * Main method that does initial setup and kicks off the tests
     * 
     * @param args command line arguments (not used)
     */
    public static void main( String[] args )
    {      
        org.junit.runner.JUnitCore.main( "JUJumperTest" );
    }
}
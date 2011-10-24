import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

/**
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  Brian Axelrod
 *  @version 10/24/11
 *  @author  Period: 2
 *  @author  Assignment: GridWorld_Part3_Jumper
 *
 *  @author  Sources: TODO
 */
public class JumperRunner
{
    public static void main( String[] args )
    {
        ActorWorld world = new ActorWorld();
        Jumper test = new Jumper();
        world.add(test);
        test.removeSelfFromGrid();
        
        world.add(new Rock());
        world.show();
    }
}
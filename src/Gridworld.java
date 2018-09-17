import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld
{
	public static void main(String[] args)
	{
		Gridworld g = new Gridworld();
		
		World world = new World();
		
		Location loc = new Location(2, 2);
		
		Bug bug = new Bug();
		world.add(loc, bug);
		
		world.show();
	}
	
}

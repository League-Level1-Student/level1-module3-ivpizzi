import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld
{
	public static void main(String[] args)
	{
		Gridworld g = new Gridworld();
		World world = new World();
		
		Random r = new Random();
		Color blue = new Color(0, 150, 255);
		
		int rand = r.nextInt(10) + 1;
		int rand2 = r.nextInt(10) + 1;
		
		Location loc = new Location(2, 2);
		Location loc2 = new Location(rand,  rand2);
		Location loc3 = new Location(rand, rand2 - 1);
		Location loc4 = new Location(rand, rand2 + 1);
		
		Bug bug = new Bug();
		Bug bug2 = new Bug(blue);
		Flower flower = new Flower();
		Flower flower2 = new Flower();
		world.add(loc, bug);
		world.add(loc2, bug2);
		world.add(loc3,  flower);
		world.add(loc4, flower2);
		bug2.turn();
		bug2.turn();
		
		world.show();
	}
	
}

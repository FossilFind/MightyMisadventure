package dumbfoundgames.misadventure.state.level;

import dumbfoundgames.misadventure.state.State;
import dumbfoundgames.misadventure.world.World;

public abstract class LevelState extends State
{
	protected World world;
	
	public LevelState(String filePath)
	{
		world = new World(filePath);
	}
	
	public World getWorld()
	{
		return world;
	}
}
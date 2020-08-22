package dumbfoundgames.misadventure.state.level;

import java.awt.Graphics;

import dumbfoundgames.misadventure.world.World;

public class Level1State extends LevelState
{
	private World world;
	
	public Level1State()
	{
		super("res/levels/level1.world");
	}
	
	@Override
	public void tick()
	{
		world.tick();
	}
	
	@Override
	public void render(Graphics g)
	{
		world.render(g);
	}
}
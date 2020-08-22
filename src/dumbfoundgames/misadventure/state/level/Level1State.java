package dumbfoundgames.misadventure.state.level;

import java.awt.Graphics;

public class Level1State extends LevelState
{
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
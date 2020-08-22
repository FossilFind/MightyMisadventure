package dumbfoundgames.misadventure.entity.creature;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import dumbfoundgames.misadventure.Launcher;

public class Player extends Creature
{
	public Player()
	{
		super(1, 1);
	}
	
	@Override
	public void tick()
	{
		if(Launcher.MAIN.getInputs().keys[KeyEvent.VK_D])
			xMove++;
		
		if(Launcher.MAIN.getInputs().keys[KeyEvent.VK_A])
			xMove--;
		
		move();
	}
	
	@Override
	public void render(Graphics g)
	{
		g.fillRect((int) x, (int) y, 64, 64);
	}
}
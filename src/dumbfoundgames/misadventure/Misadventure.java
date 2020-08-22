package dumbfoundgames.misadventure;

import java.awt.Graphics;

import dumbfoundgames.misadventure.state.State;
import dumbfoundgames.misadventure.state.level.Level1State;
import fossilfind.library.engine.Engine;

/**
 * The main class
 * 
 * @author Zach
 */
public class Misadventure extends Engine
{
	public Misadventure()
	{
		super("Gavin and Zach's Mighty Misadventure");
		State.setState(new Level1State());
	}
	
	@Override
	public void tick()
	{
		State.getState().tick();
	}
	
	@Override
	public void render(Graphics g)
	{
		State.getState().render(g);
	}
}
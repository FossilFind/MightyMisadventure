package dumbfoundgames.misadventure;

import java.awt.Graphics;

import dumbfoundgames.misadventure.state.State;
import dumbfoundgames.misadventure.state.level.Level1State;
import fossilfind.library.engine.Engine;
import fossilfind.library.input.InputManager;

public class Misadventure extends Engine
{
	private InputManager inputs;
	private Level1State level1;
	
	public Misadventure()
	{
		super("Gavin and Zach's Mighty Misadventure");
		
		inputs = new InputManager();
		level1 = new Level1State();
		
		window.getFrame().addKeyListener(inputs);
		
		State.setState(level1);
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
	
	public Level1State getLevel1()
	{
		return level1;
	}
	
	public InputManager getInputs()
	{
		return inputs;
	}
}
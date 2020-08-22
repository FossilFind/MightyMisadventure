package dumbfoundgames.misadventure.state;

import java.awt.Graphics;

import dumbfoundgames.misadventure.state.level.LevelState;

public abstract class State
{
	private static State currentState = null;
	
	public static void setState(State state)
	{
		currentState = state;
	}
	
	public static State getState()
	{
		return currentState;
	}
	
	public static LevelState getLevelState()
	{
		if(currentState instanceof LevelState)
			return (LevelState) currentState;
		else
			return null;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
}
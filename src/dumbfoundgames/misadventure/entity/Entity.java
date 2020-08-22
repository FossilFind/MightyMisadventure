package dumbfoundgames.misadventure.entity;

import java.awt.Graphics;

public abstract class Entity
{
	protected float x, y;
	protected float health;
	
	public Entity(float x, float y)
	{
		this.x = x;
		this.y = y;
		
		health = 10;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
}
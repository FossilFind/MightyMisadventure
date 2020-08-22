package dumbfoundgames.misadventure.entity.creature;

import dumbfoundgames.misadventure.entity.Entity;

public abstract class Creature extends Entity
{
	protected float speed, jumpSpeed, fallSpeed;
	protected float xMove, jumpMove, fallMove;
	protected boolean jumping, falling;
	
	public Creature(float x, float y)
	{
		super(x, y);
		
		xMove = 0;
		jumpMove = 0;
		fallMove = 0;
	}
	
	protected void move()
	{
		moveX();
		moveY();
		
		xMove = 0;
		jumpMove = 0;
		fallMove = 0;
	}
	
	private void moveX()
	{
		x += xMove;
	}
	
	private void moveY()
	{
		
	}
}
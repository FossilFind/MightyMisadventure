package dumbfoundgames.misadventure.world;

import java.awt.Graphics;
import java.util.ArrayList;

import dumbfoundgames.misadventure.entity.creature.Player;
import dumbfoundgames.misadventure.util.Line;
import dumbfoundgames.misadventure.util.Util;

public class World
{
	private Line[] lines;
	private String background;
	private Player player;
	
	public World(String filePath)
	{
		loadWorld(filePath);
		
		player = new Player();
	}
	
	public void tick()
	{
		player.tick();
	}
	
	public void render(Graphics g)
	{
		player.render(g);
	}
	
	private void loadWorld(String filePath)
	{
		String[] file = Util.loadFile(filePath);
		
		ArrayList<Line> lines = new ArrayList<Line>();
		
		boolean firstLine = true;
		for(String fileLine : file)
		{
			if(firstLine)
			{
				background = file[0];
				firstLine = false;
				continue;
			}
			
			String[] tokens = fileLine.split("\\s+");
			
			int x1 = Util.parseInt(tokens[0]);
			int y1 = Util.parseInt(tokens[1]);
			int x2 = Util.parseInt(tokens[2]);
			int y2 = Util.parseInt(tokens[3]);
			
			lines.add(new Line(x1, y1, x2, y2));
		}
		
		this.lines = lines.toArray(new Line[1]);
	}
}
package dumbfoundgames.misadventure.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Util
{
	public static String[] loadFile(String filePath)
	{
		ArrayList<String> file = new ArrayList<String>();
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line;
			while((line = br.readLine()) != null) file.add(line);
			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return (String[]) file.toArray();
	}
	
	public static int parseInt(String number)
	{
		try
		{
			return Integer.parseInt(number);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			return 0;
		}
	}
}
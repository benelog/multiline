package org.adrianwalker.multilinestring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;


public class StringProcessor 
{
	public static String toString(String value,Multiline annotation)
	{
		if(!annotation.mergeLines() && !annotation.trimWhiteSpace())
		{
			return value;
		}
		
		String crnl = System.getProperty("line.separator");
		try
		{
			BufferedReader reader = new BufferedReader(new StringReader(value));
			StringBuilder buf = new StringBuilder();
			String line = reader.readLine();
			while(line != null)
			{
				if(annotation.trimWhiteSpace())
				{
					line = line.trim();
				}
				if(annotation.mergeLines() && buf.length()>0)
				{
					if(annotation.mergeChar() != '\0')
					{
						buf.append(annotation.mergeChar());
					}
				}
				buf.append(line);
				if(!annotation.mergeLines())
				{
					buf.append(crnl);
				}
				
				line = reader.readLine();
			}
			return buf.toString();
		}
			catch(IOException ex)
			{
				// should never happen. Just return the value
				return value;
			}
	}
}

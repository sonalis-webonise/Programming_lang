import java.io.*;
import java.util.*;

public class rest
{
	public static void main(String[] arg) throws IOException
	{
		int id[];
		String price;
		String item;
		String line = null;
		BufferedReader br=new BufferedReader(new FileReader("sample_data.csv"));
		List<String> lines = new ArrayList<>();
		int i=0;
		
		while ((line = br.readLine()) != null)
		{
			lines.add(line);
			System.out.println(lines.get(i));
			i++;
		}



		System.out.println("Enter items that you want");
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));		
		item=read.readLine();
List<String> temp = new ArrayList<>();
				
		for(i=0;i<lines.size();i++)
		{
		if(lines.get(i).split(",")[2].contains(item))
		{	
		System.out.println(temp.add(lines.get(i).split(",")[0]));
		System.out.println(temp.add(lines.get(i).split(",")[1]));		
		System.out.println(lines.get(i).split(",")[2].contains(item));
			temp.add(item);
		if(temp.get(i)==temp.get(i+1))
		{
			System.out.println("Hotel id " + i);
		}
		}
		}

		for(i=0;i<temp.size();i++)
		{
		System.out.println(temp.get(i));
		}

		

	}
}

import java.io.*;
import java.util.*;

public class rest
{
	public static void main(String[] arg) throws IOException
	{
		int id[];
		String price;
		String item1;
		String item2;
		String[] item;
		String line = null;
		rest r=new rest();
		BufferedReader br=new BufferedReader(new FileReader("C:/Users/Sonali/workspace/Rest/src/Sample_data.csv"));
		List<String> lines = new ArrayList<>();
		int i=0;
		
		while ((line = br.readLine()) != null)
		{
			lines.add(line);
			System.out.println(lines.get(i));
			i++;
		}
		item=new String[2];


		System.out.println("Enter items that you want");
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));		
		
		for(i=0;i<2;i++)
		{
			item[i]=read.readLine();
		}
		List<String> tid = new ArrayList<>();
		List<String> tprice = new ArrayList<>();
		List<String> titem = new ArrayList<>();
		List<Integer> index = new ArrayList<>();
		List<Integer> idstack = new ArrayList<>();
		
		
		for(i=0;i<lines.size();i++)
		{
		tid.add(lines.get(i).split(",")[0]);
		tprice.add(lines.get(i).split(",")[1]);		
		titem.add(lines.get(i).split(",")[2]);
		}
		//System.out.print(titem.size());
		
		for(i=0;i<titem.size();i++)
		{
			for(int j=0;j<item.length;j++)
			{
				if(titem.get(i).contains(item[j]))
				{	
					index.add(i);
					
					idstack.add(Integer.parseInt(tid.get(i)));
					System.out.print(" Avail .... " + idstack.get(i));
					//System.out.print("  .... " + i);
					
					
				}
			}
		}
		int sum=0;
		int numdup=0,dupcnt=0;
		int prev=-1;
		for(i=0;i<idstack.size();i++)
		{
			if(idstack.get(i)==prev)
			{
				++numdup;
				if(numdup==1)
				{
					++dupcnt;
					if(dupcnt==1)
					{
						System.out.println("val   " + idstack.get(i));
					}
					else
					{
						System.out.println(", " + idstack.get(i));
						
					}
					
				}
			}
			else
			{
				prev=idstack.get(i);
				numdup=0;
			}
			
			System.out.println(" \n " + tprice.get(i));
			int t=Integer.parseInt(tprice.get(i));
			sum=sum+t;
			System.out.println("\nPrice\nsum ::" + sum);
		}

		System.out.println(" No: " + dupcnt);
		
	
	}
}

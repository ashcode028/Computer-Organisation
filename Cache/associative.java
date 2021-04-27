package cache;

import java.util.*;

public class associative {

	static int [][] cacheMemory;
	static String []tagarr;
	static int MM;      // main memory size
	static int cs;      // cache size
	static int cl;		//no of cache lines
	static int bs;      // blocks
	static int pa;		// bits for physical address
	static int cm;		// bits for cache memory 
	static int Off;		// bits to represent block offset
	static int tb;		//no of tag bits
	
	static void Read(String address)
	{
		String tag = "";
		for (int i=0; i<=tb-1;i++)
		{
			tag=tag+address.charAt(i);
		}
		
		String Cl = "";
		for(int i = tb ; i<pa-Off;i++)
		{
			Cl=Cl+address.charAt(i);
		}
		
		String bo = "";
		for (int i=pa-Off;i<pa;i++)
		{
			bo=bo+address.charAt(i);
		}
		
		boolean ans=true;
		for (int i=0;i<cl;i++)
		{
			if (tag.equals(tagarr[i]))
			{
				ans=false;
				System.out.print("\nCache Hit");
				System.out.print("\n Data in the address : "
						+ cacheMemory[i][Integer.parseInt(bo,2)] );
				print();
				break;
			}
		}
		
		if(ans)
		{
			System.out.print("\nCache Miss");
			print();
		}
	}
	
	static void Write(String address,int data)
	{
		String tag = "";
		for (int i=0; i<=tb-1;i++)
		{
			tag=tag+address.charAt(i);
		}
		
		String Cl = "";
		for(int i = tb ; i<pa-Off;i++)
		{
			Cl=Cl+address.charAt(i);
		}
		
		String bo = "";
		for (int i=pa-Off;i<pa;i++)
		{
			bo=bo+address.charAt(i);
		}
		
		boolean ans=true;
		for (int i=0 ; i<cl ; i++)
		{
			if (tagarr[i].equals("") || tag.equals(tagarr[i]))
			{
				ans=false;
				tagarr[i]=tag;
				cacheMemory[i][Integer.parseInt(bo,2)]=data;
				break;
			}
		}
		if (ans)
		{
			for (int i = 0 ; i<Off;i++)
			{
				cacheMemory[0][i]=0;
			}
			tagarr[0]=tag;
			cacheMemory[0][Integer.parseInt(bo,2)]=data;
		}
	}
	

	
	static void print()
	{
		System.out.println("\n**********CACHE MEMORY**********");
		for (int i=0 ; i<cl;i++)
		{
			for (int j = 0 ; j<bs ; j++)
			{
				System.out.print(cacheMemory[i][j]+"    ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Main Memory size : ");
		MM=scan.nextInt();
		System.out.print("Enter Cache size: ");
		cm = scan.nextInt();
		System.out.print("Enter Block Size : ");
		bs = scan.nextInt();
		scan.close();
		cl=cm/bs;
		
		pa=0;
		int x= MM;
		while(x!=1)
		{
			x = x/2;
			pa++;
		}
		
		cm=0;
		int y =cs ;
		while(y!=1)
		{
			y = y/2;
			cm++;
		}
		
		Off=0;
		int z=bs;
		while(z!=1)
		{
			z = z/2;
			Off++;
		}
		tb=pa-cm;
		cacheMemory=new int[cl][bs];
		tagarr=new String[bs];
		for (int i=0;i<cl ; i++)
		{
			tagarr[i]="";
		}
		
		//function call from here
		
		
	}

}

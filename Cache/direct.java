package cache;

import java.util.*;

public class direct {
	static int [][] cacheMemory;
	static String []tagarr;
	static int MM;       //main memory size
	static int cs;       //cache size
	static int cl;		//no of cache Lines
	static int bs;      //blocks
	static int pa;		// bits for physical address
	static int cm;		// bits for cache memory 
	static int Off;		// bits for block offset
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
		
		if (tag.contentEquals(tagarr[Integer.parseInt(Cl,2)]))
		{
			System.out.print("\nCache Hit");
			System.out.print("\n Data in the address  : "
					+ cacheMemory[Integer.parseInt(Cl,2)][Integer.parseInt(bo,2)] );
			print();
		}
		else
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
		
		tagarr[Integer.parseInt(Cl,2)]=tag;	
		cacheMemory[Integer.parseInt(Cl,2)][Integer.parseInt(bo,2)]=data;
		
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
		System.out.print("Enter Cache size : ");
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

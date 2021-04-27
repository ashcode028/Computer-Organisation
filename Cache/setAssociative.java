package cache;

import java.util.*;

public class setAssociative {

	static int [][] cacheMemory;
	static String []tagarr;
	static int MM;     //main memory size
	static int cs;     //cache size
	static int cl;		//no of cache lines
	static int bs;      //blocks
	static int pa;		//bits for physical address
	static int cm;		// bits for cache memory 
	static int Off;		//bits for block offset
	static int tb;		//no of tag bits
	static int sets;     // no of sets in set associative mapping
	static int index;      //no of bits for set Index
	
	
	
	static void Read(String address)
	{
		String tag = "";
		for (int i=0; i<=tb-1;i++)
		{
			tag=tag+address.charAt(i);
		}
		
		String Si= "";
		for(int i = tb ; i<pa-Off;i++)
		{
			Si=Si+address.charAt(i);
		}
		
		String bo = "";
		for (int i=pa-Off;i<pa;i++)
		{
			bo=bo+address.charAt(i);
		}
		
		boolean ans = true;
		int start=(Integer.parseInt(Si,2)*2);
		int end=start+2;
		for (int i=start ; i<end;i++)
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
		
		String z= "";
		for(int i = tb ; i<pa-Off;i++)
		{
			z=z+address.charAt(i);
		}
		
		String Bo = "";
		for (int i=pa-Off;i<pa;i++)
		{
			Bo=Bo+address.charAt(i);
		}
		
		boolean ans =true;
		int start=(Integer.parseInt(z,2)*2);
		int end=start+2;
		for (int i=start ; i<end;i++)
		{
			if (tagarr[i].equals("") || tag.equals(tagarr[i]))
			{
				ans=false;
				tagarr[i]=tag;
				cacheMemory[i][Integer.parseInt(Bo,2)]=data;
				break;
			}
		}
		if (ans)
		{
			for (int i = 0 ; i<Off;i++)
			{
				cacheMemory[start][i]=0;
			}
			tagarr[start]=tag;
			cacheMemory[start][Integer.parseInt(Bo,2)]=data;
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
		System.out.print("Enter Cache size : ");
		cs = scan.nextInt();
		System.out.print("Enter Block Size : ");
		bs = scan.nextInt();
		scan.close();
		cl=cm/bs;
		
		pa=0;
		int x = MM;
		while(x!=1)
		{
			x = x/2;
			pa++;
		}
		
		cm=0;
		int y = cm;
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
		sets=cl/2;
		index=0;
		int w=sets;
		while(w!=1)
		{
			w=w/2;
			index++;
		}
		tb=pa-(Off+index);
		
		cacheMemory=new int[cl][bs];
		tagarr=new String[cl];
		for (int i=0;i<cl ; i++)
		{
			tagarr[i]="";
		}
		
	}
}

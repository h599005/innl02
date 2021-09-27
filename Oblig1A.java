package no.hvl.dat100;

public class Oblig1A 
{
	public static void main(String[] args) 
	{
		int [] tabell = {66,67,89};
		int [] tabelleks = {1,2,3};

		System.out.println(tilStreng(tabell));
		System.out.println();
		skrivUt(tabell);
		System.out.println();
		System.out.println();

		System.out.println(summer(tabell));
		System.out.println();
		System.out.println(summer01(tabell));
		System.out.println();
		System.out.println(summer02(tabell));
		System.out.println();
		System.out.println(finnesTall(tabell,67));
		System.out.println();
		System.out.println(posisjonTall(tabell,67));
		System.out.println();
		int [] tabell2 = reverser(tabell);
		skrivUt(tabell2);
		System.out.println();
		System.out.println();
		System.out.println(erSortert(tabell));
		System.out.println();
		int [] tabell3 = settSammen(tabell, tabelleks);
		skrivUt(tabell3);
	}
	
	public static void skrivUt(int[] tab)
	{
		for (int i = 0; i<tab.length;i++)
		{
		
		System.out.print(tab[i]+ " ");
		}	
	}
	public static String tilStreng (int[] tabell)
	{
		String s = "[" + tabell[0] + "," + tabell[1] + "," + tabell[2] + "]" ;
		return s;
	}
	public static int summer(int[] tab)
	{
		int tmp = 0;
		for (int i = 0; i<tab.length;i++)
		{
		
		  tmp = tmp + tab[i];
		 
		
		}	
		return tmp;

	}
	public static int summer01(int[] tab)
	{
		int j = 0;
		
		int tmp01= 0;
		
		while (j<tab.length)
		{
			
		  tmp01 = tmp01 + tab[j];
		  j++;
		
		}	
		return tmp01;
	}
	public static int summer02(int[] tab)
	{
		int y = 0;
		for (int k : tab)
		{

			y = k +y;
		}	
		return y;
	}
	public static boolean finnesTall (int[] tabell, int tall)
	{
		boolean skjekk = false;
		for(int t=0; t<tabell.length;t++)
		{
			if (tabell[t] == tall)
			{
				skjekk = true;
			}
		}
		return skjekk;
	}
	public static int posisjonTall (int[] tab, int tall)
	{
		int pos = -1;
		for (int p=0;p<tab.length;p++)
		{
			if(tab[p] == tall)
			{
				pos = p;
			}
		}
		
		return pos;
		
	}
	static int[] reverser(int[] tab)
	{
		int [] tab2 = new int[tab.length];
		for(int i = 0; i<tab.length; i++)
		{
			tab2[i] = tab[2-i];
		}
		return tab2;
	}
	static boolean erSortert (int[] tab)
	{
		boolean sotert = false;
		 int i =0;
		 while(i<tab.length-1) 
		 {
			 
			 if(tab[i]<tab[i+1]) 
			 	{
			 		sotert= true;
			 	}
			 else 
			 {
				 sotert = false;
			 }
			 i++;
		 }
		 	 	
		 return sotert;

	}
	public static int[] settSammen(int[] tab1,int[] tab2)
	{
		int [] tab3 = new int[tab1.length + tab2.length];
		
		for (int pos = 0; pos<tab1.length; pos++) 
		{
			//tab3[pos] = tab1[pos]+tab2[pos];
			tab3[pos] = tab1[pos];
		}
		for (int pos2 = 0; pos2<tab2.length; pos2++) 
		{
			tab3[pos2+tab1.length] = tab2[pos2];
		}
		
		return tab3;
		
	}

}

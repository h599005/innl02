package no.hvl.dat100;

public class Oblig1B 
{
	public static void main(String[] args) 
	{	
		int [][] tab ={{1,2,3},{4,5,6},{7,8,9}};
		int tall = 2;
		
		
		System.out.println(tilStreng(tab));
		System.out.println();
		
		int [][] tab01 = skaler(tall, tab);
		skrivUtv1(tab01);
		
		System.out.println();
		System.out.println(erLik(tab, tab01));
		
		System.out.println();
		int [][] tab02 = speile(tab);
		skrivUtv1(tab02);
		System.out.println();
		
		int [][] tab03 = multipliser(tab, tab01);
		skrivUtv1(tab03);
		System.out.println();
	}
	
	public static void skrivUtv1(int[][] matrise)
	{
		for (int i = 0; i < matrise.length; i++) 
		{
	        for (int j = 0; j < matrise[0].length; j++) 
	        {
	            System.out.print(matrise[i][j] + "\t");
	        }
	        System.out.println();
	    }
	}
	
	public static String tilStreng(int[][] tab)
	{      
	 String s = tab[0][0] + "\t" + tab[0][1] + "\t" + tab[0][2] + "\n" + 
			 	tab[1][0] + "\t" + tab[1][1] + "\t" + tab[1][2] + "\n" + 
			 	tab[2][0] + "\t" + tab[2][1] + "\t" + tab[2][2] + "\n";
	 return s; 
	}
	
	public static int[][] skaler(int tall, int[][] matrise)
	{
		int linje = matrise.length;
        int kolonne = matrise[0].length;
        int[][] tab = new int[linje][kolonne];
        
		for (int i = 0; i < matrise.length; i++) 
		{
	        for (int j = 0; j < matrise[0].length; j++) 
	        {
	          tab[i][j] = (matrise[i][j]*tall);
	        }
	    }
		return tab;
	}
	
	public static boolean erLik(int[][] mat1, int[][] mat2)
	{
		boolean lik = false;
		
		for (int i = 0; i < mat1.length; i++) 
		{
	        for (int j = 0; j < mat1[0].length; j++) 
	        {
	        	if (mat1[i][j] == mat2[i][j])
	        	{
	        		lik = true;
	        	}
	        	else
	        		
	        		lik = false;
	        }
		}
		
		return lik;
	}
	
	public static int[][] speile(int [][] matrise)
	{
		int linje = matrise.length;
        int kolonne = matrise[0].length;
        int[][] nytab = new int[linje][kolonne];
		
        for (int i = 0; i < matrise.length; i++) 
		{
	        for (int j = 0; j < matrise[0].length; j++) 
	        {
	          nytab[i][j] = (matrise[2-i][2-j]);
	        }
	    }
		return nytab;
        
	}
	public static int[][] multipliser(int[][] a, int[][] b)
	{
		int linje = a.length;
        int kolonne = a[0].length;
        int[][] tab = new int[linje][kolonne];
        
		for (int i = 0; i < a.length; i++) 
		{
	        for (int j = 0; j < a[0].length; j++) 
	        {
	          tab[i][j] = (a[i][j]* b[i][j]);
	        }
	    }
		return tab;
	}

}

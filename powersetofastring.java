/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		String str;
		str="abc";
		int n=str.length();
		int powsize=(int)(Math.pow(2,n));
		for(int counter=0;counter<powsize;counter++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if((counter&(1<<j))!=0)
		        {
		            System.out.print(str.charAt(j));
		        }
		    }
		    System.out.println(" ");
		}
	}
}
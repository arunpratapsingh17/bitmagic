/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	int n=4;
	int c=0;
	if(n==0)
	{
	    c=-1;
	}
	while(n!=1)
	{
	    if(n%2!=0)
	    {
	        c=-1;
	        break;
	    }
	    n=n/2;
	}
	if(c==-1)
	{
	    System.out.println("Not a power of 2");
	}
	else
	{
	   System.out.println("power of 2");  
	}
	}
}
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int x=40;
		int res=0;
		while(x>0)
		{
		    x=x&(x-1);
		    ++res;
		}
		System.out.println(res);;
	}
}
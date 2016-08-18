import java.util.*;

class revs
{
	public static void main(String[] args)
	{
       String s="manju";
	   StringBuffer sb=new StringBuffer(s);
	   sb.reverse();
	   String s1=sb.toString();
	   System.out.println("reversed string - " +s1);
	}
}
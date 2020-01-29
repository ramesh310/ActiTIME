package Sample;

public class basic1
{
 public static void main(String[] args)
 {
	 basic b=new basic();
	 int s1=b.hashCode();
	 System.out.println("b.hashCode()="+s1);
	 basic b1=new basic();
	 int s2=b1.hashCode();
	 System.out.println("b1.hashCode()="+s2);
	 System.out.println("b="+b);
	 System.out.println("b1="+b1);
 }
}

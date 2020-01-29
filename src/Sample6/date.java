package Sample6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date
{
	public static void main(String[] args)
	{
		String s=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date());
		System.out.println(s);
	}
}

import java.util.Date;

public class Events {
	public String eventName = "";
	public String date = "";
	String range = "";
	String time1 = "";
	String time2 = "";
	public Events(String e, String d, String t1, String t2)
	{
		eventName = e;
		date = d;
		time1 = t1;
		time2 = t2;
		range = ""+e + ": " + d + " " + t1 + " - " + t2 ;
	}
}

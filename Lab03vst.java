// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 80 Point Version\n");

	  int sm = 10000123;
	  System.out.println("Starting Milli Seconds:  " + sm);

	  int h = sm / 3600000;
	  System.out.println("Hours:                   " + h);

	  int rh = sm % 3600000;
	  //System.out.println(rh);
	  int m = rh / 60000;
	  System.out.println("Minutes:                 " + m);

	  int rm =rh % 60000;
	 // System.out.println(rm);
	  int s = rm / 1000;
	  System.out.println("Seconds:                 " + s);

	  int rms = rm % 1000;
	  System.out.println("Milli Seconds:           " + rms);

      
	}
}


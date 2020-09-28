import java.io.*;
class createalbum 
{
	public static void main (String args[]) throws IOException 
	{
		String f; // = String.format("a%04d",1); // 0001
		FileOutputStream fout;
		BufferedOutputStream bout;
		PrintStream pout;
		for(int j=1;j<100000;j++) 
		{
			f = String.format("a%04d",j); // 0001
			fout = new FileOutputStream(f+".htm");
			bout = new BufferedOutputStream(fout);
			pout = new PrintStream(bout);		
			pout.println("Album");
			pout.print("<a href=x.jpg>x</a>");
			pout.close(); // 26 bytes
		}

	}
}
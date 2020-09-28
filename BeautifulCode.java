/* https://beautifier.io/ */
import java.io.*;
public class BeautifulCode{	
  public static void main(String args[]) throws IOException {	
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String buf = stdin.readLine();
    int i = Integer.parseInt(buf);
    do{
      System.out.println(i);
      i--;
    } while (i != 0);	
  }
}
package ttt;



import java.util.*;
import java.io.*;

public class q2 {


public static void main(String args[])throws IOException
{
	
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    int a[]=new int[2];
    
for(int y=0;y<t;y++)
{
    
    String line = br.readLine(); // to read multiple integers line
    String[] strs = line.trim().split("\\s+");
    for (int i = 0; i < 2; i++) 
    {
        a[i] = Integer.parseInt(strs[i]);
    }
    
    
    int b[] = new int[a[0]];
    String line2 = br.readLine(); // to read multiple integers line
    String[] strs2 = line2.trim().split("\\s+");
    for (int i = 0; i < a[0]; i++) 
    {
        b[i] = Integer.parseInt(strs2[i]);
    }
    Arrays.sort(b);
    int count=0;
    int wal=a[1];
    int z=0;
    while(wal>=b[z])
    {
    	
    	wal=wal-b[z];
    	count=count+1;
    			z=z+1;
    		
    }
    
    System.out.println("Case #"+y+": " +count);
}

}
}
	
	
	


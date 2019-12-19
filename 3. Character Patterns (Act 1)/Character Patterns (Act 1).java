import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		for(int i=0;i<p;i++)
		{
			int lines=sc.nextInt();
			int columns=sc.nextInt();
			for(int j=0;j<lines;j++)
			{
				String strLines="";
				{
					for(int k=0;k<columns;k++)
					{
						if(j%2==0){
							if(k%2==0)
							{
								strLines +="*";
							}
							else{
								strLines +=".";
							}
						}
						else{
							if(k%2==0){
								strLines +=".";
							}
							else{
								strLines +="*";
							}
						}
					}
					System.out.println(strLines);
				}
				System.out.println("\n");
			}
		}
		
		
	}
}

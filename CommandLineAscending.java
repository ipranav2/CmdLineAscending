class CommandLineAscending
{
	public static void main(String S[])
	{
			int x=0;
			int i=0;
			x=Integer.parseInt(S[i]);
			int y=Integer.parseInt(S[i+1]);
		for( i=0;i<S.length-1;i++)
			{
				if(x < y)
				System.out.println("ascending");
				else
				System.out.println("not ascending");
				break;
}	
	}
}
			
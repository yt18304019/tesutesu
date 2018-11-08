class Ex1107_2
{
	public static void main(String args[])
	{
		int i;
		
		for(i=1;i<=100;i++)
		{
			switch (i)
			{
				//iが2ならこの処理
				case 2:		
					System.out.println(i);
						break;
				//iが3ならこの処理
				case 3:
					System.out.println(i);
						break;
				//iが5ならこの処理
				case 5:
					System.out.println(i);
						break;
				//iが７ならこの処理
				case 7:
					System.out.println(i);
						break;
				default:
					if(i!=1 && i%2!=0 && i%3 !=0 && i%5!=0 && i%7!=0 && i%9!=0)
					{
					System.out.println(i);
					}
			}
		}
	}
}
	

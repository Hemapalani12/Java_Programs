package javaprgms;

public class RemoveString_DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="automation";
		String res="";
		
		
		for(int i=0;i<=data.length()-1;i++)
		{
			char ch=data.charAt(i);
			boolean present=false;
			for(int j=0;j<=res.length()-1;j++)
			{
				if(ch==res.charAt(j))
				{
					present=true;
					break;
				}
			}
			
			if(!present)
			{
				res+=ch;
			}
		}
		
		System.out.println("original String "+data);
		System.out.println("without duplicate "+res);

	}

}

package javaprgms;

public class FindNumber_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arraynum= {10,20,50,60,80,90,60};
int findnum = 60;
for(int i=0;i<=arraynum.length-1;i++)
{
	if(!(findnum==arraynum[i]))
	{
		continue;
	}
	else
	{
		System.out.println("the given number "+findnum+" is present in position: "+i);
	}
}

	}

}

import java.util.ArrayList;

public class IbmKodehack12jun2024
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(3);
		al.add(4);
		al.add(9);
		int transfer=3;
		ArrayList<Integer>result=oddAndEven(al,transfer);
		System.out.println(result);
	}
	public static ArrayList<Integer> oddAndEven(ArrayList<Integer> arr, int transfer) {
		for(int i=0; i<transfer; i++)
		{
			for(int j=0; j<arr.size(); i++)
			{
				int num=arr.get(j);
				if(num%2==1)
				{
					arr.set(j, num+3);
				}
				else
				{
					arr.set(j, num-3);
				}
			}
		}
		return arr;
	}
}

import java.util.*;
public class Maximum
{
	Public Static<T extends Object & Comparable<? super T >>Maximum(Collection<? extends T >coll)
	{
		Iterator<? extends T >iter=coll.iterator();
		T max=iter.next();
		while(iter.hasNext())
		{
			if(next.CompareTo(max)>0)max=next;
		}
	return max;
	}
Public Static void main(String args[])
{
	List<Integer>in=new ArrayList<Integer>(Array.asList(1,2,3));
	List<Character>ch=new ArrayList<Character>(Array.asList('a','b','c'));
	int inm=Collections.max(in);
	character chm=Collections.max(chs);
	System.out.println("Integer List="+inm+"Maximum="+inm);
	System.out.println("Character List="+chm+"Maximum="+chm);
}
}
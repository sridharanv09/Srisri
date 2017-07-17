public class CharLength {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("wipro technologies");
		StringBuffer sb1=new StringBuffer("");
		sb=sb.reverse();
		String s=new String(sb);
		String[] e=s.split(" ");
		
	int d=0,s1=0;
		for(int i=0;i<b.length;i++)
		{
			d=e[i].length();
			sb1.append(d);
		}
		String m=new String(sb1);
		int m1=Integer.parseInt(m);
		System.out.println(m1);
	}
}
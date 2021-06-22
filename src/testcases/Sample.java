package testcases;

public class Sample {

	public static void main(String[] args) {
String s="Hello This is Triveni bhadri";
String res="";
char st[]=s.toCharArray();
for(int i=(s.length()-1);i>=0;i--)
{
	res=res+st[i];
}
System.out.println(res);


	}

}

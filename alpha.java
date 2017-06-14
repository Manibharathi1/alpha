import java.io.*;
import java.util.Scanner;
public class alpha
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char p=s.next().charAt(0);
if(p>='a' && p<='z' || p>='A' && p<='Z')
{
System.out.println("alphabet");
}
else
{
System.out.println("not a alphabet");
}
}
}

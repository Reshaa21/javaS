import java.util.*;
class Areaoftriangle
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int l,b,area;
System.out.println("Enter Length:");
l=sc.nextInt();
System.out.println("Enter breath:");
b=sc.nextInt();
area=(l*b)/2;
System.out.println("Area of Triangle"+area);
}
}
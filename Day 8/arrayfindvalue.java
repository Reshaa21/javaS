import java.util.*;
class arrayfindvalue
{
  public static void main(String[] args) 
  {
  Scanner sc=new Scanner(System.in);
 int a[]=new int[10];
int i,find,flag=0;

System.out.println("Enter the elements:");
  for(i=0;i<5;i++)
  {
  a[i]=sc.nextInt();
  }
  System.out.println("Enter the finding elements:");
  find=sc.nextInt();
  
   for(i=0;i<5;i++)
   {
   if(find==a[i]);
   {
   flag=1;
   break;
   }
   }
  
  if(flag==1){
System.out.println(find+"The values  present at the array");

 System.out.println("The values is found at the index "+i);

}
if(flag==0)
{
System.out.print("The value is not in the array .");

}
}
}
class Mul
{
  int n,m,j;
  void multi()
  {
    for(int i=1;i<=10;i++)
    {
      System.out.println("3 * "+i+" = "+3*i);
    }
  }
  void multi(int x)
  {
    n=x;
    for(int i=1;i<=10;i++)
    {
      System.out.println(n+" * "+i+" = "+n*i);
    }
  }
  void multi(int w, int y)
  {
    m=w;
    j=y;
    for(int i=1;i<=j;i++)
    {
      System.out.println(m+" * "+i+" = "+m*i);
    } 
  }
}
class Multilicationtablemthodconstructor
{
  public static void main(String arg[])
  {
    Mul obj=new Mul();
    obj.multi(); 
    System.out.println();
    obj.multi(7);
    System.out.println();
    obj.multi(9,10);
  }
}

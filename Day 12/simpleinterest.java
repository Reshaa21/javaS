class simpint
{
	int si,p,r,t;
	void getdata(int x,int y,int z)
	{
    		p=x;
		r=y;
		t=z;
	}
	void cal()
	{
		si=(p*r*t)/100;
	}
	void disp()
	{
		System.out.println("Output simple interset"+si);
	}
}
class simpleinterest
 {
	public static void main(String[] args)
	{
		 simpint obj=new simpint();
		obj.getdata(500,6,2);
		obj.cal();
		obj.disp();
	}
}
package JavaBasics01;

public class Box {
	
	double x,y,z;
	
	Box()
	{
		x=y=z=0;
	}
	
	Box(double a, double b, double c)
	{
		x=a;
		y=b;
		z=c;
	}
	
	Box(int i)
	{
		x=y=z=i;
	}
	
	double vloume()
	{
		return(x*y*z);
	}

}

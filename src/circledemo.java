class circle{
	
int r;


public void displayArea()
{
double a=3.14*r*r;	
System.out.println("area is"+ a);
}

	
}

public class Circledemo{
public static void main(String[]args)
{
circle c= new circle();	
c.r=2;
c.displayArea();

}
}


package xycoordinates;
public class Basicpoint implements Cloneable{
	String x;
    String y;
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    Basicpoint(String x,String y)
    {
  	  this.x=x;
  	  this.y=y;
    }
    boolean checking()
    {
  	  if(this.x.equals(this.y))
  	  {
  		  System.out.println("X and Y Coordinates are Equal");
  		  return true;
  	  }
  	  else {
  		  System.out.println("X and Y Coordinates are NotEqual");
  		  return false;
  	  }
    }
       public static void main(String[] arg) throws CloneNotSupportedException
        {
            	  Basicpoint a1=new Basicpoint("13.7","13.7");
            	  System.out.println(a1.checking());
            	  Basicpoint a2=(Basicpoint)a1.clone(); 
            	  System.out.println("Cloned Coordinates:X-"+a2.x+" Y-"+a2.y);
          }
}

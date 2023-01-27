package xycoordinates;
import java.util.logging.Logger;
public class Basicpoint implements Cloneable{
	Logger l= Logger.getLogger("com.api.jar");
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
  		  l.info("X and Y Coordinates are Equal");
  		  return true;
  	  }
  	  else {
  		  l.info("X and Y Coordinates are NotEqual");
  		  return false;
  	  }
    }
       public static void main(String[] arg) throws CloneNotSupportedException
        {
    	   Logger l= Logger.getLogger("com.api.jar");
            	  Basicpoint a1=new Basicpoint("13.7","13.7");
            	  l.info(a1.checking()+"!!!");
            	  Basicpoint a2=(Basicpoint)a1.clone(); 
            	  l.info("Cloned Coordinates:X-"+a2.x+" Y-"+a2.y);
          }
}

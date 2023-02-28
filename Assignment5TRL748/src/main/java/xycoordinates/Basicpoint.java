package xycoordinates;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Basicpoint implements Cloneable {
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	String x;
    String y;
    public Object clone()
    {
    	try {
           return super.clone();
    	}
    	catch(CloneNotSupportedException e)
    	{
    		out.println("Oops something went wrong"+e);
    		return "";
    	}
    }
    Basicpoint(String x,String y)
    {
  	  this.x=x;
  	  this.y=y;
    }
    boolean checking(String tempx,String tempy)
    {
  	  if(this.x.equals(tempx)&&this.y.equals(tempy))
  	  {
  		  out.println("X and Y Coordinates are Equal");
  		  return  true;
  	  }
  	  else {
  		  out.println("X and Y Coordinates are NotEqual");
  		  return false;
  	  }
    }
       public static void main(String[] arg)
        {
            	  Basicpoint a1=new Basicpoint("13.7","13.7");
            	  Basicpoint a2=new Basicpoint("13.7","13.7");
            	  out.println(a1.checking(a2.x,a2.y));
            	  Basicpoint a3=(Basicpoint)a1.clone();
            	  out.println(a1.checking(a3.x,a3.y));
            	   a3.x="9.0";
            	  out.println(a1.checking(a3.x,a3.y));  
          }
}

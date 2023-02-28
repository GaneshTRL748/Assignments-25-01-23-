package creditcard;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
public class Creditcardoperation implements Cloneable{
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
            String cardname;
            String cardnumber;
            String expirydate;
            protected Object clone()
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
            Creditcardoperation(String cardname,String cardnumber,String expirydate)
            {
            	this.cardname=cardname;
            	this.cardnumber=cardnumber;
            	this.expirydate=expirydate;
            }
            boolean checkcardnumber(String str)
            {
            	if(this.cardnumber.equals(str))
            	{
            		out.println("Card number verified successfully.......");
            		return true;
            	}
            	else {
            		out.println("OOPs wrong card number");
            		return false;
            	}
            }
            public static void main(String[] args) 
            {
            	Scanner p=new Scanner(System.in);
            	out.println("Enter your name and cardnumber and expirydate");
            	String name=p.next();
            	String cardnumber=p.next();
            	String date=p.next();
            	Creditcardoperation a1=new Creditcardoperation(name,cardnumber,date);
            	Creditcardoperation a2=(Creditcardoperation)a1.clone();
            	out.println("Cloned Details:\ncardnumber:"+a2.cardnumber+"\ncardname:"+a2.cardname+"\nexpirydate:"+a2.expirydate);
            	out.println("verification status:"+a1.checkcardnumber(a2.cardnumber));
            }
}

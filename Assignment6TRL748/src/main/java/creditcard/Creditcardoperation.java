package creditcard;
import java.util.*;
import java.util.logging.Logger;
public class Creditcardoperation implements Cloneable {
	         Scanner p=new Scanner(System.in);
	         Logger l= Logger.getLogger("com.api.jar");
            String cardname;
            String cardnumber;
            String expirydate;
            protected Object clone() throws CloneNotSupportedException
            {
                return super.clone();
            }
            Creditcardoperation(String cardname,String cardnumber,String expirydate)
            {
            	this.cardname=cardname;
            	this.cardnumber=cardnumber;
            	this.expirydate=expirydate;
            }
            boolean checkcardnumber()
            {
            	l.info("ENTER YOUR CARD NUMBER");
            	String str=p.nextLine();
            	if(this.cardnumber.equals(str))
            	{
            		l.info("Card number verified successfully.......");
            		return true;
            	}
            	else {
            		l.info("OOPs wrong card number");
            		return false;
            	}
            }
            public static void main(String[] args) throws CloneNotSupportedException
            {
            	Logger l= Logger.getLogger("com.api.jar");
            	Creditcardoperation a1=new Creditcardoperation("ganesh","124717000153950","12.11.2027");
                l.info(a1.checkcardnumber()+"!!!!");
            	Creditcardoperation a2=(Creditcardoperation)a1.clone();
            	l.info("Cloned Details:\ncardnumber:"+a2.cardnumber+"\ncardname:"+a2.cardname+"\nexpirydate:"+a2.expirydate);
            }
}

package databaseconnection;

public class Jdbcconnect {

	public static void main(String[] args) throws ClassNotFoundException
	{
		   Singleton a2=Singleton.getobject();
           a2.connect2db();
           a2.closedbconnection();
	}

}

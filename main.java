package assignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		

		try
		{
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction txt=session.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		Scanner Sc=new Scanner(System.in);
		
		Person p=new Person();
		System.out.println("Enter name:");
		String name=sc.next();
		p.setName(name);
		
		System.out.println("Enter License number:");
		int lno=Sc.nextInt();
		p.setLno(lno);
		
		System.out.println("Enter 1 if color blind else 0");
		Boolean ans=sc.hasNextByte();
		p.setIs_colour_blind(ans);
		
		
		Car cobj=new Car();
		
		System.out.println("Enter Number Plate");
		int nplate=Sc.nextInt();
		cobj.setNnumberplate(nplate);
		
		System.out.println("Enter Color of Car");
		String colour=Sc.next();
		cobj.setColour(colour);
		
		
		System.out.println("Enter Engine name");
		String Ename=Sc.next();
		cobj.setEngine(Ename);
		
		p.setCar(cobj);
		
		session.save(p);
		session.save(cobj);
		
		
		
		txt.commit();
		System.out.println("Data Inserted Sucessfully!");
		session.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
		

	}

}
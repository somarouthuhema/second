package org.techouts.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.techouts.hibernate.pojos.ChequePayment;
import org.techouts.hibernate.pojos.CreditCard;  

  

public class Client {
	public static void main(String[] args)
	
	{
		Configuration cg=new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf=cg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();    
	          CreditCard cc =new CreditCard();
	           cc.setPayId(4);
	  		   cc.setAmount(4000);
	  		   cc.setCardType("ICICI");
	  		CreditCard cc1=new CreditCard();
	  		   cc1.setPayId(6);
	  		   cc1.setAmount(6000);
	  		   cc1.setCardType("HDFC");
	  		ChequePayment cp=new ChequePayment();
	  		cp.setPayId(7);
			cp.setAmount(5000);
			cp.setChequeType("cheque");
			 s.persist(cc);    
	            s.persist(cc1);    
	            s.persist(cp);    
	                
	            tx.commit();    
	            s.close();    
	            System.out.println("success");
			
		
		
		
	}

}

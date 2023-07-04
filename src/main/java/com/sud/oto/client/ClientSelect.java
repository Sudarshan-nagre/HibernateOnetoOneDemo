package com.sud.oto.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sud.oto.entity.Stock;
import com.sud.oto.entity.StockDetail;
import com.sud.oto.util.HibernateUtil;

public class ClientSelect {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one exmple using Annotation");
		
		SessionFactory fct = HibernateUtil.getSessionFactory();
		Session session = fct.openSession();

		Stock stock = session.load(Stock.class, 1);
		
		StockDetail sd = stock.getStockDetail();
		
		System.out.println(sd.getCompName());
		System.out.println(sd.getListedDate());
		
		session.close();
	}
}

package com.sud.oto.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sud.oto.entity.Stock;
import com.sud.oto.entity.StockDetail;
import com.sud.oto.util.HibernateUtil;

public class Client {
	public static void main(String[] args) {
		SessionFactory fct = HibernateUtil.getSessionFactory();
		Session session = fct.openSession();
		Transaction tx= session.beginTransaction();

		Stock stock = new Stock();

		stock.setStockCode("103");
		stock.setStockName("Milk");

		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("Amul milk");
		stockDetail.setListedDate(new Date());

		stock.setStockDetail(stockDetail);
		
		session.save(stock);
		tx.commit();
		session.close();

		System.out.println("Done");
	}
}

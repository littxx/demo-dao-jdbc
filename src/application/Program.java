package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Departament loko = new Departament("books", 1);
		System.out.println(loko);
		
	
		
		Seller vender = new Seller("eden", 1, "eden", new Date(), 50.5, loko);
		
		SellerDao vendedor = DaoFactory.createSellerDao();
		
		System.out.println(vender);
		
		
		
	}

}

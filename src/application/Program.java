package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST1: seller findbyid ===");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}

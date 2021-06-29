package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST1: seller findbyid ===");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST2: seller findbydeparid ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST3: seller findall ===");
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST4: seller insert ===");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("insertednew id : " + newSeller.getId());
		
		System.out.println("\n=== TEST5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Marta Eine");
		sellerDao.update(seller);
		System.out.println("updated completo");
		
		System.out.println("\n=== TEST6: seller delete ===");
		System.out.println("coloque um id para deletar: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("delete compelto");
		
		
		sc.close();
	}

}

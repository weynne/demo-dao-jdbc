package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.ceateDepartmentDao();
		
		Department dep = departmentDao.findById(2);
		
		System.out.println(dep);
		
		sc.close();
	}
}

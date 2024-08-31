package thai.dev;

<<<<<<< HEAD
import java.sql.DriverManager;

public class MainApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String DB_URL ="jdbc:mysql://localhost:3306/shop";
		final String USER ="root";
		 final String PASS ="";

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	DriverManager.getConnection(DB_URL,USER,PASS);
	System.out.println("ket noi thanh cong");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
 
=======
import thai.dev.data.dao.CategoryDao;
import thai.dev.data.impl.CategoryImpl;
import thai.dev.data.model.Category;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryDao categoryDao = new CategoryImpl();
		Category cat = new Category(1,"ADIDAS","http://ss");
		categoryDao.insert(cat);
		
//		Category find = categoryDao.find(3);
//		System.out.println(find.name);
//		find.name ="ao qua dai";
//		categoryDao.update(find);
//		categoryDao.delete(find.id);
		
	}

>>>>>>> d54aa490aacc7eaa3bda13154d26915b7b1fc5a1
}

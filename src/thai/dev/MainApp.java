package thai.dev;

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

}

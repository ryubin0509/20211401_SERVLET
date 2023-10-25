package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅
    private static ProductRepository instance = new ProductRepository();

   public static ProductRepository getInstance(){
	return instance;
   }

    
	public ProductRepository() {
       
        
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
        
        Product phone_1 = new Product("P1235", "갤럭시 S23", 1400000);
		phone_1.setDescription("6.1-inch, 2340 x 1080 FHD+ display, Dynamic AMOLED 2X");
		phone_1.setCategory("Smart Phone");
		phone_1.setManufacturer("Samsung");
		phone_1.setUnitsInStock(1000);
		phone_1.setCondition("New");
        
        Product phone_2 = new Product("P1236", "갤럭시 Z 플립5", 1180000);
		phone_2.setDescription("6.7-inch, 2640 x 1080 FHD+ display, Dynamic AMOLED 2X");
		phone_2.setCategory("Smart Phone");
		phone_2.setManufacturer("Samsung");
		phone_2.setUnitsInStock(1000);
		phone_2.setCondition("New");
        
        Product tablet = new Product("P1237", "Galaxy Tab S" , 900000);
		tablet.setDescription("212.8*125.6*6.6mm,  Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
        
        Product tablet_1 = new Product("P1238", "Apple 아이패드 에어 5세대 ", 830000);
		tablet_1.setDescription("178.5*247.6*6.1mm,  2360x1640, Apple M1 ");
		tablet_1.setCategory("Tablet");
		tablet_1.setManufacturer("Apple");
		tablet_1.setUnitsInStock(1000);
		tablet_1.setCondition("New");
        //상품명: Apple 아이패드 에어 5세대 M1 WIFI 64G 스페이스 그레이
        
        Product notebook = new Product("P1239", "LG PC 그램", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
        
        Product notebook_1 = new Product("P1240", "삼성 노트북 플러스2", 530000);
		notebook_1.setDescription("15.6-inch, 1920x1080(FHD) display , 펜티엄-7505");
		notebook_1.setCategory("Notebook");
		notebook_1.setManufacturer("Samsung");
		notebook_1.setUnitsInStock(1000);
		notebook_1.setCondition("Refurbished");

        
        Product desktop = new Product("P1241", "삼성 DM500TFA-A58A" , 947000);
		desktop.setDescription("173 x 406 x 356mm, SSD용량 : 256GB , 코어i5 13세대");
		desktop.setCategory("Desk Top");
		desktop.setManufacturer("Samsung");
		desktop.setUnitsInStock(1000);
		desktop.setCondition("New");
		       
        Product desktop_1 = new Product("P1242", "LG전자 B81KV-AX3509" , 840000);
		desktop_1.setDescription("17.7cm, SSD용량 : 256GB , 코어i5 13세대");
		desktop_1.setCategory("Desk Top");
		desktop_1.setManufacturer("Lg");
		desktop_1.setUnitsInStock(1000);
		desktop_1.setCondition("New");
       
 
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(phone);
        listOfProducts.add(phone_1);
        listOfProducts.add(phone_2);
        listOfProducts.add(tablet);
        listOfProducts.add(tablet_1);
		listOfProducts.add(notebook);
        listOfProducts.add(notebook_1);
        listOfProducts.add(desktop);
        listOfProducts.add(desktop_1);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
    public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
     public void addProduct(Product product) {
	listOfProducts.add(product);
   }

}
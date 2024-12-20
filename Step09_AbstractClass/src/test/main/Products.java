package test.main;

public class Products {
	String productname;
	int price;
	int quantity;
	
	public static void main(String[] args) {
		ProductOrder[] products=new ProductOrder[3];
		
		ProductOrder pd1= new ProductOrder();
		pd1.productname= "두부";
		pd1.price=2000;
		pd1.quantity=2;
		products[0]=pd1;
		
		ProductOrder pd2= new ProductOrder();
		pd2.productname= "김치";
		pd2.price=5000;
		pd2.quantity=1;
		products[1]=pd2;
		
		ProductOrder pd3= new ProductOrder();
		pd3.productname= "콜라";
		pd3.price=1500;
		pd3.quantity=2;
		products[2]=pd3;
		
		
		 
		
		
		
		for(ProductOrder ppp: products) {
			 
			System.out.println("상품명은 " + ppp.productname + "이고요오옹  가격은요 " +  ppp.price + "이며  수량은 "  +  ppp.quantity );
			
		}
		
		
		
		
		
				
		
		
	}

}
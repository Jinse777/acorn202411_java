package test.main;
/*
 * 상품명: 두부, 가격: 2000, 수량: 2
상품명: 김치, 가격: 5000, 수량: 1
상품명: 콜라, 가격: 1500, 수량: 2
총 결제 금액: 12000
 */

public class ProductOrder {
	String productname;
	int price;
	int quantity;
	
	public static void main(String[] args) {
		ProductOrder pd1= createOrder("두부", 2000,2);
		ProductOrder pd2= createOrder("김치", 5000,1);
		ProductOrder pd3= createOrder("콜라", 1500,2);
		
		System.out.println("상품명: " + pd1.productname+ "  가격: " + pd1.price + "  수량: " +pd1.quantity);
	}
		
		
		static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder pd=new ProductOrder();
		pd.productname=productName;
		pd.price=price;
		pd.quantity=quantity;
		return pd;
		}
		
		
		
	 
  }



				
		
		
		
				
		
		
	



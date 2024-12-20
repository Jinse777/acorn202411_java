package test.mypac;

public class OrangeBox {
	
		private Orange item;
		
		
		public void pack(Orange item) {
			this.item=item;
			
		}

		
		public Orange unPack() {
			return item;
		}
		
		OrangeBox box1=new OrangeBox();
		
		Orange orange = box1.unPack();
	}




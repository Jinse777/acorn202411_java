package test.main;

public class MovieReview {
	String title;
	String review;
	
	public static void main(String[] args) {
		MovieReview inception= new MovieReview();
		inception.title= "인셉션";
		inception.review="좋았음";
		
		MovieReview AboutTime= new MovieReview();
		AboutTime.title="어바웃타임";
		AboutTime.review="괜찮았음";
		
		MovieReview[] Movies= new MovieReview[] {inception, AboutTime};
		
		Movies[0]=inception;
		Movies[1]=AboutTime;
		
	
		
		for(MovieReview mm : Movies) {
			
			System.out.println("영화제목 : " + mm.title + " 감상평:" + mm.review);
		}
		
		
		
	}
}

	
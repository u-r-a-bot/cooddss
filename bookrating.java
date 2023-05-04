import java.util.*;
class rating{
	float bookRating[][] = new float[50][4];
	float avgRating[] = new float[4];
	rating(float bookRating[][]){
		this.bookRating = bookRating;
	}
	void avgRate(){
		int i=0;int j=0;
		for(i=0;i<4;i++){
			float avg=0;
			j=0;
			while((bookRating[j][i]!=0.0)){
				avg+=bookRating[j][i];	
				j++;
			}
			avg = avg/j;
			System.out.println("The avg rating of Book"+(i+1)+" "+avg);
			avgRating[i] = avg;
			
		}
	}
	void  highest(){
		float max=0;
		int maxBook=0;
		for(int i=0;i<4;i++){
			if(avgRating[i]>max){
				max = avgRating[i];
				maxBook =i;
			}
		}
		System.out.println("Book with highest rating is book number:"+(maxBook+1));
	}
}

class bookrating{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int book =0;
		float bookRating[][] = new float[50][4];
		while(book <4){
			System.out.println("Enter the number of readers for book "+(book+1)+" ");
			int readers = sc.nextInt();
			for(int i=0;i<readers;i++){
				System.out.println("Enter rating by user: "+(i+1)+" ");
				float rating = sc.nextFloat();
				bookRating[i][book] = rating;
			}
			book++;
		}
		rating a = new rating(bookRating);
		a.avgRate();
		a.highest();
	}
}

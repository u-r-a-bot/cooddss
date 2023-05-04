import java.util.*;

class encrypted{
	public static void main(String args[]){
		int key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		key = sc.nextInt();
		String text;
		System.out.println("Enter the message you want to encrypt: ");
		text = sc.next();
		char encrypted[]  = text.toCharArray();
		for(int i=0;i<encrypted.length;i++){
			if(encrypted[i] +key > 126){
				encrypted[i] = (char)(32 + ((encrypted[i] + key) -127));
			}
			else
				encrypted[i] = (char)(encrypted[i] + key);
		}
		System.out.println("The encrypted message is: "+String.valueOf(encrypted));
		
		
	}
}

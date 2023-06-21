import java.util.*;
import java.lang.*;
import java.io.*;

class updation_Deletion{
	public static void main(String[] args){
	File myFile = new File("Gone.txt");
	try{
		myFile.createNewFile();
		System.out.println("The file has been Created Successfully");
	}catch(Exception e){
		System.out.println(e);
}
	try{
		FileWriter filewrite = new FileWriter("Gone.txt");
		filewrite.write("This shit has been done Before\nAnd will be done again \nAgain and again");
		filewrite.close();
	}catch(Exception e){	System.out.println(e);}
	String[] mystring = new String[10];
	int i=0;
	try{
		Scanner myscanner = new Scanner(myFile);
		while(myscanner.hasNextLine()){
			mystring[i] = myscanner.nextLine();
			i++;}
			myscanner.close();
	}catch(Exception e){System.out.println(e);}
	for(int j=0;j<i;j++){
		System.out.println(mystring[j]);
}
	
	if(myFile.delete()){
		System.out.println("The file " + myFile.getName()+" Has been deleted ");
}
	else{
		System.out.println("Deletion Failed Successfully");
}
}

}
import java.util.*;

interface randword{
	void initDictionary();
	String ChooseRandomWord();	
}
class gamecode implements randword{
	Random ran = new Random();
	static global String actualWord;
	static global String[] wordList;
	gamecode(){
		initDictionary();
		actualWord = ChooseRandomWord();
	}
	public	void initDictionary(){
		wordList = new String[5];
		wordList[0] = "guess";
		wordList[1] = "the";
		wordList[2] = "game";
		wordList[3] = "gone";
		wordList[4] = "wrong";
	}
	public	String ChooseRandomWord(){
		int chooser = ran.nextInt();
		return wordList[chooser];
	}
	void start(){
		System.out.println("WElcome to Hangman game.");
		System.out.println("Here you will have to guess a letter of the word i have chosed word:");
		System.out.println("If you win you will be hanged. IF you lose you will not be hanged");
		
		
		
		
		
	}
}

class game{
	public static void main(String[] args){
		gamecode obj = new gamecode();
		obj.start();
	}
}

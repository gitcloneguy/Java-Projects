package main.src.main.java;
import java.util.Scanner;
public class WordRandomizer {

	public static void main(String[] args) {
		
		int d=31;
		Scanner sc = new Scanner(System.in);
		while(d==31) {
		System.out.println("enter words");
		String cards = sc.nextLine();
		
        cards = shuffle(cards);
        System.out.println("Shuffled  = " + cards);
		}
        sc.close();
     }

    static String shuffle(String cards){
        if (cards.length()<=1)
            return cards;

        int split=cards.length()/2;

        String temp1=shuffle(cards.substring(0,split));
        String temp2=shuffle(cards.substring(split));

        if (Math.random() > 0.5) 
            return temp1 + temp2;
        else
            return temp2 + temp1;
	}
        
}

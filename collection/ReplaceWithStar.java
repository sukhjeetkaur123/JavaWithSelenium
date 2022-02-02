package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceWithStar {
	ArrayList<String> list = new ArrayList<String>();
	void list1() {

        list.add("stupid");
        list.add("idiot");
        boolean containsSearchStr = list.stream().anyMatch("stupid"::equalsIgnoreCase);
    }

    public void replacebadwords() {
        Scanner sc = new Scanner(System.in);
        list1();
        System.out.println("Please Enter Any Word : ");
        String word = sc.nextLine();
        for(String word1 : list) {

            word=word.replace(word1, "*****");
        }
        System.out.println(word);
    }
    public static void main(String[] args) {

    	 ReplaceWithStar jv = new ReplaceWithStar();
        jv.replacebadwords();
    }

	private boolean equalsIgnoreCase(String string1) {
		return false;
	}
}

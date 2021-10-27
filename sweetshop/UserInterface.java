package bridgelabz.sweetshop;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	private static UserInterface instance;
	private UserInterface() {
		
	}
	public static synchronized UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}
	
	public int showUserMenu() {
		System.out.println(":::::::Menu:::::::");
		System.out.println("(1) Add Sweets");
		System.out.println("(2) Remove Sweets");
		System.out.println("(3) Edit Sweets");
		System.out.println("(4) Print all Sweets");
		System.out.println("(5) Print Diet Sweets");
		System.out.println("(6) Print Normal Sweets");
		System.out.println("(7) Exit ");
		
		Scanner scan = new Scanner(System.in);
		System.out.println(":::::Please select your option from Menu:::::");
		int option = scan.nextInt();
		return option;
	}
	public void print(Set<Sweet> set) {
		for(Sweet sweet:set) {
			System.out.println(sweet);
		}	
	}
	public void printIdiet(Set<Sweet> set) {
		for(Sweet sweet:set) {
			if(sweet instanceof IDiet)
			System.out.println(sweet);
		}
	}
	public void printNormal(Set<Sweet> set) {
		for(Sweet sweet:set) {
			if(sweet instanceof INormal)
			System.out.println(sweet);
		}
	}
}


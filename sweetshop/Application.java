package bridgelabz.sweetshop;
import java.util.Scanner;
import java.util.Set;

public class Application {
	//SweetRepository sweetRepository = SweetRepository.getInstance();
	//UserInterface ui = UserInterface.getInstance();
	
	public static void main(String[] args) {
		int option = 0;
		System.out.println("Welcome to Sweet shop Management System");
		Application application = new Application();
		UserInterface ui = UserInterface.getInstance();
		
		while(option  != 7) {
			option = ui.showUserMenu();
			application.handleUserSelection(option);
		}
		System.out.println("........Good Bye........");	
	}
	public void handleUserSelection(int option) {
		SweetRepository sweetRepository = SweetRepository.getInstance();
		UserInterface ui = UserInterface.getInstance();
		switch(option) {
		case 1:
			addSweet();
			break;
		case 2:
			System.out.println("Enter the Sweet Name which you want to Delete");
			Scanner scan = new Scanner(System.in);
			String sweetName = scan.next();
			Sweet sweet = sweetRepository.getSweet(sweetName);
			sweetRepository.delete(sweet);
			break;
		case 3:
			System.out.println("Enter the Sweet Name to Edit:");
			Scanner scanner = new Scanner(System.in);
			String editName = scanner.next();
			Sweet editedSweet = sweetRepository.getSweet(editName);
			System.out.println("\n Enter 1 to edit Category \n Enter 2 to edit color" +
					"\n Enter 3 to price \n Enter 4 to edit id" +"\n Enter 5 to edit name");
			
			int getInput = scanner.nextInt();
			switch(getInput) {
			
			case 1:
				System.out.println("\n Enter 1 for Milk Category"
						+"\n Enter 2 for Sugarless Category \n Enter 3 for Jaggery Category" +"\n Enter 4 for Ghee Category ");
				
				int getCategory = scanner.nextInt();
				
				switch (getCategory) {
				case 1:
					editedSweet.category= Sweet.Category.MILK;
					break;
				case 2:
					editedSweet.category= Sweet.Category.SUGARLESS;
					break;
				case 3:
					editedSweet.category= Sweet.Category.JAGGERY;				
					break;
				case 4:
					editedSweet.category= Sweet.Category.GHEE;
					break;
				}
				break;
				
			case 2:
				System.out.println("\n Enter 1 for BROWN color"
						+"\n Enter 2 for RED color \n Enter 3 for GREEN" 
						+"\n Enter 4 for WHITE \n Enter 5 for BROWN_WHITE color"
						+"\n Enter 6 for YELLOW color");
				int getColor = scanner.nextInt();
				
				switch (getColor) {
				case 1:
					editedSweet.color = Sweet.Color.BROWN;
					break;
				case 2:
					editedSweet.color = Sweet.Color.RED;
					break;
				case 3:
					editedSweet.color = Sweet.Color.GREEN;				
					break;
				case 4:
					editedSweet.color = Sweet.Color.WHITE;
					break;
				case 5:
					editedSweet.color = Sweet.Color.BROWN_WHITE;
					break;
				case 6:
					editedSweet.color = Sweet.Color.YELLOW;
					break;
				}
				break;
			case 3:
				System.out.println("Enter the new price amount");
				int getPrice = scanner.nextInt();
				editedSweet.price = getPrice;
				break;
			case 4:
				System.out.println("Enter the new Id");
				int getId= scanner.nextInt();
				editedSweet.price = getId;
				break;
			case 5:
				System.out.println("Enter the new Sweet Name");
				int getSweetName= scanner.nextInt();
				editedSweet.price = getSweetName;
				break;
			default:	
			}
			break;
		case 4:
			Set<Sweet> sweetList = sweetRepository.getSweetList();
			System.out.println("Printing All Sweets:");
			ui.print(sweetList);
			break;
		case 5:
			Set<Sweet> sweetListDiet = sweetRepository.getSweetList();
			System.out.println("Printing Diet Sweets:");
			ui.printIdiet(sweetListDiet);
			break;
		case 6:
			Set<Sweet> sweetListNormal = sweetRepository.getSweetList();
			System.out.println("Printing Normal Sweets:");
			ui.printNormal(sweetListNormal);
			break;
		case 7:
			break;
		default:
		}	
	}
	
	public void addSweet() {
		GulabJamun objGulabJamun = new GulabJamun();
		objGulabJamun.id = "g001";
		objGulabJamun.price = 200;
		
		Laddu objLaddu = new Laddu();
		objLaddu.id = "l1002";
		objLaddu.price = 250;
		
		Laddu objLaddu2 = new Laddu();
		objLaddu2.id = "l1002";
		objLaddu2.price = 250;
		
		Modak objModak = new Modak();
		objModak.id = "m1003";
		objModak.price = 150;
		
		Rasagulla objRasagulla= new Rasagulla();
		objRasagulla.id = "r1004";
		objRasagulla.price = 250;
		
		Rasmalai objRasamalai= new Rasmalai();
		objRasamalai.id= "r1005";
		objRasamalai.price = 300;
		
		DatesBarfi datesbarfi = new DatesBarfi();
		datesbarfi.id = "D1006";
		datesbarfi.price = 450;
		
		SweetRepository sweetRepository = SweetRepository.getInstance();
		sweetRepository.add(objGulabJamun);
		sweetRepository.add(objLaddu);
		sweetRepository.add(objModak);
		sweetRepository.add(objRasagulla);
		sweetRepository.add(objRasamalai);
		sweetRepository.add(objLaddu2);
		sweetRepository.add(datesbarfi);
	}
}
		

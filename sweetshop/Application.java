package bridgelabz.sweetshop;
import java.util.Scanner;
import java.util.Set;

public class Application {
	
	public void handleUserSelection(int option) {
		SweetRepository sweetRepository = SweetRepository.getInstance();
		UserInterface ui = UserInterface.getInstance();
		Set sweetSet = sweetRepository.getSweetList();
		switch(option) {
		case 1:
			addSweet();
			break;
		case 2:
			deleteSweet();
			break;
		case 3:
			editSweet();
			break;
		case 4:
			System.out.println("Printing All Sweets:");
			ui.print(sweetSet);
			break;
		case 5:
			
			System.out.println("Printing Diet Sweets:");
			ui.printIdiet(sweetSet);
			break;
		case 6:
			
			System.out.println("Printing Normal Sweets:");
			ui.printNormal(sweetSet);
			break;
		case 7:
			break;
		default:
			System.out.println("Invalid Entry,Please enter the correct option!");
			break;
		}	
	}
	public void addSweet() {
		Sweet sweet = new Sweet();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sweet Name:");
		sweet.name = scanner.next();
		System.out.println("Enter the Sweet Color:");
		setColor(sweet);
		System.out.println("Enter the Sweet Category:");
		setCategory(sweet);
		System.out.println("Enter the Sweet Price:");
		int price = scanner.nextInt();
		sweet.price = price;
		System.out.println("Enter the Sweet ID");
		String id = scanner.next();
		sweet.id = id;
		System.out.println("Enter the property Type:");
		setProperty(sweet);	
		SweetRepository sweetRepository = SweetRepository.getInstance();
		sweetRepository.add(sweet);
	}
	
	public void editSweet() {
		SweetRepository sweetRepository = SweetRepository.getInstance();
		System.out.println("Enter the Sweet Name to Edit:");
		Scanner scanner = new Scanner(System.in);
		String editName = scanner.next();
		Sweet editedSweet = sweetRepository.getSweet(editName);
		System.out.println("\n Enter 1 to edit Category \n Enter 2 to edit Color" +
				"\n Enter 3 to Price \n Enter 4 to edit Id" +"\n Enter 5 to edit Name");
		
		int getInput = scanner.nextInt();
		switch(getInput) {
		case 1:
			setCategory(editedSweet);
			
		case 2:
			setColor(editedSweet);
			
		case 3:
			System.out.println("Enter the new price amount");
			int getPrice = scanner.nextInt();
			editedSweet.price = getPrice;
		
		case 4:
			System.out.println("Enter the new Id");
			String getId= scanner.next();
			editedSweet.id = getId;
			
		case 5:
			System.out.println("Enter the new Sweet Name");
			String getSweetName= scanner.next();
			editedSweet.name = getSweetName;
			break;
		default:	
			System.out.println("Invalid Entry,Please enter the correct option!");
			break;
		}
	}
	public void deleteSweet() {
		SweetRepository sweetRepository = SweetRepository.getInstance();
		System.out.println("Enter the Sweet Name which you want to Delete");
		Scanner scan = new Scanner(System.in);
		String sweetName = scan.next();
		Sweet sweet = sweetRepository.getSweet(sweetName);
		sweetRepository.delete(sweet);
	}
	public void setProperty(Sweet editedSweet) {
		System.out.println("Enter for Property\n 1. for DIET\n 2. for NORMAL");
		Scanner scanner = new Scanner(System.in);
		int property = scanner.nextInt();
		switch(property) {
		case 1:
			editedSweet.propertyType = Sweet.PropertyType.DIET;
			break;
		case 2:
			editedSweet.propertyType = Sweet.PropertyType.NORMAL;
			break;
		default:
			System.out.println("Invalid Entry,Please enter the correct Options!");
		}
	}
	public void setColor(Sweet editedSweet){
		
		Scanner scanner = new Scanner(System.in);
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
	default:
		System.out.println("Invalid Entry,Please enter the correct Options!");
		}
	}
	public void setCategory(Sweet editedSweet) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Enter 1 for Milk Category"
			+"\n Enter 2 for Sugarless Category \n Enter 3 for Jaggery Category" 
			+"\n Enter 4 for Ghee Category ");
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
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Sweet shop Management System");
		Application application = new Application();
		UserInterface ui = UserInterface.getInstance();
		while(true) {
			int option = ui.showUserMenu();
			if(option != 0) {
			application.handleUserSelection(option);
			}else {
				break;
			}
		}
		System.out.println("........Good Bye........");	
	}
}

		

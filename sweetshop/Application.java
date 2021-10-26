package bridgelabz.sweetshop;
import java.util.Set;

public class Application {
	SweetRepository sweetRepository = new SweetRepository();
	UserInterface ui = new UserInterface();
	
	public static void main(String[] args) {
		int option = 0;
		System.out.println("Welcome to Sweet shop Management System");
		Application application = new Application();
		while(option  != 7) {
			option = application.ui.showUserMenu();
			application.handleUserSelection(option);
		}
		System.out.println("........Good Bye........");	
	}
	public void handleUserSelection(int option) {
		switch(option) {
		case 1:
				addSweet();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			Set sweetList = sweetRepository.getSweetList();
			System.out.println("Printing All Sweets:");
			ui.print(sweetList);
			break;
		case 5:
			Set sweetListDiet = sweetRepository.getSweetList();
			System.out.println("Printing Diet Sweets:");
			ui.printIdiet(sweetListDiet);
			break;
		case 6:
			Set sweetListNormal = sweetRepository.getSweetList();
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
		
		//SweetRepository sweetRepository = new SweetRepository();
		sweetRepository.add(objGulabJamun);
		sweetRepository.add(objLaddu);
		sweetRepository.add(objModak);
		sweetRepository.add(objRasagulla);
		sweetRepository.add(objRasamalai);
		sweetRepository.add(objLaddu2);
		sweetRepository.add(datesbarfi);
	}
}
		/*GulabJamun objGulabJamun = new GulabJamun();
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
		
		SweetRepository sweetRepository = new SweetRepository();
		sweetRepository.add(objGulabJamun);
		sweetRepository.add(objLaddu);
		sweetRepository.add(objModak);
		sweetRepository.add(objRasagulla);
		sweetRepository.add(objRasamalai);
		sweetRepository.add(objLaddu2);
		sweetRepository.add(datesbarfi);
		
		
		UserInterface ui = new UserInterface();
		Set<Sweet> sweetSet = sweetRepository.getSweetList();
		System.out.println("Printing Normal Sweets:");
		ui.printNormal(sweetSet);
		
		sweetRepository.delete(objRasagulla);
		sweetRepository.delete(objRasamalai);
		
		System.out.println("After Deleting the Remaining sweets are:");
		ui.print(sweetSet);
		System.out.println("Printing Diet Sweets:");
		ui.printIdiet(sweetSet);*/
	



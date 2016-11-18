/*******************************************
    Author: Angel Carrillo
    Email: aa.ccp@outlook.com
    Title: Enumerations
    Description: Practice for Enumerations
********************************************/

public class EnumExample{
	public static void main(String[] args) {
		Apps app;

		System.out.println("These are the Apps: ");
		for(Apps currentApp : Apps.values()){
			System.out.println(currentApp.print());
		}

		app = Apps.DUOLINGO;
		System.out.println("\nSelected App: ");
		switch(app){
			case COURSERA:
				System.out.println("Coursera");
				break;
			case PLURALSIGHT:
				System.out.println("PluralSight");
				break;
			case LYNDA:
				System.out.println("Lynda");
				break;
			case DUOLINGO:
				System.out.println("Duolingo");
				break;
		}
	}
}
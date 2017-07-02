package typeM.Czerwoni;
import java.util.Scanner;


public class Menu {
	
	private String choice;
	private Scanner choiceInput = new Scanner(System.in);
	private String pathToDir;
	private Boolean repeat = true;
	
	public Menu(String pathToDir) {
		this.pathToDir = pathToDir;
	}
	
	private void returnToMainMenu() {
		System.out.println("Wcisnij r aby powrocic do menu glownego");
		choice = choiceInput.nextLine().toLowerCase();
		if (choice.equals("r")) {
			printMenu();
		}
	}
	
	public void printMenu() {
		System.out.println("Witamy w systemie!");
		System.out.println("Wybierz funkcjonalno��");
		System.out.println(pathToDir);
		System.out.println("1. Lista pracownik�w - alfabetycznie z liczb� godzin w danym roku");
		System.out.println("2. Lista projekt�w - godziny w danym roku");
		System.out.println("3. Dany pracownik - projekty z liczb� godzin w danym roku");
		System.out.println("4. Procent zaanga�owania danego pracownika w projket");
		System.out.println("Aby wyjść wciśnij 'n'");
		

		
		
		while (repeat) {
			choice = choiceInput.nextLine().toLowerCase();
			switch (choice) {
			case "1":
				// TODO
				System.out.println("Wybrana opcja 1");
				System.out.println("Raport 1");
				returnToMainMenu();
				break;
			case "2":
				// TODO
				System.out.println("Wybrana opcja 2");
				break;
			case "3":
				// TODO
				System.out.println("wybrano opcje 3");
				break;
			case "4":
				// TODO
				System.out.println("Wybrano opcje 4");
				break;
			case "n":
				// TODO
				System.out.println("Exit!");
				repeat = false;
				break;
			default:
				System.out.println("Invalid value!");
				break;
			}
		}
		
	}
}

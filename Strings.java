
public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		bookTitle = "The Lord of the Rings";
		String wordChoice = "Ring";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		// (browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Chris";
		String lastName = "Duke";
		String SSN = "555-55-5555";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.println(SSN.substring(5));
	}

}

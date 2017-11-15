
public class SeminarTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();

	}
	
	private static void displayGreeting() {
		System.out.println("Willkomen zu dem ersten Workshop");
		System.out.println("Heute geht es um Versionsverwaltung mit Git und GitHub");
		System.out.println ("Meine erste Änderung on master branch");
	}

}

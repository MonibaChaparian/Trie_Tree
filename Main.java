import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		menu();
		
		
	}
	
	
	static void menu() {
		System.out.printf("%40s","<<<<welcome>>>> \n\n");
		System.out.printf("%47s","1.Enter the Strings and insert it \n");
		System.out.printf("%35s","2.Search in Trie tree \n");
		System.out.printf("%46s","3.Delete a string from Trie tree \n");
		System.out.printf("%34s","4.show words in tree \n");
		System.out.printf("%38s","Please Enter your choice: ");
		Scanner scanner=new Scanner(System.in);
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1 :{
			String key = null;
			System.out.printf("%30s","Enter your String:");
			key = scanner.next();
			key += scanner.nextLine();
			String[] words = key.split(" ");
			for(int j=0; j<words.length; j++) {
				key= words[j];
				Trie.Insert(key);
				Trie.output(words[j]);
			}
			System.out.printf("%42s","For back to main menu enter 4:");
			
			int i= scanner.nextInt();
			System.out.println();
			if(i==4)
				menu();
			
			
			
		} break;
		case 2 :{
			System.out.printf("%42s","Enter the string you look for:");
			String key = scanner.next();
			if(Trie.Search(key)==true) {
				System.out.println(key+" was found in tree");
			}
			else System.out.println(key+" couldn't found in tree");
			
			System.out.printf("%42s","For back to main menu enter 4:");
			int i= scanner.nextInt();
			if(i==4)
				menu();
		} break;
		case 3 :{
			System.out.printf("%56s","Enter the string that you want to delete it:");
			String key = scanner.next();
			System.out.println(Trie.Delete(key));
			Trie.output(key);
			System.out.printf("%42s","For back to main menu enter 4:");
			int i= scanner.nextInt();
			if(i==4)
				menu();
			
		}break;
		case 4 :{
			
		        System.out.printf("%30s","All words in tree:");
			    System.out.println(Trie.output(""));
			    System.out.printf("%42s","For back to main menu enter 4:");
			    int i= scanner.nextInt();
				if(i==4)
					menu();
		
		}break;
		
		}
		scanner.close();
	}

}



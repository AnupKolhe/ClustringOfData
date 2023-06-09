package Count;

import java.io.FileReader;
import java.util.Scanner;

import Data.SendRec;
//Green Space,Count,Char is Clear
public class Space {
	
	public void space() {
		int space =0;
		String word ="";
		int length=0;
		int character=0;
		
		SendRec sendrec = new SendRec();

		try {
			FileReader file = new FileReader("E:\\College\\4th Year\\KmeanGit\\Group-project-4th-tgpcet\\sampledataset.txt");
			Scanner scan = new Scanner(file); 
			
			while(scan.hasNextLine()) {
				word += scan.nextLine();
			}
			scan.close();
			
			length = word.length();
			space = word.replaceAll(" ","").length();
			space = length - space;
			
			character = length-space; // Character of the total
			
			
			sendrec.setCount(length); // This will total count with Space and Word  
			sendrec.setChar(character);// Character of the total			
			sendrec.setSpace(space); // This will show total number of Space 
					
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}
}

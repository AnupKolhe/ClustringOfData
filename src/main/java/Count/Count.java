package Count;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Data.SendRec;

public class Count {

	public void total() {
		
	int word = 0;
		
		SendRec sendrec = new SendRec();
		
		FileReader file ;
		try {
			file = new FileReader("E:\\College\\4th Year\\KmeanGit\\Group-project-4th-tgpcet\\sampledataset.txt");
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				String tmp = scan.nextLine();
				if(!tmp.equalsIgnoreCase("")) {
					word+=tmp.split("\\s+").length;	
				}
			}
			scan.close();
			sendrec.setWord(word);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}

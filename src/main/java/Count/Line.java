package Count;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import Data.SendRec;

public class Line {
			
		public void line(){
					
	int lineCount =0;
	
	SendRec sendrec = new SendRec();
	
	File file = new File("E:\\College\\4th Year\\KmeanGit\\Group-project-4th-tgpcet\\sampledataset.txt");
	try (Scanner scanner = new Scanner(new FileReader(file))){
		while(scanner.hasNextLine()) {
			
			String tmpStr = scanner.nextLine();
			++lineCount;
		}
		scanner.close();
	}
	catch(Exception e){
		e.printStackTrace();
		}
	
	sendrec.setLine(lineCount);
	
	}
}

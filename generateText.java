import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class generateText {
	public static void main(String[] args){
		
		
		FileInputStream fin;
		try {
			System.out.println("int[] years = {");
			fin = new FileInputStream("ExeterHistoryAll.txt");
			
			Scanner scan = new Scanner(fin);
			while(scan.hasNextLine()){
				String s = scan.nextLine();
				Scanner scan2 = new Scanner(s);
				
				int year =0;
				if(scan2.hasNextInt()){
					year = scan2.nextInt();
				}
				if(year < 2015 && year > 1700){
					System.out.println(year +",");
					scan.nextLine();
					//change to print out the following line if you want the text
					scan.nextLine();
				}
				
			
			}
			System.out.print("};");
			
		} catch (FileNotFoundException e) {
			System.out.println("no file found");
			e.printStackTrace();
		}
        
	}
}

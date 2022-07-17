import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class BuuferReader {

	
	public static void main(String []args) throws IOException {
		
		
		FileReader fr=new FileReader("story.txt");
		BufferedReader br=new BufferedReader(fr);
		String story="";
		while((story=br.readLine()) != null)	{ 
	
			
			
			System.out.println(story);
		
	}
		br.close(); fr.close();
	}
}


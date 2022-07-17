import java.awt.Desktop;
import java.io.File;

public class OpenfileDeskTopFile {
public static void main(String[] args) {
	String path="\"C:\\Users\\nages\\OneDrive\\Desktop\\nn.txt\"";
	try {
		File file=new File(path);
		if(!Desktop.isDesktopSupported()) {
			System.out.println("deskto suppoeredt");
		return;
		}
		Desktop d= Desktop.getDesktop();
		if(file.exists()) {
			d.open(file);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}

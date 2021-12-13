

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


interface IPhoneNote{
	 Properties getPhoneNoteProperties();
}

class phoneNoteBookDAO implements IPhoneNote{

	@Override
	public Properties getPhoneNoteProperties() {
		Properties phone=new Properties();
		try {
			phone.load(new FileReader("Phonenote.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return phone;
	}
	
}

public class A15MobileDiaryApplication {

	public static void main(String[] args) {
		IPhoneNote phonenote = new phoneNoteBookDAO();
		Properties phonedata = phonenote.getPhoneNoteProperties();
			System.out.println(phonedata+"\n");
			System.out.println(phonedata.get("helen"));
			
			
	}

}

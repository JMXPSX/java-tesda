import java.util.Date;
import java.text.*;

public class DateTime2{

	
	public static void main(String[]args){
	
	Date date = new Date();
	
	SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd'at'hh:mm:ss a zzz");
	
	System.out.print("Current Date:"+ft.format(date));
	
	System.out.print("");

	}

}
import java.util.*;


public class DateTime5{


	public static void main(String[]args){

	try{
		Long start=System.currentTimeMillis();
		System.out.println(new Date()+"\n");
		Thread.sleep(5*60*10);
		System.out.println(new Date()+"\n");
		long end = System.currentTimeMillis();
		long diff= end-start;
		System.out.println("Difference is:" +diff);

	}catch (Exception e){
		System.out.print("Got an Exception!");
	}

}

}
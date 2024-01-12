import java.util.Calendar;
public class Main{
	public static String greet(int hour){
		String greetings;
		if(hour>=4 && hour <12){
			greetings="Good Morning";
		}
		else if(hour>=12 && hour <18){
			greetings="Good Afternoon";
		}
		else if(hour >18 && hour<22){
			greetings="Good Evening";
		}
		else {
			greetings="Good night";
		}
		return greetings;
	}
	public static void main(String[]args){
		int hour,minute;
		Calendar rightNow=Calendar.getInstance();
		
		hour=rightNow.get(Calendar.HOUR_OF_DAY);
		minute=rightNow.get(Calendar.MINUTE);
		
		System.out.println("현재 시간은 "+hour+"시 "+minute+"분입니다.");
		System.out.println(greet(hour));
	}
}
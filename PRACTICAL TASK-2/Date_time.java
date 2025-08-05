package practicaltask2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_time {

	public static void main(String[] args) {
		        LocalDateTime now = LocalDateTime.now();
		        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		        System.out.println("Current DateTime: " + now.format(format));
		    }
		}
	

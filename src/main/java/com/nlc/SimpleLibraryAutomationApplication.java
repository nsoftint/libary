package com.nlc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author oktay
 *
 */
@SpringBootApplication
public class SimpleLibraryAutomationApplication  extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SimpleLibraryAutomationApplication.class);
	}

	public static void main(String[] args) throws Exception {
		//method 1
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		//System.out.println(timestamp);

		//method 2 - via Date
		Date date = new Date();
		System.out.println( date.getTime());
		InetAddress localhost = InetAddress.getLocalHost();
		System.out.println("System IP Address : " +
				(localhost.getHostAddress()).trim());

		//return number of milliseconds since January 1, 1970, 00:00:00 GMT
		//System.out.println(timestamp.getTime());

		//format timestamp
		//System.out.println(sdf.format(timestamp));
		//SpringApplication.run(SimpleLibraryAutomationApplication.class, args);
	}

}

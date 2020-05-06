package co.ankit.SpringAnnoApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //Specify this is configuration file
@ComponentScan(basePackages = "co.ankit.SpringAnnoApp")
public class AppConfig {
//	@Bean
//	public Samsung getPhone()
//	{
//		return new Samsung();
//	}
//	
//	@Bean
//	public Processor getProc()
//	{
//		return new Snapdragon();
//	}

}

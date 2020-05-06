package co.ankit.DemoMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("co.ankit.DemoMVC")
public class DispatcherConfig {
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver vr = new 	InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/"); //to set file path
		vr.setSuffix(".jsp"); //to give extention
		return vr;
	}
}

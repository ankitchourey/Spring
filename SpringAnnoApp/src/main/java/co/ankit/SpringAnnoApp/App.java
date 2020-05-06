package co.ankit.SpringAnnoApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
        
        //here we mention XML file in XML config, but in annotation config we create a confug class
        
        Samsung s8 = context.getBean(Samsung.class);
        s8.config();
    }
}

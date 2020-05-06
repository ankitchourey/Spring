package co.ankit.SpringAnnoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor {

	public void Type() {
		System.out.println("Snapdragon 845");
	}

}

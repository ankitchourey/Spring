package co.ankit.SpringAnnoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTek implements Processor {

	public void Type() {
		System.out.println("MediaTek Helio");

	}

}

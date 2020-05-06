package co.ankit.SpringAnnoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	
	@Autowired
	Processor cpu;
	
	public Processor getCpu() {
		return cpu;
	}

	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}


	public void config()
	{
		System.out.println("Octa core | 8gb | 40mp Camera");
		cpu.Type();
	}
}

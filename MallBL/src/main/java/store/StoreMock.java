package store;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("StoreMock")
@Profile("dev")
public class StoreMock implements IStore{

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mock store";
	}
}

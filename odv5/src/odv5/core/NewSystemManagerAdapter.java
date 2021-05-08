package odv5.core;

import odv5.NewSystem.NewSystemManager;

public class NewSystemManagerAdapter implements NewSystemService{

	@Override
	public void newToSystem(String message) {
		NewSystemManager newSystemManager = new NewSystemManager();
		newSystemManager.log(message);
		
	}

}

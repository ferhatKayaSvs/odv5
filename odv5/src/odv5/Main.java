package odv5;

import odv5.businnes.abstructs.UserService;
import odv5.businnes.concretes.UserManager;
import odv5.core.NewSystemManagerAdapter;
import odv5.dataAccess.concretes.OracleLogin;
import odv5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

     
		UserService userService = new UserManager(new OracleLogin(),new NewSystemManagerAdapter());
		User user = new User(1, "Ferhat", "KAYA", "ferhatkaya3@gmail.com", "1234566");
	    userService.login(user);
		
		
	}

}

package odv5.dataAccess.concretes;

import odv5.dataAccess.abstructs.UserDAO;
import odv5.entities.concretes.User;

public class OracleLogin implements UserDAO {

	@Override
	public void login(User user) {
		System.out.println("Login iþlemi baþarýlý olarak gerçekleþti...");
		
		
	}

}

package odv5.businnes.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import odv5.businnes.abstructs.UserService;
import odv5.core.NewSystemService;
import odv5.dataAccess.abstructs.UserDAO;
import odv5.entities.concretes.User;

public class UserManager implements UserService {

	private NewSystemService newSystemService;
	private UserDAO userDAO;

	public UserManager(UserDAO userDAO,NewSystemService newSystemService) {
		super();
		this.newSystemService = newSystemService;
		this.userDAO = userDAO;
	}

	@Override
	public void login(User user) {
		if (validate(user.geteMail()) && user.getPass().length() >= 6 && user.getFirstName().length() >= 2
				&& user.getLastName().length() >= 2) {
			System.out.println("Girilen eMail Baþarýlý..");
		} else {
			System.out.println("Geçersiz eMail giriþi...");
			return;
		}
		this.userDAO.login(user);

	}

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}

}

package unit20;

import java.util.List;

public class PasswordUtil {
	@UserCase(id = 47, decription = "psaawords must contain at least ")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}

	@UserCase(id = 48)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}

	@UserCase(id = 49,decription = "new password can't equal prviousli uesd ones")
	public boolean checkForNewPassword(List<String> list,String password){
		return !list.contains(password);
	}
}

package _07_tea_party;

public class Greet {

	String greetpeople(String name, boolean isKnighted, String gender) {
		if(gender.equals("Male") || gender.equals("Female")) {
			if(isKnighted == true) {
				if(gender.equals("Male")) {
					return "Welcome Sir" + name;
				}else if(gender.equals("Female")) {
					return "Welcome Lady" + name;
				}
			}else {
				if(gender.equals("Male")) {
					return "Welcome Mr. " + name;
				}else if(gender.equals("Female")) {
					return "Welcome Ms. " + name;
				}
			}
			return "";
		}else {
			return "Not a valid gender";
		}
	}
}

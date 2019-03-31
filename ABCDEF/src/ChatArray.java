
public class ChatArray {
	public Character[] toCharacterArray(String s) {
		if (s == null) {
			return null;
		}
		Character[] array = new Character[s.length()];
		for (int i = 0; i < s.length(); i++) {
			array[i] = new Character(s.charAt(i));
		}

		return array;
	}
}


import java.util.*;

public class CaesarCipher {
	public static final String lower = "abcdefghijklmnopqrstuvwxyz";
	public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static String encrypt(String res, int shift) {
		String cipherText = "";
		for (int i = 0; i < res.length(); i++) {
			int pos = -1;
			char val;
			int keyVal = -1;
			char val = res.charAt(i);
			System.out.println(val);
			if (Character.isUpperCase(val)) {
				pos = upper.indexOf(val);
				if (pos != -1) {
					keyVal = (shift + pos) % 26;
					val = upper.charAt(keyVal);
				} else {
					val = res.charAt(i);
				}
			} else {
				pos = lower.indexOf(val);
				if (pos != -1) {
					keyVal = (shift + pos) % 26;
					val = lower.charAt(keyVal);
				} else {
					val = res.charAt(i);
				}
			}
			System.out.println("Cipher: " + cipherText);
			cipherText += val;
		}
		return cipherText;
	}

	public static String decrypt(String cipherText, int shift) {
		String res = "";
		for (int i = 0; i < cipherText.length(); i++) {
			int pos = -1;
			char val;
			int keyVal = -1;
			char val = cipherText.charAt(i);

			if (Character.isUpperCase(val)) {
				pos = upper.indexOf(val);
				if (pos != -1) {
					keyVal = (pos - shift) % 26;
					if (keyVal < 0) {
						keyVal = upper.length() + keyVal;
					}
					val = upper.charAt(keyVal);
				} else {
					val = cipherText.charAt(i);
				}
			} else {
				pos = lower.indexOf(val);
				if (pos != -1) {
					keyVal = (pos - shift) % 26;
					if (keyVal < 0) {
						keyVal = lower.length() + keyVal;
					}
					val = lower.charAt(keyVal);
				} else {
					val = cipherText.charAt(i);
				}
			}
			res += val;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String for Encryption: ");
		String message = new String();
		message = sc.nextLine();
		System.out.println(encrypt(message, 3));
		System.out.println(decrypt(encrypt(message, 3), 3));
		sc.close();
	}
}
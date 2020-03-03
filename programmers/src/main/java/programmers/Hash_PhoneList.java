package programmers;

public class Hash_PhoneList {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		int a = -1;
		int chk = 0;
		
		k : for (int i = 0; i < phone_book.length; i++) {
				for (int j = i+1; j < phone_book.length; j++) {
					if (phone_book[i].length() < phone_book[j].length()) {
						a = phone_book[j].indexOf(phone_book[i]);
						if (a == 0) {
							chk++;
							break k;
						}
					} else {
						a = phone_book[i].indexOf(phone_book[j]);
						if (a == 0) {
							chk++;
							break k;
						}
					}
				}
			}
		if (chk > 0) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

	}

}

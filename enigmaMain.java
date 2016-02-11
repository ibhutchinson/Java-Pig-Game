package encrypt;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
/*
*@author Isaac Hutchinson
*@version 1
*/
public class enigmaMain {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		encrypt obj = new encrypt();
		decrypt obj2 = new decrypt();

		//String fileLocation;
		String inputMessage;
		String encryptedMessage,decryptedMessage;
		int select = 0;
		System.out.println("To Encrypt a message enter 1:");
		System.out.println("To decrypt a message enter 2:");
		select = scan.nextInt();
		if (select == 1) {
			inputMessage = scan.nextLine();
			System.out.println("Type a message to encrypt: (A-Z,a-z !ONLY!)");
			inputMessage = scan.nextLine();
			//inputMessage = inputMessage.replaceAll(" ", ",");

			encryptedMessage = obj.messageEncrypt(inputMessage);

			System.out.println(encryptedMessage);

			/*try (Writer writer = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream("SecretMessage.txt"), "utf-8"))) {
				writer.write(encryptedMessage);
			}*/
		} else if (select == 2) {
			encryptedMessage = scan.nextLine();
			System.out.println("Please paste the string to decode:");
			encryptedMessage = scan.nextLine();
			decryptedMessage=obj2.decode(encryptedMessage);
			System.out.println(decryptedMessage);
		}
	}

}

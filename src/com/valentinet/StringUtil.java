
package com.valentinet;

import java.util.Scanner;

public class StringUtil {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Введите фразу : ");
		String source = in.nextLine();

//		System.out.print("Ваша фраза: ");
//		System.out.println(source);
		in.close();

//		String source = "Hello my World!";

		String[] words = source.split(" ");

		System.out.println("Количество слов : " + words.length);

		for (int i = 0; i < words.length; i++) {

			System.out.print(words[i] + ": ");

			char[] letters1 = words[i].toCharArray();

			System.out.println("Количество символов : " + letters1.length);

			// char[][] letters = { letters1, letters2 };

		}

		// char[] letters1 = words[0].toCharArray();
		// char[] letters2 = words[1].toCharArray();

		// char[][] letters = { letters1, letters2 };
		// System.out.println(letters2.length);

//		System.out.println(words[0]);
//		System.out.println(words[1]);
//		System.out.println(letters[0][0]);

	}

}

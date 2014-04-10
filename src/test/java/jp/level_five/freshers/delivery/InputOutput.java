package jp.level_five.freshers.delivery;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InputOutput {

	private InputStream inputStream;
	private PrintStream printStream;

	public InputOutput() {
		inputStream = System.in;
		printStream = System.out;
	}

	public void setInputStream(InputStream stream) {
		inputStream = stream;
	}

	public void setPrintStream(PrintStream stream) {
		printStream = stream;
	}

	public String inputShippingMethod() {
		printStream.format("�z�����@��I�����Ă��������B�@A�@�܂��́@B");

		Scanner scan = new Scanner(inputStream);
		String val = scan.next();
		System.out.println(val);
		// System.out.println("�z�����@��I��ł�������");
		// char[] input = val.toCharArray();
		// System.out.println(input[0]);
		scan.close();
		return val;
	}

	public int inputPostalCode() {
		printStream.format("�X�֔ԍ�7������͂��Ă��������B");
		Scanner scan1 = new Scanner(inputStream);
		int val = scan1.nextInt();
		scan1.close();
		return val;
	}

	public int inputArrivalDate() {
		printStream.format("��]����铞���w�������͂��Ă��������B�@��j20140410");
		Scanner scan1 = new Scanner(inputStream);
		int val = scan1.nextInt();
		scan1.close();
		return val;
	}

};

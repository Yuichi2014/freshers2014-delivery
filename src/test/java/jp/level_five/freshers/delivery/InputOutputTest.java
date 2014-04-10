package jp.level_five.freshers.delivery;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class InputOutputTest {
	InputOutput inputOutput = null;
	ByteArrayOutputStream outputStream = null;
	
	@Before
	public void before(){
		inputOutput = new InputOutput();

		outputStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(outputStream);
		inputOutput.setPrintStream(printStream);
	}

	@Test
	public void test����A����͂���ƕ����^��A���Ԃ��Ă���() {		
		String inputString = "A";
		ByteArrayInputStream inputStream = new ByteArrayInputStream(
				inputString.getBytes());
		inputOutput.setInputStream(inputStream);

		String input = inputOutput.inputShippingMethod();

		assertEquals("A", input);
		assertEquals("�z�����@��I�����Ă��������B�@A�@�܂��́@B", outputStream.toString());
	}

	@Test 
	public void test�X�֔ԍ�1000000����͂����1000000���Ԃ��Ă���(){
		String inputcode = "1000000";
		ByteArrayInputStream inputStream = new ByteArrayInputStream(inputcode.getBytes());
		inputOutput.setInputStream(inputStream);
		int input = inputOutput.inputPostalCode();
		assertEquals(1000000, input);
	}
}

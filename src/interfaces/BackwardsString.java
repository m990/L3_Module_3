package interfaces;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String text) {
		// TODO Auto-generated method stub
		char[] textList = text.toCharArray();
		String returnValue = "";
		for (int i = textList.length - 1; i >= 0; i--) {
			returnValue += textList[i];
		}
		return returnValue;
	}
}

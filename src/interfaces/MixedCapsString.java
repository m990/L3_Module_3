package interfaces;
import java.util.Arrays;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		char[] textList = s.toCharArray();
		String lower = "";
		for (int i = 0; i < textList.length; i++) {
			lower += ""+textList[i];
		}
		lower.toLowerCase();
		char[] textList1 = lower.toCharArray();
		String upperAndLower = "";
		for (int i = 0; i < textList1.length; i += 2) {
			String upper = ""+textList1[i];
			upper = upper.toUpperCase();
			upperAndLower += upper;
		}
		return upperAndLower;
	}
}

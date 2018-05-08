package interfaces;
import java.util.ArrayList;
import java.util.Arrays;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		s = s.toUpperCase();
		String upperAndLower = "";
		for (int i = 0; i < s.length(); i++) {
			if (i%2==0) {
				upperAndLower += (""+s.charAt(i)).toLowerCase();
			}
			else {
				upperAndLower += ""+s.charAt(i);
			}
		}
		return upperAndLower;
	}
}

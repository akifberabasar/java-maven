package tr.edu.medipol.yazilimort;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		
		String hataliMetin = " m  e  dip o   l";
		
		// hatali metni duzelt
		
		String duzgunMetin = StringUtils.deleteWhitespace(hataliMetin);
		
		System.out.println(duzgunMetin);

	}

}

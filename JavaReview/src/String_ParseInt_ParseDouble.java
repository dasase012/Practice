
class String_ParseInt_ParseDouble {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		String strVal_1 = iVal +"";
		
		double dVal = 200.0;
		String strVal2 = String.valueOf(dVal);
		String strVal2_1 = dVal+"";
		
		System.out.println(strVal);
		System.out.println(strVal_1);
		System.out.println(strVal2);
		System.out.println(strVal2_1);
		
		double sum = Integer.parseInt("+"+strVal)+Double.parseDouble(strVal2);
		System.out.println(sum);
		double sum2 = Integer.parseInt(strVal_1)+Double.parseDouble(strVal2_1);
		System.out.println(sum2);
		
		System.out.println(String.join("", strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal_1+"+"+strVal2_1+"="+sum2);
	}
}

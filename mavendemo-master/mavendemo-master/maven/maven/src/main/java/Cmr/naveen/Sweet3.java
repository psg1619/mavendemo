package Cmr.naveen;

public class Sweet3 extends NewYearChoclates {

	static int mywt=0;
	@Override
	public int weightOfGift(int wt) {
		totalweight+=wt;
		mywt+=wt;
		return totalweight;
		
	}

	
}

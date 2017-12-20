package math;

public class ExponentOfBase {
	/**
	 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
	 */
	public double Power(double base, int exponent) {
		double t=base;
		if(exponent<0) {
			base=1/base;
			t=base;
			exponent=Math.abs(exponent);
		}else if(exponent==0)
			return 1;
		while(--exponent>0) base*=t; 
		return base;
	}
}

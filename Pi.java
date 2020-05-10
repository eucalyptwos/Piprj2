public class Pi{
	public static void main(String[] args) {
		int k=1;
		double pie=0, pie_ori;
		double sign=1.0, tolerr = 0.0000000025;
		double err=1.0;
		while(true){
			pie_ori=pie;
			pie+=(1.0 / k)*sign;
			sign = -sign;
			k+=2;
			err=pie_ori-pie;
			if(err<0)
				err= -err;
			if(err<=tolerr)
				break;
			}
		pie=pie*4;
		System.out.println("pie= "+pie);
	}
}
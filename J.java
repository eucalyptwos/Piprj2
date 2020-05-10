public class J{
	public static void main(String[] args) {
		int k=1;
		double pie=1.0, pie_ori;
		double sign=1.0, tolerr = 0.00000000025;
		double err=1.0;
		while(true){
			pie_ori=pie;
			pie*=1/(1-1/(4*Math.pow(k,2)));
			k+=1;
			err=pie_ori-pie;
			if(err<0)
				err= -err;
			if(err<=tolerr)
				break;
			}
		pie=pie*2;
		System.out.println("pie= "+pie);
	}
}

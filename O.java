public class O{
	public static void main(String[] args) {
		double pie=0, pie_ori=0;
		double tolerr=0.00000000000025;
		double err;
		double i=1.0;
		while(true){
			pie_ori=pie;
			pie+=1 / Math.pow(i,2);
			err=pie_ori-pie;
			i+=1;
			if(err<0)
				err=-err;
			if(err<=tolerr)
				break;
			}
		System.out.println("pie= "+Math.sqrt(pie*6));
	}
}
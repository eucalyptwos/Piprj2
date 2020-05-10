public class R{
	public static void main(String[] args) {
		int k=0;
		double pie=0, pie_ori, i=0;
		double sign=1.0, tolerr = 0.000000025;
		double err=1.0;
		while(true){
			pie_ori=pie;
			i+=Factorial.factorial(4*k)*(1103+26390*k)/(Math.pow(Factorial.factorial(k),4)*Math.pow(396,4*k));
			pie=9801/(Math.sqrt(8)*i);
			k+=1;
			err=pie_ori-pie;
			if(err<0)
				err= -err;
			if(err<=tolerr)
				break;
			}
		System.out.println("pie= "+pie);
	}
}
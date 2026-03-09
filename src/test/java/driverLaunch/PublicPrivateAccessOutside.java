package driverLaunch;

import OOPSConcept.PublicPrivate;

public class PublicPrivateAccessOutside {

	public static void main(String[] args) {
		PublicPrivate obj = new PublicPrivate();
		System.out.println(obj.a);
	//	System.out.println(obj.b);
		obj.add();	

	}

}

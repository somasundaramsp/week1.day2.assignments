package week1.day2.assignments;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 12345678910l;
	boolean isPunctured = false;
	String bikeName = "Honda Hornet";
	double runningKM = 7578;

	public static void main(String[] args) {
		TwoWheeler hornet = new TwoWheeler();
		System.out.println("Number of Wheels: " + hornet.noOfWheels);
		System.out.println("Number of Mirrors: " + hornet.noOfMirrors);
		System.out.println("Chassis Number: " + hornet.chassisNumber);
		System.out.println("is Punctured: " + hornet.isPunctured);
		System.out.println("Bike Name: " + hornet.bikeName);
		System.out.println("Running KMs: " + hornet.runningKM);
	}
}


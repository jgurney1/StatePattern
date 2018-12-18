
public class RecievedState implements PackageState{

	@Override
	public void next(Package pkg) {
		// TODO Auto-generated method stub
		System.out.println("The package is already recieved by the client");
	}

	@Override
	public void prev(Package pkg) {
		// TODO Auto-generated method stub
		pkg.setState(new DeliveredState());
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("The package has been recieved by the client");
	}

}

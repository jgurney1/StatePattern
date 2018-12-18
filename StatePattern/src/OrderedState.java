
public class OrderedState implements PackageState {

	@Override
	public void next(Package pkg) {
		// TODO Auto-generated method stub
		pkg.setState(new DeliveredState());
	}

	@Override
	public void prev(Package pkg) {
		// TODO Auto-generated method stub
		System.out.println("The package is in its root state");
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("The package is ordered but not delievered to the office yet");
	}

}

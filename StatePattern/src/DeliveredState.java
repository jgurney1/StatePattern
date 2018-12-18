
public class DeliveredState implements PackageState{

	@Override
	public void next(Package pkg) {
		// TODO Auto-generated method stub
		pkg.setState(new RecievedState());
	}

	@Override
	public void prev(Package pkg) {
		// TODO Auto-generated method stub
		pkg.setState(new OrderedState());
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("Package delivered to post office, not recieved yet.");
	}

}

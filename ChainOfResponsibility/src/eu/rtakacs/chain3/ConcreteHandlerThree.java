package eu.rtakacs.chain3;

public class ConcreteHandlerThree extends Handler {
	public void handleRequest(Request request) {
		if (request.getValue() >= 0) { // if request is eligible handle it
			System.out.print("Zero values are handled by ConcreteHandlerThree:");
			System.out.println("\tConcreteHandlerThree.HandleRequest : " + request.getDescription() + request.getValue());
		} else {
			super.handleRequest(request);
		}
	}
}

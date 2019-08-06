# Guest notifier interface - IGuestNotifier

Guest notifier interface for working with so called `Guest Notifier` hardware: buzzers, pagers, etc.
Example implementation
```java
public class MyGuestNotifier implements IGuestNotifier {

	MyGuestNotifierServer server = new MyGuestNotifierServer();

	@Override
	public GuestNotifierResult operation(GuestNotifierRequest request) {
		if (request instanceof GuestNotifierCallRequest) {
			return server.read(cfg, (GuestNotifierCallRequest) request);
		}
		throw new RuntimeException("Operation not supported");
	}
}
```
# Pre-paid articles interface - IPrepaidArticles

Pre-paid article - article which is added to the order with zero price.
Pre-paid article may be two types:
- Pieces - articles available amount. 
- Price - articles total price.
```java
/**
 * This class describes a pre-paid articles accessible
 */
public class PrepaidItem {

	/**
	 * This type describes the measure units. Currently only supported value is "0" (pieces)<br>
	 */
	public int getValueType() {
		return valueType;
	}
```
Pre-paid article interface can handle two operation types: read and charge.
Example implementation
```java
public class MyPrepaidArticles implements IPrepaidArticles {

	private MyPrepaidArticlesServer server = new MyPrepaidArticlesServer();

	@Override
	public PrepaidArticlesResult operation(DriverConfiguration cfg, PrepaidArticlesRequest request) {
		if (request instanceof ReadPrepaidArticlesRequest) {
			return server.read(cfg, (ReadPrepaidArticlesRequest) request);
		} else if (request instanceof ChargePrepaidArticlesRequest) {
			return server.charge(cfg, (ChargePrepaidArticlesRequest) request);
		}
		throw new RuntimeException("Operation not supported");
	}
}
```
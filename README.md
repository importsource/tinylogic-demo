
# tinylogic-demo
official TinyLogic-demo

```java

@MicroService(value="/apps/list1")
public class List1 extends DBHttpHandler{
	@Override
	public void doIt(Connection conn, Request request, Response response) {
		obj =  DBClient.list(conn, "select * from user where 1=?","1");
	}
	
}

```

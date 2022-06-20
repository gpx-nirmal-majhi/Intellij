import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;



public class MyService1 {

public Future<JsonObject> getResponse(JsonObject req){
Promise<JsonObject> responsefut = Promise.promise();
new Thread( () -> {
try {
Thread.sleep(2000);
}catch (InterruptedException e) {
e.printStackTrace();
}
JsonObject res = new JsonObject().put("msg", "response from class1");
responsefut.complete(res);


}).start();
return responsefut.future();
}
}
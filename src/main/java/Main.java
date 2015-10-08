import net.codestory.http.WebServer;

/**
 * Created by mark on 10/8/15.
 */
public class Main {

    public static void main(String[] args){

        new WebServer().configure(routes -> routes.get("/", "Hello World")).start();

    }
}

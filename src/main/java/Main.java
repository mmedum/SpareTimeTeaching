import net.codestory.http.WebServer;

/**
 * Main access point for the webserver
 */
public class Main {

    public static void main(String[] args){

        new WebServer().configure(routes -> routes
                .get("/", "Hello SpareTimeTeaching")
                .get("/pokepoke", "This could be real fun!")).start();

    }
}

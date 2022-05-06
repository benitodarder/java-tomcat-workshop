
package local.tin.tests.tomcat.hello.world;

import local.tin.tests.tomcat.hello.world.web.HelloWorldBinder;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author bdarder
 */
public class App extends ResourceConfig {
    public App() {
        register(new HelloWorldBinder());
        packages(true, "local.tin.tests.tomcat.hello.world.controller");
    }
}

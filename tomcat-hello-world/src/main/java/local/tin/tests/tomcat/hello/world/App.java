package local.tin.tests.tomcat.hello.world;

import local.tin.tests.tomcat.hello.world.web.HelloWorldBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author bdarder
 */
public class App extends ResourceConfig {

    public static final String CONTROLLER_PACKAGES = "local.tin.tests.tomcat.hello.world.controller";
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public App() {
        register(new HelloWorldBinder());
        packages(true, CONTROLLER_PACKAGES);
        LOGGER.info("*                                                              *");
        LOGGER.info("Controller packages: {}", CONTROLLER_PACKAGES);
        LOGGER.info("*                                                              *");
    }
}

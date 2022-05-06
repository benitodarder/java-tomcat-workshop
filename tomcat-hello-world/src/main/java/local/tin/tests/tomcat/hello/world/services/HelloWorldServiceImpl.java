package local.tin.tests.tomcat.hello.world.services;

import java.util.Date;

/**
 *
 * @author benitodarder
 */
public class HelloWorldServiceImpl implements HellWorldService {
    
    public String getNamedGreeting(String name) {
        return "Hi " + name + "... It's " + new Date();
    }

    public String getGenericGreeting() {
        return "Hello world!... It's " + new Date();
    }
}

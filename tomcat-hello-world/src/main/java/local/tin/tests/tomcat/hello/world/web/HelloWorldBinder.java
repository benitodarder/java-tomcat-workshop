
package local.tin.tests.tomcat.hello.world.web;

import local.tin.tests.tomcat.hello.world.services.HellWorldService;
import local.tin.tests.tomcat.hello.world.services.HelloWorldServiceImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 *
 * @author bdarder
 */
public class HelloWorldBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(HelloWorldServiceImpl.class).to(HellWorldService.class);
    }
}
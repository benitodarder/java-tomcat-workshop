package local.tin.tests.tomcat.hello.world.services;

/**
 *
 * @author benitodarder
 */
public interface HellWorldService {

  
    public String getNamedGreeting(String name);

    public String getGenericGreeting();
}
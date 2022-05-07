package local.tin.tests.tomcat.crud.service;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import local.tin.tests.tomcat.crud.dao.ProductDAOConfiguration;
import local.tin.tests.tomcat.crud.service.utils.ResourcesUtils;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author benitodarder
 */
public class App extends ResourceConfig {

    public static final String CONTROLLERS_PACKAGES = "controller.packages";
    public static final String PROPERTIES_FILE = "products-service.properties";
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public App() throws IOException {
        ResourcesUtils resourcesUtils = ResourcesUtils.getInstance();
        Properties properties = resourcesUtils.getPropertiesFile(App.class, PROPERTIES_FILE);
        Map<String, String> map = ProductDAOConfiguration.getInstance().getConfigurationMap();
        map.put(ProductDAOConfiguration.CRUD_BASE_PACKAGE, properties.getProperty(ProductDAOConfiguration.CRUD_BASE_PACKAGE));
        map.put(ProductDAOConfiguration.DAO_BASE_PACKAGE, properties.getProperty(ProductDAOConfiguration.DAO_BASE_PACKAGE));
        map.put(ProductDAOConfiguration.DAO_PERSISTENCE_UNIT, properties.getProperty(ProductDAOConfiguration.DAO_PERSISTENCE_UNIT));
        map.put(ProductDAOConfiguration.MODEL_DOMAIN_PACKAGE, properties.getProperty(ProductDAOConfiguration.MODEL_DOMAIN_PACKAGE));
        packages(properties.getProperty(CONTROLLERS_PACKAGES));
        LOGGER.info("*                                                              *");
        LOGGER.info("Controller packages: {}", properties.getProperty(CONTROLLERS_PACKAGES));
        LOGGER.info("CRUD base packages: {}", properties.getProperty(ProductDAOConfiguration.CRUD_BASE_PACKAGE));
        LOGGER.info("DAO base packages: {}", properties.getProperty(ProductDAOConfiguration.DAO_BASE_PACKAGE));
        LOGGER.info("DAO persistence unit packages: {}", properties.getProperty(ProductDAOConfiguration.DAO_PERSISTENCE_UNIT));
        LOGGER.info("Model domain packages: {}", properties.getProperty(ProductDAOConfiguration.MODEL_DOMAIN_PACKAGE));
        LOGGER.info("*                                                              *");
    }
}

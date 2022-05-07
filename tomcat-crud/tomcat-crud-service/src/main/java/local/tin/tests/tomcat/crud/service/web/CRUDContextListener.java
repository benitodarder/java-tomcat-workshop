package local.tin.tests.tomcat.crud.service.web;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import local.tin.tests.tomcat.crud.dao.ProductDAOConfiguration;
import local.tin.tests.tomcat.crud.service.utils.ResourcesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author benito.darder
 */
@WebListener
public class CRUDContextListener implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(CRUDContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {

            LOGGER.info("****************************************************************");
            LOGGER.info("*                                                              *");
            LOGGER.info("*       ServletContextListener: Context initialized!           *");
            LOGGER.info("*                                                              *");
            LOGGER.info("****************************************************************");


    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("****************************************************************");
        LOGGER.info("*                                                              *");
        LOGGER.info("*       ServletContextListener: Context destroyed!             *");
        LOGGER.info("*                                                              *");
        LOGGER.info("****************************************************************");
    }
}

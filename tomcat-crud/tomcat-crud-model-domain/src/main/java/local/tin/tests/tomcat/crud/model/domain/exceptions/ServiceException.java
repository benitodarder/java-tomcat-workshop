package local.tin.tests.tomcat.crud.model.domain.exceptions;

/**
 *
 * @author benito.darder
 */
public class ServiceException extends CommonException {

    public ServiceException() {
    }    
    
    public ServiceException(Exception e) {
        super(e);
    }
    
    public ServiceException(String string) {
        super(string);
    }

    public ServiceException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ServiceException(Throwable thrwbl) {
        super(thrwbl);
    }    
}

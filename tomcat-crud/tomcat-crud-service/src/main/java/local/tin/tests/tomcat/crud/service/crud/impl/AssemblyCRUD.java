package local.tin.tests.tomcat.crud.service.crud.impl;

import local.tin.tests.tomcat.crud.dao.impl.AbstractDAO;
import local.tin.tests.tomcat.crud.model.domain.product.Assembly;



/**
 *
 * @author benitodarder
 */
public class AssemblyCRUD extends AbstractCRUDService<Assembly> {

    public AssemblyCRUD(AbstractDAO dao) {
        super(dao);
    }
    
}

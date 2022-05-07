package local.tin.tests.tomcat.crud.service.crud.impl;

import local.tin.tests.tomcat.crud.dao.impl.AbstractDAO;
import local.tin.tests.tomcat.crud.model.domain.product.Component;


/**
 *
 * @author benitodarder
 */
public class ComponentCRUD extends AbstractCRUDService<Component>{

    public ComponentCRUD(AbstractDAO dao) {
        super(dao);
    }
    
}

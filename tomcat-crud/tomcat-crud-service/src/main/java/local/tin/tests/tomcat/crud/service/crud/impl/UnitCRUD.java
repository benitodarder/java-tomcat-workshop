package local.tin.tests.tomcat.crud.service.crud.impl;

import local.tin.tests.tomcat.crud.dao.impl.AbstractDAO;
import local.tin.tests.tomcat.crud.model.domain.product.Unit;


/**
 *
 * @author benitodarder
 */
public class UnitCRUD extends AbstractCRUDService<Unit> {

    public UnitCRUD(AbstractDAO dao) {
        super(dao);
    }
   
}

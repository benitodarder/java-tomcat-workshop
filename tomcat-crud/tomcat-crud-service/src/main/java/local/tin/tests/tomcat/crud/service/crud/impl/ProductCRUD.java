package local.tin.tests.tomcat.crud.service.crud.impl;

import local.tin.tests.tomcat.crud.dao.impl.AbstractDAO;
import local.tin.tests.tomcat.crud.model.domain.product.Product;


/**
 *
 * @author benitodarder
 */
public class ProductCRUD extends AbstractCRUDService<Product> {

    public ProductCRUD(AbstractDAO dao) {
        super(dao);
    }
  
    
    
}

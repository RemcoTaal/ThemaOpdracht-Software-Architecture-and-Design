package org.services.PostgresServiceImpl;

import org.business.domain.source.Operator;
import org.persistence.OperatorDao;
import org.persistence.PostgresImpl.PostgresDaoImplProvider;

import java.util.List;

public class OperatorPostgresService {
//        extends AbstractPostgresServiceImpl<Operator> implements OperatorService {
//    public OperatorPostgresService(OperatorDao operatorDao){
//        super(operatorDao);
//    };
    private OperatorDao operatorDao;
    private PostgresDaoImplProvider postgresDaoImplProvider;

    public OperatorPostgresService(){
        postgresDaoImplProvider = new PostgresDaoImplProvider();
        operatorDao = postgresDaoImplProvider.getOperatorDao();
    };


    public void saveOrUpdate(Operator operator){
        operatorDao.insert(operator);
    };

    public List<Operator> getAllOperators(){
        return operatorDao.getAll();
    };

    public Operator getOperatorById(int id){
        return operatorDao.findById(id);
    };
    public List<Operator> getOperatorByName(String name){
        return operatorDao.findByName(name);
    };
}

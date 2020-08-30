package org.definemodule.persistence.PostgresImpl;

import org.definemodule.persistence.postgresdao.*;
import org.generatemodule.persistence.PostgresDao.PersonDao;
import org.generatemodule.persistence.PostgresImpl.PersonDaoPostgresImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class PostgresDaoImplProvider extends HibernateUtil {

    private static EntityManagerFactory entityManagerFactory;
    private static EntityManagerFactory entityManagerFactoryTarget;
    private OperatorDao operatorDao;
    private TableDao tableDao;
    private BusinessRuleDao businessRuleDao;
    private BusinessRuleTypeDao businessRuleTypeDao;
    private CategoryDao categoryDao;
    private ColumnDao columnDao;
    private DatabaseDao databaseDao;
    private ValueDefinitionDao valueDefinitionDao;
    private PersonDao personDao;

    public PostgresDaoImplProvider(){
        EntityManager entityManager = null;
        EntityManager entityManagerTarget = null;
        try {
            entityManagerFactory = HibernateUtil.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityManagerTarget = entityManagerFactory.createEntityManager();
            operatorDao = new OperatorDaoPostgresImpl(entityManager);
            tableDao = new TableDaoPostgresImpl(entityManager);
            businessRuleDao = new BusinessRuleDaoPostgresImpl(entityManager);
            businessRuleTypeDao = new BusinessRuleTypeDaoPostgresImpl(entityManager);
            categoryDao = new CategoryDaoPostgresImpl(entityManager);
            columnDao = new ColumnDaoPostgresImpl(entityManager);
            databaseDao = new DatabaseDaoPostgresImpl(entityManager);
            valueDefinitionDao = new ValueDefinitionDaoPostgresImpl(entityManager);
            personDao = new PersonDaoPostgresImpl(entityManager);
        }catch (Throwable ex){
            System.err.println("Failed to create entitymanager object." + ex);
            throw new ExceptionInInitializerError(ex);

        }
    }

    public OperatorDao getOperatorDao() {
        return operatorDao;
    }

    public TableDao getTableDao() {
        return tableDao;
    }

    public BusinessRuleDao getBusinessRuleDao() {
        return businessRuleDao;
    }

    public BusinessRuleTypeDao getBusinessRuleTypeDao() {
        return businessRuleTypeDao;
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public ColumnDao getColumnDao() {
        return columnDao;
    }

    public DatabaseDao getDatabaseDao() {
        return databaseDao;
    }

    public PersonDao getPersonDao(){return personDao;}

    public ValueDefinitionDao getValueDefinitionDao() {
        return valueDefinitionDao;
    }
}

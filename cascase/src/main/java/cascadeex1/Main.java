package cascadeex1;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityTransaction;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "JPADemo";
    private static final EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static EntityManager getEntityManager() {
        return emFactoryObj.createEntityManager();
    }

    public static void main(String[] args) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Learner learner = new Learner();
            learner.setLid(5);
            learner.setLname("Akash");

            Mobile mobile = new Mobile();
            mobile.setMid(105);
            mobile.setMno("9890906486");

            List<Mobile> mobileList = new ArrayList<>();
            mobileList.add(mobile);

            learner.setLi(mobileList);

            entityManager.persist(learner);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
            emFactoryObj.close();
        }
    }
}
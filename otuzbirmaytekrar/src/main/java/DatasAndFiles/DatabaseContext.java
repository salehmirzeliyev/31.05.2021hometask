package DatasAndFiles;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseContext {
        public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sample");
        public static EntityManager entityManager = entityManagerFactory.createEntityManager();
    }

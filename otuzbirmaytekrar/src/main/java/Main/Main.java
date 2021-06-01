package Main;

import DatasAndFiles.DatabaseContext;

public class Main {
    public static void main(String[] args) {
        DatabaseContext.entityManager.getTransaction();
    }
}

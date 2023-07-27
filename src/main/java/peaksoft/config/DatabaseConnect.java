package peaksoft.config;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import peaksoft.entity.Group;
import peaksoft.entity.Laptop;
import peaksoft.entity.Student;

import java.util.Properties;

/**
 * author: Ulansky
 */
public class DatabaseConnect {
    public static EntityManagerFactory managerFactory() {
        Properties properties = new Properties();
        properties.setProperty(Environment.DRIVER, "org.postgresql.Driver");
        properties.setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/java10");
        properties.setProperty(Environment.USER, "postgres");
        properties.setProperty(Environment.PASS, "aikamama_95");
        properties.setProperty(Environment.SHOW_SQL, "true");
        properties.setProperty(Environment.HBM2DDL_AUTO, "create");
        properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        Configuration configuration = new Configuration();
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(Group.class);
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Laptop.class);
        return configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
    }

}

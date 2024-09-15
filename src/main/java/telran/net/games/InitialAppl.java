package telran.net.games;

import java.util.HashMap;

import org.hibernate.jpa.HibernatePersistenceProvider;

import jakarta.persistence.*;
public class InitialAppl {

	public static void main(String[] args) {
	     HashMap<String, Object> map = new HashMap<>();
	        map.put("hibernate.hbm2ddl.auto", "update"); // Использовать существующие таблицы
	        map.put("hibernate.show_sql", true);
	        map.put("hibernate.format_sql", true);
	        map.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect"); 
	        map.put("jakarta.persistence.jdbc.url", "jdbc:postgresql://localhost/postgres");
	        map.put("jakarta.persistence.jdbc.user", "postgres");
	        map.put("jakarta.persistence.jdbc.password", "bulls100");
	        
	        EntityManagerFactory emFactory = new HibernatePersistenceProvider()
	                .createContainerEntityManagerFactory(new BullsCowsPersistenceUnitInfo(), map);
	        EntityManager em = emFactory.createEntityManager();
	        Game game = em.find(Game.class, 1001);
	        System.out.println(game);
	    }
	}
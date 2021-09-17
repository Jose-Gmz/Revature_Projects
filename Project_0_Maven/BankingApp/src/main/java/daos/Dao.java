package daos;


import java.sql.SQLException;
import java.util.List;

import models.Account;
import models.Client;

public interface Dao<T> {
	
		T get(int id) throws SQLException;

	    List<T> getAll() throws SQLException;

	    void save(T t) throws SQLException;

	    void update(T t, String[] params);

	    void delete(T t);

		
}

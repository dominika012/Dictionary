package com.nessacademy.connection;

import javax.sql.DataSource;
import org.apache.derby.jdbc.ClientConnectionPoolDataSource;

public class DataSourceInstance {
	private static final DataSourceInstance INSTANCE
		= new DataSourceInstance();
	
	private static final String PASSWORD = "pass";

	private static final String LOGIN = "dominika";

	private static final String URL = "jdbc:derby://localhost:1527/Translator";

        private static final String SERVER_NAME = "localhost";
        
        private static final int PORT = 1527;
        
        private static final String DATABASE_NAME = "Translator";
        
	private ClientConnectionPoolDataSource dataSource;
	
	private DataSourceInstance() {
		// ensures singleton instance
	}
	
	public DataSource getDataSource() {
		if (this.dataSource == null) {
			this.dataSource = new ClientConnectionPoolDataSource();
			this.dataSource.setServerName(SERVER_NAME);
                        this.dataSource.setPortNumber(PORT);
                        this.dataSource.setDatabaseName(DATABASE_NAME);
			this.dataSource.setUser(LOGIN);
			this.dataSource.setPassword(PASSWORD);
		}
		return this.dataSource;
	}
	
	public static DataSourceInstance getInstance() {
		return INSTANCE;
	}
}

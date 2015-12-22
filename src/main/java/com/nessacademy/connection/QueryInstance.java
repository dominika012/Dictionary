/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nessacademy.connection;

//check dbutils!
import org.apache.commons.dbutils.QueryLoader;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominika
 */
public class QueryInstance {
    
    private static final QueryInstance INSTANCE
            = new QueryInstance();
    
    private static final String SQL_FILE = "/database/sql.xml";
    
    private QueryLoader queryLoader;
    
    private QueryInstance(){
        // ensures singleton instance
    }
    
    public String getQuery(String query) {
        this.queryLoader=QueryLoader.instance();
        try {
            Map<String, String> queries = queryLoader.load(SQL_FILE);
            return queries.get(query);
        } catch (IOException ex) {
            Logger.getLogger(QueryInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static QueryInstance getInstance() {
		return INSTANCE;
	}
    
}

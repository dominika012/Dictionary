package com.nessacademy.dao;

import com.nessacademy.bean.DictionaryWord;
import com.nessacademy.connection.DataSourceInstance;
import com.nessacademy.connection.QueryInstance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P3502442
 */
public class DictionaryWordDao implements IDictionaryWordDao{

    List<DictionaryWord> words=new ArrayList<DictionaryWord>();
    
    DataSourceInstance ds;
    
    @Override
    public List<DictionaryWord> words() {
        DataSource ds = DataSourceInstance.getInstance().getDataSource();
        String sql = QueryInstance.getInstance().getQuery("words");
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = ds.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("Slovak word:  "+rs.getString("sk")+", English word:  "+rs.getString("en"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
                try {
                    if(rs != null) rs.close();
                    if(stmt != null) stmt.close();
                    if(con != null) con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return words;
    }
    
    @Override
    public void add(String sk, String en) {
        DataSource ds = DataSourceInstance.getInstance().getDataSource();
        String sql = QueryInstance.getInstance().getQuery("add");
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = ds.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, en);
            stmt.setString(2, sk);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
                try {
                    if(stmt != null) stmt.close();
                    if(con != null) con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        DictionaryWord word = new DictionaryWord(sk, en);
        words.add(word);
    }

    //FIXME
    @Override
    public DictionaryWord findByString(String slovakWord) {
        DataSource ds = DataSourceInstance.getInstance().getDataSource();
        String sql = QueryInstance.getInstance().getQuery("find");
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = ds.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, slovakWord);
            rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println("Slovak word:  "+rs.getString("sk")+", English word:  "+rs.getString("en"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
                try {
                    if(rs != null) rs.close();
                    if(stmt != null) stmt.close();
                    if(con != null) con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        DictionaryWord word = new DictionaryWord();
        return word;
    }
}

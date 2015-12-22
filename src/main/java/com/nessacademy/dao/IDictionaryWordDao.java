/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nessacademy.dao;

import com.nessacademy.bean.DictionaryWord;
import java.util.List;

/**
 *
 * @author P3502442
 */
public interface IDictionaryWordDao {
    
    public void add(String sk, String en);
    
    public List<DictionaryWord> words();
    
    public DictionaryWord findByString(String slovakWord);
    
}

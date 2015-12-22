/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nessacademy.controller;

import com.nessacademy.bean.DictionaryWord;
import com.nessacademy.dao.DictionaryWordDao;
import java.util.List;

/**
 *
 * @author P3502442
 */
public class DictionaryWordService {
    
    private DictionaryWordDao wordDao;
    
    public DictionaryWordService(){
        wordDao = new DictionaryWordDao();
    }
    
    public void add(String sk, String en){
            wordDao.add(sk,en);
    }
    
    public List<DictionaryWord> words(){
        return wordDao.words();
    }
    
}

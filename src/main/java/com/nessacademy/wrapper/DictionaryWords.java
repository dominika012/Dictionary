/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nessacademy.wrapper;

import com.nessacademy.bean.DictionaryWord;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author P3502442
 */
@XmlRootElement(name = "words")
@XmlAccessorType (XmlAccessType.FIELD)
public class DictionaryWords {
    
    @XmlElement(name = "word")
    private List<DictionaryWord> words = null;
 
    public List<DictionaryWord> getWords() {
        return words;
    }
 
    public void setWords(List<DictionaryWord> words) {
        this.words = words;
    }
    
}

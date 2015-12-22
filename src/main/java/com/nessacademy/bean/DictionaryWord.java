
package com.nessacademy.bean;

/**
 *
 * @author P3502442
 */
public class DictionaryWord {
    
    String sk;
    String en;
    
    public DictionaryWord(){
        
    }
    
    public DictionaryWord(String sk, String en){
        super();
        this.sk=sk;
        this.en=en;
    }
    
        public String getSk() {
            return sk;
	}

        public void setSk(String sk) {
            this.sk = sk;
	}
    
        public String getEn() {
            return en;
	}

        public void setEn(String en) {
            this.en = en;
	}
        
        @Override
	public String toString() {
            return "Slovak word: " + sk + " English word: " + en;
	}
}

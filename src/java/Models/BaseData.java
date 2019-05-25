/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.*;
/**
 *
 * @author chrisloops
 */
public class BaseData {
    private ArrayList<ArrayList<String>> keywords;
    private ArrayList<String> answers;

    public BaseData( String[][] keywords, String[] answers) {
         
        this.keywords = new ArrayList<ArrayList<String>>();
        for(String[] keyword_array: keywords){
            this.keywords.add(new ArrayList<String>(Arrays.asList(keyword_array)));
        }
        
        
        this.answers = new ArrayList<String>(Arrays.asList(answers));
    }
    
    public ArrayList<ArrayList<String>> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<ArrayList<String>> keywords) {
        this.keywords = keywords;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
    
    public Boolean matchesWithMyOwnKeywords(String input){
    //For be true it must have at leatest one match per each keyword's array
    
    ArrayList<Boolean> matriz = new ArrayList<Boolean>();
        
        for(ArrayList<String> key_words_array : this.keywords ){
            
            Boolean matches = false;
            
            for(String key_word : key_words_array){
                matches = false;
                if(input.matches(".*"+key_word+".*")){
                    matches = true;
                    break;
                }
            }
            matriz.add(matches);
        }
        
        for(Boolean test :matriz){
            if(!test){
                return false;
            }
        }
   
        return true;
    }
    
    public String getRandomAnswer(){
        int index = this.getRandomIntegerBetweenRange(0, (this.answers.size()-1));
        return this.answers.get(index);
    }
    
    
    private int getRandomIntegerBetweenRange(double min, double max){
       double x = (int)(Math.random()*((max-min)+1))+min;
       return (int)x;
   }
}

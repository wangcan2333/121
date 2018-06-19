package wwww;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
                         //          斗地主
public class Poker {

	public static void main(String[] args) {
// 准备牌   斗地主
	ArrayList<String> poker = new ArrayList<String>();
	
    ArrayList<String> number = new ArrayList<String>();	
           for(int i=2;i<=10;i++){
        	   number.add(i+" ");
           }
               number.add("J");
               number.add("Q");
               number.add("K");
               number.add("A");
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("♥");
	colors.add("♠");
	colors.add("♦");
	colors.add("♣");
// 准备牌
      for(String thisnumber: number ){
    	  for(String thiscolor:colors){
    	String thispoker= thisnumber+thiscolor;	
    	poker.add(thispoker);
    	  }
      }
    		  
        poker.add("大☺");
		poker.add("小☺"); 
     
            // 洗牌
     Collections.shuffle(poker); 
     
		    // 发牌
     ArrayList<String> player1 = new ArrayList<String>();
     ArrayList<String> player2 = new ArrayList<String>();
     ArrayList<String> player3 = new ArrayList<String>();
     ArrayList<String> dipai = new ArrayList<String>();
     
     for(int i = 0;i <54-3;i++){
    	 String p = poker.get(i);
    	 if(i%3==0){
    		player1.add(p); 
    	 }else if(i%3==1){
    		player2.add(p); 
    	 }else{
    		player3.add(p); 
    	 }
     }
     for(int i=51;i<54;i++){
    	 dipai.add(poker.get(i));
     }
		    // 看牌
     System.out.println(player1);
     System.out.println(player2);
     System.out.println(player3);
     System.out.println(dipai);
	}

}

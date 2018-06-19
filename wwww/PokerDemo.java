package wwww;

import java.util.*;

public class PokerDemo {

	public static void main(String[] args) {
			HashMap<Integer, String> map = new HashMap<Integer,String>();
			
			ArrayList<String> colors = new ArrayList<String>();
			Collections.addAll(colors, "♣","♦","♠","♥");
			
			ArrayList<String> number = new ArrayList<String>();	
	           for(int i=3;i<=10;i++){
	        	   number.add(i+" ");
	           }
	        Collections.addAll(number, "J","Q","K","A","2"); 
	        int cardNumber = 0;  
	        
	        for(String thisNumber:number){
	        	for(String thisColor:colors){
	        		String thisCard= thisNumber+thisColor;
	        		map.put(cardNumber, thisCard);
	        		cardNumber++;
	        	}
	        }
	        
	        map.put(cardNumber++, "小joker");
	        map.put(cardNumber++, "大joker");
	        System.out.println(map);
	        
			ArrayList<Integer> poker = new ArrayList<Integer>();
			for(int integer=0;integer<54;integer++){
				poker.add(integer);
			}
			
			Collections.shuffle(poker); 
 //发牌
			 ArrayList<Integer> player1 = new ArrayList<Integer>();
		     ArrayList<Integer> player2 = new ArrayList<Integer>();
		     ArrayList<Integer> player3 = new ArrayList<Integer>();
		     ArrayList<Integer> dipai = new ArrayList<Integer>();
		     
		     for(int index = 0;index <poker.size()-3;index++){
		     Integer integerCard = poker.get(index);
		    	 if(index%3==0){
		    		player1.add(integerCard); 
		    	 }else if(index%3==1){
		    		player2.add(integerCard); 
		    	 }else{
		    		player3.add(integerCard); 
		    	 }
		     }
		     for(int i = poker.size()-3;i<poker.size();i++){
		    	 Integer integerCard = poker.get(i);
		    	 dipai.add(integerCard);
		     }
		     
		     Collections.sort(player1);
		     Collections.sort(player2);
		     Collections.sort(player3);
		     Collections.sort(dipai);
		     
		     //看牌
		     for(int i= 0;i<player1.size();i++){
		    	 System.out.print(map.get(player1.get(i)));
		     }
		     System.out.println(" ");
		     
		     for(int i= 0;i<player2.size();i++){
		    	 System.out.print(map.get(player2.get(i)));
		     }
		     System.out.println(" ");
		     
		     for(int i= 0;i<player3.size();i++){
		    	 System.out.print(map.get(player3.get(i)));
		     }
		     System.out.println(" ");
		     
		     for(Integer integer : dipai){
		    	 String realCard = map.get(integer);
		    	 System.out.print(realCard+" ");
		 }
		     
	}

}

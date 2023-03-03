package cd;
import java.util.*;
public class Porim {
public static Scanner input=new Scanner (System.in);
	public static void main(String[] args) {
    int [][] friends = 
    		{{-1,1,0,1},
    		{1,-1,1,0},
    		{0,1,-1,0},
    		{1,0,0,-1}};
    String [] names= 
    		{"Benny","Yosi","Avi","Kobi"};
    for (int i=0; i<friends.length;i++){
    	boolean sent=false;
    	for(int j=0;(!sent)&&j<friends[0].length;j++) {
    		if (friends[i][j]==0) {
//    			System.out.println(i+" sent to "+j);
    			System.out.println(names[i]+" sent to "+names[j]);
    			sent=true;
    		}
    	}
    }
	}

}

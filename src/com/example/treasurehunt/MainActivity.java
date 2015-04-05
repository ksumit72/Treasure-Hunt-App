package com.example.treasurehunt;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	static String[][][] answer = new String[26][5][2];
	static int teamID = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		for(int t=0;t<40;t++)
			for(int i=1;i<=4;i++)
			{
				answer[t][i][0] = "answer"+i;
				answer[t][i][1] = "location"+i;
			}
		
		{
			//team 1
			{
				answer[1][1][0] = "deewar";
				
				answer[1][2][1]="Insert Vehicle number";
				answer[1][2][0]="river";
				
				answer[1][3][1]="GDPI - 1";
				
			}
			//team 2
			{
				answer[2][1][0] = "vidya balan";
				
				answer[2][2][1]="Insert Vehicle number";
				answer[2][2][0]="song";
				
				answer[2][3][1]="GDPI - 2";
			}
			//team 3
			{
				answer[3][1][0] = "PK";
				
				answer[3][2][1]="Insert Vehicle number";
				answer[3][2][0]="peak";
				
				answer[3][3][1]="GDPI - 3";
			}
			//team 4
			{
				answer[4][1][0] = "aashiqui 2";
				
				answer[4][2][1]="Insert Vehicle number";
				answer[4][2][0]="wave";
				
				answer[4][3][1]="GDPI - 4";
			}
			//team 5
			{
				answer[5][1][0] = "sonakshi sinha";
				
				answer[5][2][1]="Insert Vehicle number";
				answer[5][2][0]="movie";
				
				answer[5][3][1]="Near Reading Hall's entry (left side)";
			}
			//team 6
			{
				answer[6][1][0] = "deewar";
				
				answer[6][2][1]="Insert Vehicle number";
				answer[6][2][0]="digit";
				
				answer[6][3][1]="Near Reading Hall's entry (right side)";
			}
			//team 7
			{
				answer[7][1][0] = "sunil shetty";
				
				answer[7][2][1]="Insert Vehicle number";
				answer[7][2][0]="card";
				
				answer[7][3][1]="Explore the TT table";
			}
			//team 8
			{
				answer[8][1][0] = "housefull 2";
				
				answer[8][2][1]="Insert Vehicle number";
				answer[8][2][0]="rack";
				
				answer[8][3][1]="Ask around in the Xerox Center";
			}
			//team 9
			{
				answer[9][1][0] = "raja babu";
				
				answer[9][2][1]="Insert Vehicle number";
				answer[9][2][0]="swim";
				
				answer[9][3][1]="Ask around in the Xerox Center";
			}
			//team 10
			{
				answer[10][1][0] = "rajesh khanna";
				
				answer[10][2][1]="Insert Vehicle number";
				answer[10][2][0]="baby";
				
				answer[10][3][1]="Ask around in the Xerox Center";
			}
			//team 11
			{
				answer[11][1][0] = "priyanka chopra";
				
				answer[11][2][1]="Insert Vehicle number";
				answer[11][2][0]="hand";
				
				answer[11][3][1]="Ask around in the Xerox Center";
			}
			//team 12
			{
				answer[12][1][0] = "mr. india";
				
				answer[12][2][1]="Insert Vehicle number";
				answer[12][2][0]="goal";
				
				answer[12][3][1]="Ask around in the Xerox Center";
			}
			//team 13
			{
				answer[13][1][0] = "wanted";
				
				answer[13][2][1]="Insert Vehicle number";
				answer[13][2][0]="fail";
				
				answer[13][3][1]="Ask around in the Canteen";
			}
			//team 14
			{
				answer[14][1][0] = "rajesh khanna";
				
				answer[14][2][1]="Insert Vehicle number";
				answer[14][2][0]="live";
				
				answer[14][3][1]="Ask around in the Canteen";
			}
			//team 15
			{
				answer[15][1][0] = "sunny deol";
				
				answer[15][2][1]="Insert Vehicle number";
				answer[15][2][0]="clue";
				
				answer[15][3][1]="Ask around in the Canteen";
			}
			//team 16
			{
				answer[16][1][0] = "aamir khan";
				
				answer[16][2][1]="Insert Vehicle number";
				answer[16][2][0]="hair";
				
				answer[16][3][1]="Ask around in the Canteen";
			}
			//team 17
			{
				answer[17][1][0] = "shashi kapoor";
				
				answer[17][2][1]="Insert Vehicle number";
				answer[17][2][0]="role";
				
				answer[17][3][1]="Ask around in the Canteen";
			}
			//team 18
			{
				answer[18][1][0] = "shahrukh khan";
				
				answer[18][2][1]="Insert Vehicle number";
				answer[18][2][0]="music";
				
				answer[18][3][1]="Go in Library's first lane (right-side)";
			}
			//team 19
			{
				answer[19][1][0] = "arjun rampal";
				
				answer[19][2][1]="Insert Vehicle number";
				answer[19][2][0]="beat";
				
				answer[19][3][1]="Go in Library's first lane (left-side)";
			}
			//team 20
			{
				answer[20][1][0] = "sonakshi sinha";
				
				answer[20][2][1]="Insert Vehicle number";
				answer[20][2][0]="down";
				
				answer[20][3][1]="Go in Library's second lane (right-side)";
			}
			//team 21
			{
				answer[21][1][0] = "rakhi";
				
				answer[21][2][1]="Insert Vehicle number";
				answer[21][2][0]="bark";
				
				answer[21][3][1]="Go in Library's second lane (left-side)";
			}
			//team 22
			{
				answer[22][1][0] = "deepika padukone";
				
				answer[22][2][1]="Insert Vehicle number";
				answer[22][2][0]="keep";
				
				answer[22][3][1]="Go in Library's third lane (right-side)";
			}
			//team 23
			{
				answer[23][1][0] = "jaya bachchan";
				
				answer[23][2][1]="Insert Vehicle number";
				answer[23][2][0]="look";
				
				answer[23][3][1]="Go in Library's third lane (left-side)";
			}
			//team 24
			{
				answer[24][1][0] = "ajay devgan";
				
				answer[24][2][1]="Insert Vehicle number";
				answer[24][2][0]="mule";
				
				answer[24][3][1]="TnP Cabin 1";
			}
			//team 25
			{
				answer[25][1][0] = "dabaangg";
				
				answer[25][2][1]="Insert Vehicle number";
				answer[25][2][0]="ring";
				
				answer[25][3][1]="TnP Cabin 2";
			}
			
		}
		
		/*for(int t=0;t<40;t++)
			for(int i=1;i<=4;i++)
			{
				answer[t][i][0] = "answer"+i;
				answer[t][i][1] = "location"+i;
			}*/
		//Toast.makeText(getApplicationContext(), "YOLO2", Toast.LENGTH_LONG).show();
	}

	public void clicked(View view) {
	    // Do something in response to button
		EditText editText = (EditText) findViewById(R.id.editText1);
		String message = editText.getText().toString().trim();
		try
		{
			teamID = Integer.parseInt(message);
			if(teamID>0 && teamID<36)
			{
				Intent intent = new Intent(this, Question1.class);
				startActivity(intent);	
			}
			
		}
		catch(Exception e){
			//lol. 
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public static boolean checkString(String x, String y)
	{
		//return x.equalsIgnoreCase(y);
		
		if(StringSimilarity.similarity(x, y)>=.7f)
			return true;
		else
			return false;
		
		
	}
	
	static class StringSimilarity {
		 
	    /**
	     * Calculates the similarity (a number within 0 and 1) between two strings.
	     */
	    public static double similarity(String s1, String s2) {
	        String longer = s1, shorter = s2;
	        if (s1.length() < s2.length()) { // longer should always have greater length
	            longer = s2; shorter = s1;
	        }
	        int longerLength = longer.length();
	        if (longerLength == 0) { return 1.0; /* both strings are zero length */ }
	        /* // If you have StringUtils, you can use it to calculate the edit distance:
	        return (longerLength - StringUtils.getLevenshteinDistance(longer, shorter)) /
	                                                             (double) longerLength; */
	        return (longerLength - editDistance(longer, shorter)) / (double) longerLength;
	 
	    }
	 
	    // Example implementation of the Levenshtein Edit Distance
	    // See http://r...content-available-to-author-only...e.org/wiki/Levenshtein_distance#Java
	    public static int editDistance(String s1, String s2) {
	        s1 = s1.toLowerCase();
	        s2 = s2.toLowerCase();
	 
	        int[] costs = new int[s2.length() + 1];
	        for (int i = 0; i <= s1.length(); i++) {
	            int lastValue = i;
	            for (int j = 0; j <= s2.length(); j++) {
	                if (i == 0)
	                    costs[j] = j;
	                else {
	                    if (j > 0) {
	                        int newValue = costs[j - 1];
	                        if (s1.charAt(i - 1) != s2.charAt(j - 1))
	                            newValue = Math.min(Math.min(newValue, lastValue),
	                                    costs[j]) + 1;
	                        costs[j - 1] = lastValue;
	                        lastValue = newValue;
	                    }
	                }
	            }
	            if (i > 0)
	                costs[s2.length()] = lastValue;
	        }
	        return costs[s2.length()];
	    }
	 
	    public static void printSimilarity(String s, String t) {
	        System.out.println(String.format(
	            "%.3f is the similarity between \"%s\" and \"%s\"", similarity(s, t), s, t));
	    }
	    
	}
	
}

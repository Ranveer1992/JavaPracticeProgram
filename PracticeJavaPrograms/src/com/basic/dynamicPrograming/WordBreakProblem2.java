package com.basic.dynamicPrograming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordBreakProblem2 {
	// Function to check if the word
	// is in the dictionary or not
	static boolean match_words(String dictionary[], String sentence[],
	                                                    int n, int m)
	{
	    // map to store all words in
	    // dictionary with their count
	    Map<String,Integer> mp = new HashMap<>();
	 
	    // adding all words in map
	    for (int i = 0; i < n; i++)
	    {
	        if(mp.containsKey(dictionary[i]))
	        {
	            mp.put(dictionary[i], mp.get(dictionary[i])+1);
	        }
	        else
	        {
	            mp.put(dictionary[i], 1);
	        }
	    }
	 
	    // search in map for all
	    // words in the sentence
	    for (int i = 0; i < m; i++) 
	    {
	        if (mp.containsKey(sentence[i]))
	            mp.put(sentence[i],mp.get(sentence[i])-1);
	        else
	            return false;
	    }
	 
	    // all words of sentence are present
	    return true;
	}
	 
	// Driver Code
	public static void main(String[] args) 
	{
	    String dictionary[] = { "find", "a", "geeks",
	                            "all", "for", "on",
	                            "geeks", "answers", "inter" };
	 
	    int n = dictionary.length;
	 
	    String sentence[] = { "find", "all", "answers", "on",
	                        "geeks", "for", "geeks" };
	 
	    int m = sentence.length;
	 
	    // Calling function to check if words are
	    // present in the dictionary or not
	    if (match_words(dictionary, sentence, n, m))
	        System.out.println("YES");
	    else
	        System.out.println("NO");
	    }
	}
	 
	// This code is contributed by Princi Singh

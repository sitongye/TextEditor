package spelling;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary 
{

	private LinkedList<String> dict;
	
    // TODO: Add a constructor
	public DictionaryLL(){
	dict = new LinkedList<String>();
	}
    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	// TODO: Implement this method
    	String lowerWord = word.toLowerCase();
    	if (this.dict.size()!=0) {
    	
    	if (this.dict.contains(lowerWord)) {
    		return false;
    	}
    	}
    	this.dict.add(lowerWord);
        return true;
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
        // TODO: Implement this method
        return this.dict.size();
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
    	String lowerS = s.toLowerCase();
    	if(this.dict.size()!=0) {
    	if (this.dict.contains(lowerS)) {
    			return true;
    	}
    	
        
    }
    	return false;
    
}
}

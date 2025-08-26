// Atticus House 
// AP CSA 
// 8/26/25

public class WordScramble{ 
    public static void main(String args[]){ 
        
        /*Challenge 1 
        Scrambles words by flipping the first and last letters 
        */
        String wordOne = ("popcorn");  

        String firstLetterOne = wordOne.substring(0, 1); 
        int lenOne = 7;  
        String lastLetterOne = wordOne.substring((int)lenOne - 1); 
        String centerOne = wordOne.substring(1,lenOne - 1); 
        System.out.println (lastLetterOne + centerOne + firstLetterOne);  

        /* Challenge 2  
        Prints ASCII art w/ special reserved characters, only using one "println" statement 
        */ 
        
        //       .     
        // \____) \____ 
        // /--v____  __`< 
        //         )/    
        //         '                 
        
        System.out.println("\n      .\n\\____( \\____\n/--v____  __`<\n        )/\n        '");




    }
}
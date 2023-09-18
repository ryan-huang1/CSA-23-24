/**
 * Project: NameThatCelebrity
 * Author: Ryan Huang
 * Date: 9.18.23
 * Description: This program displays partial names of celebrities after 
 * removing the first two and last three letters, and converting the remaining 
 * letters to lowercase.
 */

public class NameThatCelebrity {
    public static void main(String[] args) {
        String s1 = "Taylor Swift";
        String s2 = "John Boyega";
        String s3 = "Emma Stone";
        
        // Apply transformations
        String modifiedS1 = s1.substring(2, s1.length() - 3).toLowerCase();
        String modifiedS2 = s2.substring(2, s2.length() - 3).toLowerCase();
        String modifiedS3 = s3.substring(2, s3.length() - 3).toLowerCase();
        
        // Display the result in one println statement
        System.out.println(s1 + ">>>" + modifiedS1 + "\n" + s2 + ">>>" + modifiedS2 + "\n" + s3 + ">>>" + modifiedS3);
    }
}

/**
 * Footer:
 * Taylor Swift>>>ylor sw
 * John Boyega>>>hn boy
 * Emma Stone>>>ma st
 */

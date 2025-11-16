import java.util.Scanner;

public class UserStory {

  /**
  *Creates the 1D arrays
  */
  
  private String[] title;
  private String[] author;
  private double[] rating;

  /**
  *Sets variables to the values of the text files
  */
  
  public UserStory(String authorFile, String titleFile, String ratingFile){
    this.title = FileReader.toStringArray("title.txt");
    this.author = FileReader.toStringArray("author.txt");
    this.rating = FileReader.toDoubleArray("rating.txt");
  }

  /*
  *This method goes through each index of the rating array and checks if it is over 4.20, 
  *if so, it will get the title of that index and display it
  */
  public String MinRating(String titleFile, String ratingFile){
    String book = "Books over the rating of 4.20:" + "\n" + "\n";
    for (int i = 0; i < rating.length; i++) {
      if(rating[i] >= 4.20){
        book += title[i] + " with the rating of " + rating[i] + "\n";
      } 
    }
   return book;
 }

  /* 
  *Displays each index(title, author, and rating)
  */

  public String toString() {
    String result = "";
    for (int i = 0; i < title.length; i++) {
      result += "Title: " + title[i] + "  Author: " + author[i] + "  Rating: " + rating[i];
      result += "\n";
    }
    return result;
  }
}
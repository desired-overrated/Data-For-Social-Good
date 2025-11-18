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
  *calculates the total amount of ratings for the average method
  */
  
  public double TotalRating(){
    double totalRating = 0.0;

     for (int i = 0; i < rating.length; i++) {
      double total = rating[i];
       if (total >= 0) {
        totalRating += total;
      }
    }
    
    return totalRating;
  }

/*
*uses the TotalRating method and divides by the ratings length
*/
  
  public double AverageRating(){
   if (rating.length == 0) {
      return 0;
    }
    
    double average = TotalRating();
    return average / rating.length;
  }

  /* 
  *Displays each index(title, author, and rating)
  */

  public String toString() {
    String result = "Suggested books are: " + "\n" + "\n";
    for(String book : title){
       result += book + "\n";
    }
    return result;
  }
}

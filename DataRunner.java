import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    /* 
    *userStory object
      */
    UserStory op = new UserStory("title.txt", "author.txt", "rating.txt");

    /* 
      *prints all the data
    */
    System.out.println(op);

    /*
      *calls the minRating mathod
      */
    System.out.println(op.MinRating("title.txt", "rating.txt"));

    /*
    *Calls the TotalRating method
      */
     op.TotalRating();

    /*
      *calls the AverageRating method
      */
    System.out.println("Average rating of suggested books " + op.AverageRating());
    

    
  }
}
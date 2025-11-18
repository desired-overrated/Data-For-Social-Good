public class Books{
  private String titles;
  private String authors;
  private double ratings;

  /*
  *sets the variables
  */

  public Books(String titles, String authors, double ratings) {
    this.titles = titles;
    this.authors = authors;
    this.ratings = ratings;
  }

  public String getTitle() {
    return titles;
  }
  public String getAuthor() {
    return authors;
  }
  public double getRating() { 
    return ratings;
  }

  public String toString() {
       return "Title: " + titles + "  Author: " + authors + "  Rating: " + ratings;
  }
}
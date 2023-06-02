public class TestReview
{
    public static void main(String[] args)
    {

        //Test the totalSentiment and starRating methods here!
        System.out.println(Main.totalSentiment("SimpleReview.txt"));
        System.out.println(Main.starRating("SimpleReview.txt"));
        System.out.println("");
        System.out.println(Main.totalSentiment("26WestReview.txt"));
        System.out.println(Main.starRating("26WestReview.txt"));

    }
}
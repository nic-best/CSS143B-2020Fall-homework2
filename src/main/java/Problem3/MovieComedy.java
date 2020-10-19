package Problem3;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieComedy(MovieComedy anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super(anotherMovie.rating, anotherMovie.title);
        //ids need to be same to be true copy.
        this.id = anotherMovie.id;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        //if we arent past due, then we dont charge customer
        if(numOfDaysPastDue<0){
            return 0;
        }
        return numOfDaysPastDue*lateFeePerDayInDollar;
    }
}

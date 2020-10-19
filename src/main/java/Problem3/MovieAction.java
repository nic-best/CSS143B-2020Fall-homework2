package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
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
        if(numOfDaysPastDue<5){
            return numOfDaysPastDue*lateFeePerDayInDollar;
        }
        return 2*numOfDaysPastDue*lateFeePerDayInDollar;
    }
}

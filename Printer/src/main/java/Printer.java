public class Printer {

    private int numberOfSheets;
    private int toner;

    public Printer(int numberOfSheets){
       this.numberOfSheets = numberOfSheets;
       this.toner = 100;
    }

    public int getNumberOfSheets(){
        return this.numberOfSheets;
    }

    public int getToner(){
        return this.toner;
    }


    public void refill(){
       this.numberOfSheets = 100;
    }

    public void reduceToner(int pages){
        this.toner -= pages;
    }


    public void print(int numberOfPages, int numberOfCopies){
        int totalPages = numberOfPages * numberOfCopies;
        if (this.numberOfSheets >= totalPages){
            this.numberOfSheets -= totalPages;
            reduceToner(totalPages);
        }
    }



}

public class WaterBottle {

    private int volume;
    private int drinkVolume;

    public WaterBottle(){
       this.volume = 100;
       this.drinkVolume = 10;
    }

    public int getVolume(){
        return this.volume;
    }

    public int getDrinkVolume(){
        return this.drinkVolume;
    }

    public int drink(){
        this.volume = this.volume - this.drinkVolume ;
        return this.volume;
    }

    public int empty(){
        this.volume = 0;
        return this.volume;
    }

    public int fill(){
        this.volume = 100;
        return this.volume;
    }
}

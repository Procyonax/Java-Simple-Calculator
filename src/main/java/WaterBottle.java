public class WaterBottle {
    public int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getDrink() {
        return this.volume;
    }
    public void empty() {
        this.volume = 0;
    }

    public void full() {
        this.volume = 100;
    }

    public void drink() {
        this.volume = volume - 10;
    }
}

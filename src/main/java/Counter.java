
public class Counter {

    private int count;

    public Counter() {
        this.resets();
    }

    public void resett() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

}

public class Tank {
    private int id;
    private int maxCapacity;
    private int currentCapacity;
    private int leakRate;

    public Tank(int id, int maxCapacity, int currentCapacity, int leakRate) {
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
        this.leakRate = leakRate;
    }

    public int queryMaxCapacity(){
        return this.maxCapacity;
    }

    public int queryCurrentCapacity(){
        return this.currentCapacity;
    }

//    public boolean addWater(int quantity){
//
//    }
}

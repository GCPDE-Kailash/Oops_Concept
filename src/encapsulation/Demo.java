package encapsulation;

class Car {
    private String name;
    private int mileage;
    private int cost;

    public void setData(String x, int y, int z) {
        name = x;
        mileage = y;
        cost = z;
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    public int getCost() {
        return cost;
    }
}
    class Demo {
        public static void main(String[] args) {
            Car c = new Car();
            c.setData("BMW",10,7000000);
            System.out.println(c.getName());
            System.out.println(c.getMileage());
            System.out.println(c.getCost());
        }
    }


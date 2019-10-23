package ch04;

public class Dish {
    private final String name;
    private final boolean vefetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vefetarian, int calories, Type type) {
        this.name = name;
        this.vefetarian = vefetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVefetarian() {
        return vefetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                '}';
    }

    public enum Type {
        MEAT
        ,FISH
        ,OTHER
    }
}

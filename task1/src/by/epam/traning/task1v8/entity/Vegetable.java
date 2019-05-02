package by.epam.traning.task1v8.entity;

/**
 *
 */
public abstract class Vegetable {
    /**
     */
    private String name = "default";
    /**
     */
    private double weight = 0;
    /**
     */
    private double calories = 0;

    /**
     * @return calories.
     */
    public double getCalories() {
        return calories;
    }

    /**
     * @param vegetableCalories setup calories in object.
     */
    void setCalories(final double vegetableCalories) {
        this.calories = vegetableCalories;
    }

    /**
     * @return name of vegetable.
     */
    public String getName() {
        return name;
    }

    /**
     * @param vegetableName setup name of vegetable.
     */
    void setName(final String vegetableName) {
        this.name = vegetableName;
    }

    /**
     * @return weight of vegetable.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param vegetableWeight setup weight of vegetable.
     */
    void setWeight(final double vegetableWeight) {
        this.weight = vegetableWeight;
    }
}

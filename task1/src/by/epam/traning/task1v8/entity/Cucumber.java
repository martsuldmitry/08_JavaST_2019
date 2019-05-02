package by.epam.traning.task1v8.entity;

/**
 */
public final class Cucumber extends Fruit {
    /**
     */
    private static final double CUCUMBER_CALORIES = 0.16;

    /**
     * @param cucumberWeight setup weight of cucumber.
     */
    public Cucumber(final double cucumberWeight) {
        super.setName(NameVegetables.CUCUMBER.name());
        super.setWeight(cucumberWeight);
        super.setCalories(CUCUMBER_CALORIES);
    }

}

package by.epam.traning.task1v8.entity;

/**
 */
public final class Potato extends RootVegetable {
    /**
     */
    private static final double POTATO_CALORIES = 0.666;

    /**
     * @param potatoWeight - setup potato weight.
     */
    public Potato(final double potatoWeight) {
        super.setName(NameVegetables.POTATO.name());
        super.setWeight(potatoWeight);
        super.setCalories(POTATO_CALORIES);
    }
}

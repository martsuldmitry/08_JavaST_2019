package by.epam.traning.task1v8.entity;

/**
 */
public final class Mint extends Leaf {
    /**
     */
    private static final double MINT_CALORIES = 0.0061;

    /**
     * @param mintWeight setup mint weight.
     */
    public Mint(final double mintWeight) {
        super.setName(NameVegetables.MINT.name());
        super.setWeight(mintWeight);
        super.setCalories(MINT_CALORIES);
    }
}

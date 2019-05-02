package by.epam.traning.task1v8.entity;

/**
 */
public abstract class RootVegetable extends Vegetable {
    /**
     */
    private String soil;

    /**
     * @return type of soil.
     */
    public String getSoil() {
        return soil;
    }

    /**
     * @param soilForRoot setup type of soil.
     */
    public void setSoil(final String soilForRoot) {
        this.soil = soilForRoot;
    }
}

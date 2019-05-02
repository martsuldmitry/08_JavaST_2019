package by.epam.traning.task1v8.entity;

/**
 *
 */
public abstract class Leaf extends Vegetable {
    /**
     *
     */
    private Colors color;

    /**
     * @return color of vegetable.
     */
    public Colors getColor() {
        return color;
    }

    /**
     * @param colorOfLeaf setup color of leaf vegetable.
     */
    public void setColor(final Colors colorOfLeaf) {
        this.color = colorOfLeaf;
    }

}

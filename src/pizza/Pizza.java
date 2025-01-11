/*
Name: IRATUZI Philemon
RegNumber: 18746/2021
Class: Pizza
Description: Represents a pizza with numSlices, meatChoice, and vegChoice.
Instance Variables: numSlices, meatChoice, vegChoice
 */

package pizza;
public class Pizza {
    private int numSlices;
    private MeatChoice meatChoice;
    private VegChoice vegChoice;

    /**
     * Enum for meat choices.
     */
    public enum MeatChoice {
        PEPPERONI, SAUSAGE, BACON, HAM
    }

    /**
     * Enum for veg choices.
     */
    public enum VegChoice {
        MUSHROOMS, ONIONS, GREEN_PEPPERS, EXTRA_CHEESE, TOMATOES
    }

    /**
     * Default constructor that randomly determines the pizza.
     */
    public Pizza() {
        numSlices = (int) (Math.random() * 10) + 1; // random number between 1 and 10
        meatChoice = MeatChoice.values()[(int) (Math.random() * MeatChoice.values().length)];
        vegChoice = VegChoice.values()[(int) (Math.random() * VegChoice.values().length)];
    }

    /**
     * Parameterized constructor.
     *
     * @param numSlices   number of slices
     * @param meatChoice  meat choice
     * @param vegChoice   veg choice
     */
    public Pizza(int numSlices, MeatChoice meatChoice, VegChoice vegChoice) {
        this.numSlices = numSlices;
        this.meatChoice = meatChoice;
        this.vegChoice = vegChoice;
    }

    /**
     * Gets the number of slices.
     *
     * @return number of slices
     */
    public int getNumSlices() {
        return numSlices;
    }

    /**
     * Sets the number of slices.
     *
     * @param numSlices number of slices
     */
    public void setNumSlices(int numSlices) {
        this.numSlices = numSlices;
    }

    /**
     * Gets the meat choice.
     *
     * @return meat choice
     */
    public MeatChoice getMeatChoice() {
        return meatChoice;
    }

    /**
     * Sets the meat choice.
     *
     * @param meatChoice meat choice
     */
    public void setMeatChoice(MeatChoice meatChoice) {
        this.meatChoice = meatChoice;
    }

    /**
     * Gets the veg choice.
     *
     * @return veg choice
     */
    public VegChoice getVegChoice() {
        return vegChoice;
    }

    /**
     * Sets the veg choice.
     *
     * @param vegChoice veg choice
     */
    public void setVegChoice(VegChoice vegChoice) {
        this.vegChoice = vegChoice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "numSlices=" + numSlices +
                ", meatChoice=" + meatChoice +
                ", vegChoice=" + vegChoice +
                '}';
    }
}
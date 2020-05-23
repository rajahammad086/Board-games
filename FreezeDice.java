/**
 * A single die that can be frozen. Rolling a frozen die has no effect.
 */

public class FreezeDice {

	private int numsides_; // number of sides
	private int value_; // currently-showing value
	private boolean frozen_; // true means die is frozen (i.e. rolling has no
								// effect)

	/**
	 * Create a new, unfrozen die with the specified number of sides.
	 *
	 * @param numsides
	 *            the number of sides on the die
	 */

	public FreezeDice(int numsides) {
		numsides_ = numsides;
		value_ = 1;
		frozen_ = false;
	}

	/**
	 * Get the die's current value.
	 *
	 * @return the value currently showing on the die
	 */

	public int getValue() {
		return value_;
	}

	/**
	 * Freeze the die - subsequent rolls will not change the value.
	 */

	public void freeze() {
		frozen_ = true;
	}

	/**
	 * Unfreeze the die - subsequent rolls can change the value.
	 */

	public void unfreeze() {
		frozen_ = false;
	}

	/**
	 * Is the die frozen?
	 * 
	 * @return true if the die is currently frozen, false if not
	 */

	public boolean isFrozen() {
		return frozen_;
	}

	/**
	 * Roll the die. This has no effect if the die is frozen.
	 */

	public void roll() {
		if (!frozen_) {
			value_ = (int) (Math.random() * numsides_) + 1;
		}
	}
}
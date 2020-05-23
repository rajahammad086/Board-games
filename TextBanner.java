import java.awt.Color;

/**
 * An animated text banner. The banner moves one pixel to the right with each
 * animation step.
 * 
 * @author Stina Bridgeman
 */

public class TextBanner {

  private String message_; // the text displayed in the banner

  private int x_, y_; // the current position of the banner in the window

  private Color color_; // the color to paint the banner

  /**
   * Create a new text banner.
   * 
   * @param message
   *          the text message to display
   * @param x
   *          starting x coordinate for the banner
   * @param y
   *          starting y coordinate for the banner
   * @param color
   *          color to paint the banner
   */

  public TextBanner ( String message, int x, int y, Color color ) {
    message_ = message;
    x_ = x;
    y_ = y;
    color_ = color;
  }

  /**
   * Perform one animation step: move the banner's position on pixel to the
   * right and redraw it.
   *
   * This method is used by PaintAnimator, and should never be called
   * directly.
   */

  public void doAnimateStep () {
    x_++;
    Paint.setColor(color_);
    Paint.drawString(message_,x_,y_);
  }

}

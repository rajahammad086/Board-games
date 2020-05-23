//Raja Hammad Mehmood.
// We created 3 different statements and made them go across the window.
import java.awt.*;
import javax.swing.*;

public class Banners {

    public static void main ( String[] args ) {

        Paint.buildWindow("Raja Hammad Mehmood", 0, 0, 500, 500, Color.BLACK);// building a window
        // creating 3 objects (a, b, c ) as a TextBanner
        TextBanner a =new TextBanner("Hello!", 20, 100, Color.RED);
        TextBanner b =new TextBanner("Hello World!", 0, 400, Color.BLUE);
        TextBanner c =new TextBanner("How you doing?", 0, 200, Color.ORANGE);
        PaintAnimator animator=new PaintAnimator(15); // making a PaintAnimator with 15 millisecond delay
        // animating the text.
        animator.animate(a);
        animator.animate(b);
        animator.animate(c);

       

        


    }
}
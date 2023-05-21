import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycleExample extends Applet {
    public void init() {
        // Called when the applet is first loaded into memory
        System.out.println("init() method called.");
    }

    public void start() {
        // Called after the init() method and when the applet is ready to start
        System.out.println("start() method called.");
    }

    public void paint(Graphics g) {
        // Called whenever the applet needs to be redrawn, such as when the applet is first loaded or when it is resized
        System.out.println("paint() method called.");
        g.drawString("Hello, world!", 50, 25);
    }

    public void stop() {
        // Called when the applet is stopped, such as when the user navigates to a different web page
        System.out.println("stop() method called.");
    }

    public void destroy() {
        // Called when the applet is no longer needed and is being destroyed
        System.out.println("destroy() method called.");
    }
}

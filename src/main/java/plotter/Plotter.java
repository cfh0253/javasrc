/**
 * Plotter abstract class. Must be subclassed 
 * for X, DOS, Penman, HP plotter, etc.
 *
 * @author	Ian F. Darwin
 */
public abstract class Plotter {
	public final int MAXX = 800;
	public final int MAXY = 600;
	/** Current X co-ordinate (same reference frame as AWT!) */
	protected int curx;
	/** Current Y co-ordinate (same reference frame as AWT!) */
	protected int cury;
	/** The current direction of motion */
	protected float dir;
	/** The current state: up or down */
	protected boolean penIsUp;
	/** The current color */
	protected int penColor;

	Plotter() {
		penIsUp = true;
		curx = 0; cury = 0;
	}
	abstract boolean rmoveTo(int incrx, int incry);
	abstract boolean moveTo(int absx, int absy);
	abstract boolean setdir(float deg);
	abstract void penUp();
	abstract void penDown();
	abstract void penColor(int c);

	abstract void setFont(String fName, int fSize);
	abstract void drawString(String s);

	/* Concrete classes */

	/** Draw a box of width w and height h */
	public void drawBox(int w, int h)
	{
		penDown();
		rmoveTo(w, 0);
		rmoveTo(0, h);
		rmoveTo(-w, 0);
		rmoveTo(0, -h);
		penUp();
	}
}


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SWTPrimer {

	/**
	 * @author dima 20140202
	 * @param args
	 *
	 */
	
	public static void main (String [] args) {
	    Display display = new Display ();
	    Shell shell = new Shell (display);
	    shell.setText("Hello World!");
	    shell.open ();
	    while (!shell.isDisposed ())	{
	    	if (!display.readAndDispatch()) display.sleep ();
	    }
	    display.beep();		//beeps when window close
	    display.dispose ();
	    
	}
}

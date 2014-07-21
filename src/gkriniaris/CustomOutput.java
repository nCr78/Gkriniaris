package gkriniaris;

import java.io.IOException;
import java.io.OutputStream;
 
import javax.swing.JTextArea;
 
/**
 * This class extends from System OutputStream to redirect output to a JTextArrea
 * @author nCr78
 */
public class CustomOutput extends OutputStream 
{
    private JTextArea textArea;
     
    public CustomOutput(JTextArea textArea) 
    {
        this.textArea = textArea;
    }
     
    @Override
    public void write(int b) throws IOException 
    {
        // redirects data to the text area
        textArea.append(String.valueOf((char)b));
        // scrolls the text area to the end of data
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}

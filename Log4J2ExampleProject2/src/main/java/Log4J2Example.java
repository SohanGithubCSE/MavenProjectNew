import org.apache.logging.log4j.LogManager; // class
import org.apache.logging.log4j.Logger; // interface

public class Log4J2Example
{
    private static final Logger l = LogManager.getLogger(Log4J2Example.class);

    public static void main(String[] args) 
    {
        l.info("This is an info message");
        
        l.error("This is an error message");
    }
}
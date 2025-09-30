package exercice1;
import java.io.File;
import java .io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Logger {

    private static Logger instance ;
    private PrintWriter file;

    private Logger()  {
        try {
            file = new PrintWriter(new FileWriter("app.log", true));
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message) {
        file.println(message);
        file.flush();
    }



}

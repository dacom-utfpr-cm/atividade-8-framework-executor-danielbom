package exercise5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Faça um programa que possibilite agendar uma tarefa para ser executada em um
 * horário especı́fico.
 * 
 * @author daniel
 */
public class Exercise5 {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");

    public static void main(String[] args) throws ParseException {
	Runnable task = () -> System.out.println("Hello world");
	new ExecuteInDate(task, dateFormat.parse("11/11/2019 20:15:00")).run();
    }
}

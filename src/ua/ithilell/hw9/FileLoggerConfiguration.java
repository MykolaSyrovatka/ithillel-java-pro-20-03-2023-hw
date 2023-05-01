package ua.ithilell.hw9;

import ua.ithilell.hw9.exceptions.FileMaxSizeReachedException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class FileLoggerConfiguration {
    private File myFile = new File("./log-file.txt");
    private final int MAX_LENGTH = 100;

    private LoggingLevel loggingLevel;

    private String formatRecording;
    // "[" + new Date() + "] \t [" +  loggingLevel + "] \t ";
    public FileLoggerConfiguration(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public void write(String message) throws FileMaxSizeReachedException {
        formatRecording = "[" + new Date() + "] \t [" +  loggingLevel + "] \t ";
        if (myFile.length()+message.length() <= MAX_LENGTH){
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(myFile, true);
                byte[] textBytes = ("[" + new Date() + "] \t [" +  loggingLevel + "] \t " + message + "\n").getBytes();
                fileOutputStream.write(textBytes);
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Помилка запису в файл: " + e.getMessage());
            }
        } else {
            throw new FileMaxSizeReachedException("Максимальний розмір файлу - " + MAX_LENGTH +
                    "\t|\tпоточній розмір файлу - " + message.length() +
                    "\t|\t розташування файлу - " + myFile.getAbsoluteFile());
        }
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }
}

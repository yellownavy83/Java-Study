package basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExternalProgram {

    public static void main(String[] args) {

        sample1();

        sample2();


    }

    public static void sample2() {

        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "ping", "-t", "127.0.0.1");
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while( (line = br.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sample1() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder();

            processBuilder.command("cmd.exe", "./", "exe11.BAT");

            processBuilder.directory(new File("./"));

            Process process = processBuilder.start();

            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            while ( (line =  br.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

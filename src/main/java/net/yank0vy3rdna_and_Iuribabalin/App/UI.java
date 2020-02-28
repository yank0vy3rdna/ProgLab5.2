package net.yank0vy3rdna_and_Iuribabalin.App;
import java.util.Scanner;

/***
 * UI - class working with console
 */
public class UI {
    private Scanner in;
    public void setScanner(Scanner scanner){
        in = scanner;
    }
    public UI(){
        in = new Scanner(System.in);
    }

    /***
     * method for reading something from console
     * @param fieldName name of field what you want to read
     * @return readed line
     */
    public String readField(String fieldName){
        System.out.print("Введите значение поля "+fieldName+": ");
        return in.nextLine().toUpperCase();
    }

    /***
     * Method for reading line with command
     * @return line
     */
    public String getNextCommand(){
        System.out.print(">> ");
        return in.nextLine();
    }

    /***
     * Method for printing something to console
     * @param string what we want to print
     */
    public void print(String string){
        System.out.println(string);
    }

}

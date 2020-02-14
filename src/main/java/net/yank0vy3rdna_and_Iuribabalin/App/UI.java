package net.yank0vy3rdna_and_Iuribabalin.App;
import java.util.Scanner;

public class UI {
    private final Scanner in;

    public UI(){
        in = new Scanner(System.in);
    }
    public String readField(String fieldName){
        System.out.print("Введите значение поля "+fieldName+": ");
        return in.nextLine();
    }
    public String getNextCommand(){
        System.out.print(">> ");
        return in.nextLine();
    }
    public void print(String string){
        System.out.println(string);
    }

}

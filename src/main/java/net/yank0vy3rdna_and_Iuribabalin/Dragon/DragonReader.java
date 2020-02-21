package net.yank0vy3rdna_and_Iuribabalin.Dragon;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.App.UI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DragonReader implements StoredTypeReader {
    private UI ui;

    public DragonReader(){ }

    @Override
    public void setUI(UI ui) {
        this.ui = ui;
    }
    public StoredType create(String id){

        String name = ui.readField("dragonname");
        double coordinatesx;
        while (true) {
            try {
                coordinatesx = Double.parseDouble(ui.readField("coordinates.x"));
                break;
            }catch (NumberFormatException ex){
                ui.print("Неверный формат числа");
            }
        }
        float coordinatesy;
        while (true) {
            try {
                coordinatesy = Float.parseFloat(ui.readField("coordinates.y"));
                break;
            }catch (NumberFormatException ex){
                ui.print("Неверный формат числа");
            }
        }

        Coordinates coordinates = new Coordinates(coordinatesx, coordinatesy);
        long age;
        while (true) {
            try {
                age = Long.parseLong(ui.readField("age"));
                if(age > 0)
                    break;
                else
                    ui.print("Значение "+ "age" +" должно быть больше 0");
            }catch (NumberFormatException ex){
                ui.print("Неверный формат числа");
            }
        }
        long weight;
        while (true) {
            try {
                weight = Long.parseLong(ui.readField("weight"));
                if(weight > 0)
                    break;
                else
                    ui.print("Значение "+ "weight" +" должно быть больше 0");
            }catch (NumberFormatException ex){
                ui.print("Неверный формат числа");
            }
        }

        DragonType dragonType;
        while (true) {
            try {
                dragonType = DragonType.valueOf(ui.readField("type:\n" + DragonType.AIR + "\n" + DragonType.FIRE + "\n" + DragonType.UNDERGROUND + "\n" + DragonType.WATER + "\n" + "type"));
                break;
            }catch (IllegalArgumentException ex){
                ui.print("Такого типа драконов нет");
            }
        }
        DragonCharacter dragonCharacter;
        while (true) {
            try{
                dragonCharacter = DragonCharacter.valueOf(ui.readField("character:\n" + DragonCharacter.CHAOTIC_EVIL + "\n" + DragonCharacter.CUNNING + "\n" + DragonCharacter.GOOD + "\n" + DragonCharacter.WISE + "\n" + "character"));
                break;
            }catch (IllegalArgumentException ex){
                ui.print("Такого character драконов нет");
            }
        }
        Person killer;
        String killername = ui.readField("killer.name");

        if (killername.isEmpty()){
            killer = null;
        }else {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Date birthday;
            Location location;
            while (true) {
                try {
                    String birthdaystr = ui.readField("birthday(format: dd-MM-yyyy)");

                    if (!birthdaystr.isEmpty()) {

                        birthday = format.parse(birthdaystr);

                    } else {
                        birthday = null;
                    }
                    break;
                } catch(ParseException e) {
                    ui.print("Неверный формат даты");
                }
            }
            long killerheight;
            while (true) {
                try {
                    killerheight = Long.parseLong(ui.readField("killer.height"));
                    if(killerheight > 0)
                        break;
                    else
                        ui.print("Значение "+ "killerheight" +" должно быть больше 0");
                }catch (NumberFormatException ex){
                    ui.print("Неверный формат числа");
                }
            }
            long killerweight;
            while (true) {
                try {
                    killerweight = Long.parseLong(ui.readField("killer.weight"));
                    if(killerweight > 0)
                        break;
                    else
                        ui.print("Значение "+ "weight" +" должно быть больше 0");
                }catch (NumberFormatException ex){
                    ui.print("Неверный формат числа");
                }
            }

            double locationxd = 0.;
            String locationx;
            while (true) {
                locationx = ui.readField("locationx");
                try {
                    if (locationx.isEmpty())
                        break;
                    locationxd = Double.parseDouble(locationx);
                    break;
                }catch (NumberFormatException ex){
                    ui.print("Неверный формат числа");
                }
            }
            if(locationx.isEmpty()){
                location=null;
            }else {

                float locationyd;
                while (true){
                    String locationy = ui.readField("locationy");
                    try {
                        locationyd = Float.parseFloat(locationy);
                        break;
                    }catch (NumberFormatException ex){
                        ui.print("Неверный формат числа");
                    }
                }
                long locationzd;
                while(true){
                    String locationz = ui.readField("locationz");
                    try {
                        locationzd = Long.parseLong(locationz);
                        break;
                    }catch (NumberFormatException ex){
                        ui.print("Неверный формат числа");
                    }
                }
                String locationname = ui.readField("locationname");
                location = new Location(locationxd, locationyd, locationzd, locationname);
            }

            killer = new Person( // Person(String name, Date birthday, long height, Long weight, Location location
                    killername,
                    birthday,
                    killerheight,
                    killerweight,
                    location);

        }
        Dragon dragon = new Dragon(name,coordinates,age,weight,dragonType,dragonCharacter,killer);
        if(!id.equals("null")){
            dragon.setId(Long.parseLong(id));
        }
        //Dragon(long id, String name, Coordinates coordinates, LocalDateTime creationDate, Long age, long weight, DragonType type, DragonCharacter character, Person killer)
        return dragon;
    }


}

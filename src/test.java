/*
 * Tahvli juurde
 * autor - Karl Karilaid
 * ülesanne 5.4c
 * */

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<String> opilased = new ArrayList<>();
        File fail = new File("C:\\Users\\karl\\IdeaProjects\\oop_alused\\src\\nimekiri.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        // loeme failist
        while (sisendFailist.hasNextLine()) {
            String rida = sisendFailist.nextLine();
            opilased.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        LocalDateTime tananeKuupaev = LocalDateTime.now();
        System.out.println("Tänane kuupäev ilma vorminduseta: " + tananeKuupaev);
        DateTimeFormatter kuupaevaVormindus = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM:ss");
        String tananeKuupaevVormindatud = tananeKuupaev.format(kuupaevaVormindus);
        System.out.println("Tänane vormindatud kuupäev " + tananeKuupaevVormindatud);
        int indeks = Integer.parseInt(tananeKuupaevVormindatud);
        System.out.println(opilased.get(indeks - 1));
    }
}
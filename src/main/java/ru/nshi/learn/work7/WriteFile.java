package ru.nshi.learn.work7;

import java.io.FileWriter;
import java.util.List;

public class WriteFile {

    public static void newFile(List<Car> cars_tabs, String fielNaem) throws Exception {
        FileWriter nFile = new FileWriter(fielNaem);

        for (Car carobj: cars_tabs
             ) {
            nFile.write(carobj.car_model + " ");
            nFile.write(carobj.car_maker + " ");
            nFile.write(carobj.car_model_year + " ");
            nFile.write(carobj.color + " \n");
        }
      /* for (int i = 0; i <= cars_tabs.size(); i++ ){
           nFile.write(car_model);
           nFile.write(car_maker);
           nFile.write(car_model_year);
           nFile.write(color);
       }*/

        nFile.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneManagement;

import ex2.Ex2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Classe de gestão do histórico
 * @author NERD-X
 */
public class PhoneHistoryManagement implements HistoryManagementInterface {

    List<PhoneHistory> records = new ArrayList<>();
    private static final String CSV_SEPARATOR = ",";

    /**
     * Metodo para ler o ficheiro
     * @param path
     * @return
     */
    public boolean readFile(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            //Skip first Line which has the titles of each column
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                PhoneHistory tmpObj = new PhoneHistory(Integer.parseInt(values[5]), values[6],
                        Integer.parseInt(values[0]),
                        Float.parseFloat(values[1].replace(",", ".")), Float.parseFloat(values[2].replace(",", ".")),
                        Float.parseFloat(values[3].replace(",", ".")), Float.parseFloat(values[4].replace(",", ".")));
                records.add(tmpObj);
            }
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    /**
     * Metodo para retornar a média de minutos gasto por número
     * @return
     */
    @Override
    public List<AverageMinutesPerNumber> calculateAverageMinutesPerNumber() {

        List<AverageMinutesPerNumber> avgList = new ArrayList<>();

        for (int i = 0; i < records.size(); i++) {
            PhoneHistory tmpHist = records.get(i);
            float avg = (tmpHist.getDaysMin() + tmpHist.getEveMins() + tmpHist.getNightMins() + tmpHist.getIntlMins()) / 4;
            AverageMinutesPerNumber tmpAvg = new AverageMinutesPerNumber(tmpHist.getNumber(), avg);
            avgList.add(tmpAvg);
        }

        return avgList;
    }

    /**
     * Metodo para retornar a média de minutos gasto por área
     * @param areaCode
     * @param outputFileName
     * @return
     */
    @Override
    public AverageMinutesPerArea calculateAverageMinutesPerArea(String areaCode, String outputFileName) {

        float avg = 0;
        int totalNumbers = 0;

        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getAreaCode() == Integer.parseInt(areaCode)) {
                avg = avg + records.get(i).getDaysMin() + records.get(i).getEveMins()
                        + records.get(i).getIntlMins() + records.get(i).getNightMins();
                totalNumbers += 1;
            }
        }

        avg = avg / totalNumbers;

        AverageMinutesPerArea avgPerArea = new AverageMinutesPerArea(Integer.parseInt(areaCode), avg);

        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFileName), "UTF-8"));
            StringBuffer oneLine = new StringBuffer();
            oneLine.append(avgPerArea.getAreaCode() <= 0 ? "" : avgPerArea.getAreaCode());
            oneLine.append(CSV_SEPARATOR);
            oneLine.append(avgPerArea.getAverage() < 0 ? "" : avgPerArea.getAverage());
            bw.write(oneLine.toString());
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PhoneHistoryManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PhoneHistoryManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PhoneHistoryManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

        return avgPerArea;
    }

}

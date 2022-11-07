package de.unitrier.st.core;

//import de.unitrier.st.ui.Ui;

public class Main {

    public static void main(String[] args) {
        System.out.println("hallo ich gehe");
        DataLoader dataLoader = new DataLoader();
        DataParser dataParser = new DataParser();
        String json = dataLoader.loadJsonFile("countries-aggregated_json.json");
        //String json = dataLoader.loadJsonFile("datapackage.json");
        dataParser.parseJsonData(json);
    }
}

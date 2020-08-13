public class finalGarden {

    Garden inputtedGarden = new Garden();
    String[][] gardenGrid = new String[][]{};

//    public finalGarden(Garden garden){
//
//    }


    public void setGardenGrid(String[][] gardenGrid) {
        this.gardenGrid = gardenGrid;
    }

    public Garden getInputtedGarden() {
        return inputtedGarden;
    }

    public static String placePlants(){
        String returnString = ".";
        return returnString;
    }

    public static String wrapBox(){
        String returnString = "";
        return returnString;
    }
}

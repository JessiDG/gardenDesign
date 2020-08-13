public class finalGarden {

    Garden inputtedGarden = new Garden();
    Plant[] inputtedPlants = inputtedGarden.plants;
    Plant[] finalPlantList = new Plant[]{};
    String[][] gardenGrid = new String[inputtedGarden.length][inputtedGarden.width];

//    public finalGarden(Garden garden){
//
//    }


    public void setGardenGrid(String[][] gardenGrid) {
        this.gardenGrid = gardenGrid;
    }

    public Garden getInputtedGarden() {
        return inputtedGarden;
    }

    public Plant[] honedDownGarden(){
        int numFinalPlants = 0;
        //Make a new garden only of the plants that fit the requirements
        for(int i = 0; i< this.inputtedPlants.length; i++){
            Plant currentPlant = this.inputtedPlants[i];
            if(currentPlant.sun == inputtedGarden.sun || currentPlant.sun == inputtedGarden.shade || currentPlant.sun == inputtedGarden.partShade){
                for(int j = 0; j < inputtedGarden.colors.length; j++){
                    if (currentPlant.flowerColor == inputtedGarden.colors[j]){
                        finalPlantList[numFinalPlants] = currentPlant;
                        numFinalPlants ++;
                    }
                }
            }

        }
        return finalPlantList;
    }

//    public Plant[] sortPlantsByHeight(){
//        Plant[] sortedPlants = new Plant[this.finalPlantList.length];
//    }



    public static String placePlants(){

        String returnString = ".";
        return returnString;
    }

    public static String wrapBox(){
        String returnString = "";
        return returnString;
    }
}

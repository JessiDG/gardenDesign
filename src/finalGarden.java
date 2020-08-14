public class finalGarden {

    Garden inputtedGarden = new Garden();
    Plant[] inputtedPlants = inputtedGarden.plants;
    Plant[] finalPlantList = new Plant[]{};
    String[][] gardenGrid = new String[inputtedGarden.length][inputtedGarden.width];
    Plant[] trees = new Plant[]{};
    Plant[] shrubs = new Plant[]{};
    Plant[] subshrubs = new Plant[]{};
    Plant[] flowers = new Plant[]{};
    Plant[] grasses = new Plant[]{};
    Plant[] other = new Plant[]{};

//    public finalGarden(Garden garden){
//
//    }

    public void setTrees(Plant[] trees) {
        this.trees = trees;
    }

    public void setShrubs(Plant[] shrubs) {
        this.shrubs = shrubs;
    }

    public void setSubshrubs(Plant[] subshrubs) {
        this.subshrubs = subshrubs;
    }

    public void setOther(Plant[] other) {
        this.other = other;
    }

    public void setGrasses(Plant[] grasses) {
        this.grasses = grasses;
    }

    public void setFlowers(Plant[] flowers) {
        this.flowers = flowers;
    }

    public void setFinalPlantList(Plant[] finalPlantList) {
        this.finalPlantList = finalPlantList;
    }

    public void setInputtedGarden(Garden inputtedGarden) {
        this.inputtedGarden = inputtedGarden;
    }

    public void setInputtedPlants(Plant[] inputtedPlants) {
        this.inputtedPlants = inputtedPlants;
    }

    public void setGardenGrid(String[][] gardenGrid) {
        this.gardenGrid = gardenGrid;
    }

    public Plant[] getFinalPlantList() {
        return finalPlantList;
    }

    public Plant[] getFlowers() {
        return flowers;
    }

    public Plant[] getGrasses() {
        return grasses;
    }

    public Plant[] getInputtedPlants() {
        return inputtedPlants;
    }

    public Plant[] getOther() {
        return other;
    }

    public Plant[] getShrubs() {
        return shrubs;
    }

    public Plant[] getSubshrubs() {
        return subshrubs;
    }

    public Plant[] getTrees() {
        return trees;
    }

    public String[][] getGardenGrid() {
        return gardenGrid;
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

    //this is now being handled in the initial list creation
//    public Plant[] sortPlantsByHeight(){
//        Plant[] sortedPlants = new Plant[this.finalPlantList.length];
//    }



    public String placePlants() {

        for (int i = 0; i < this.inputtedGarden.length; i++) {
            for (int j = 0; j < this.inputtedPlants.length; j++) {
            }
            String returnString = ".";
            return returnString;
        }
    }

    public static String wrapBox(){
        String returnString = "";
        return returnString;
    }
}

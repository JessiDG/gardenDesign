public class hardScaping {

    nonPlant rock = new nonPlant();
    nonPlant[] rocks = new nonPlant[]{};
    nonPlant fountain = new nonPlant();
    nonPlant[] fountains = new nonPlant[]{};
    nonPlant bench = new nonPlant();
    nonPlant[] benches = new nonPlant[]{};

    public void setBench(nonPlant bench) {
        this.bench = bench;
    }

    public void setBenches(nonPlant[] benches) {
        this.benches = benches;
    }

    public void setFountain(nonPlant fountain) {
        this.fountain = fountain;
    }

    public void setFountains(nonPlant[] fountains) {
        this.fountains = fountains;
    }

    public void setRock(nonPlant rock) {
        this.rock = rock;
    }

    public void setRocks(nonPlant[] rocks) {
        this.rocks = rocks;
    }

    public nonPlant getBench() {
        return bench;
    }

    public nonPlant getFountain() {
        return fountain;
    }

    public nonPlant getRock() {
        return rock;
    }

    public nonPlant[] getBenches() {
        return benches;
    }

    public nonPlant[] getFountains() {
        return fountains;
    }

    public nonPlant[] getRocks() {
        return rocks;
    }
}

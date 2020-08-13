public class Garden {

    int width = 0;
    int length = 0;
    String color0 = "";
    String color1 = "";
    String color2 = "";
    String color3 = "";
    String color4 = "";
    String color5 = "";
    String color6 = "";
    String shade = "Full Shade";
    String sun = "Full Sun";
    String partShade = "Part Shade";
    String[] colors = new String[]{};
    Plant[] plants = new Plant[]{};

    public void garden(int width, int length, String[] colors, String shade, String sun, String partShade){
        setColors(color0, color1, color2,color3,color4,color5, color6);
        setLength(length);
        setWidth(width);
        setShade(shade);
        setPartShade(partShade);
        setSun(sun);
    }

    public void setPlants(Plant[] plants) {
        this.plants = plants;
    }

    public void setSun(String sun) {
        this.sun = sun;
    }

    public void setPartShade(String partShade) {
        this.partShade = partShade;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String[] setColors(String color0, String color1, String color2, String color3, String color4, String color5, String color6){
        setColor0(color0);
        setColor1(color1);
        setColor2(color2);
        setColor3(color3);
        setColor4(color4);
        setColor5(color5);
        setColor6(color6);
        this.colors = new String[]{getColor0(), getColor1(), getColor2(), getColor3(), getColor4(), getColor5(), getColor6()};
        return this.colors;
    }

    public void setColor0(String color0) {
        this.color0 = color0;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public void setColor3(String color3) {
        this.color3 = color3;
    }

    public void setColor4(String color4) {
        this.color4 = color4;
    }

    public void setColor5(String color5) {
        this.color5 = color5;
    }

    public void setColor6(String color6) {
        this.color6 = color6;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor0() {
        return color0;
    }

    public String getColor1() {
        return color1;
    }

    public String getColor2() {
        return color2;
    }

    public String getColor3() {
        return color3;
    }

    public String getColor4() {
        return color4;
    }

    public String getColor5() {
        return color5;
    }

    public String getColor6() {
        return color6;
    }

    public Plant[] getPlants() {
        return plants;
    }
}
//218

public class nonPlant {

    int width = 0;
    int depth = 0;
    int height = 0;
    String name = "";
    int weight = 0;
    String color = "";

    public void setHeight(int height) {
        if(height >= 0)
            this.height = height;
        else{
            throw new IllegalArgumentException("height must be >=0");
        }
    }

    public void setWidth(int width) {
        if(width >= 0)
            this.width = width;
        else{
            throw new IllegalArgumentException("width must be >=0");
        }
    }

    public void setDepth(int depth) {
        if(depth >= 0)
            this.depth = depth;
        else{
            throw new IllegalArgumentException("depth must be >=0");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if(weight >= 0)
            this.weight = weight;
        else{
            throw new IllegalArgumentException("weight must be >=0");
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}

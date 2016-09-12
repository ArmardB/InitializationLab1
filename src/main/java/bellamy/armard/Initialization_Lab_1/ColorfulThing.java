package bellamy.armard.Initialization_Lab_1;

/**
 * Created by armardbellamy on 9/9/16.
 */
public class ColorfulThing {

    enum ColorTree {GREEN, YELLOW, RED, BLUE, GREY};


    private ColorTree color;

    public ColorfulThing(ColorTree color){
        this.color = color;
    }

    public ColorTree getColor(){
        return this.color;
    }

}

package bellamy.armard.Initialization_Lab_1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/10/16.
 */
public class ColorfulThingTest {
    ColorfulThing colorfulThing;

    @Before
    public void initialize(){
        colorfulThing = new ColorfulThing(ColorfulThing.ColorTree.BLUE);
    }

    @Test
    public void getColorTest(){
        ColorfulThing.ColorTree expectedColor = ColorfulThing.ColorTree.BLUE;
        Assert.assertEquals("Method will return the color the object was initialized to", expectedColor, colorfulThing.getColor());

    }

}

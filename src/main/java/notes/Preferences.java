package notes;

import java.awt.*;

public class Preferences {

    public final static int AREA_COLUMNS = 60;
    public final static int AREA_ROWS = 25;
    public final static Color BACKGROUND_COLOR = new Color( 178,192, 190);
    public final static Color FONT_COLOR = new Color(255-178, 255-192, 255-190);
    public final static Font FONT = new Font(Font.MONOSPACED, Font.PLAIN, 12);
    /*
        Button, which located on the ToolBar panel preferences
     */
    public static final Dimension BUTTON_SIZE
            = new Dimension(45, 45);
    public static final Color BUTTON_COLOR
            = new Color(175, 224, 240);
    public static int TYPE;
}

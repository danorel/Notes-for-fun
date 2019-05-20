package notes.components.toolbar;

import java.awt.*;

class ToolbarConstants {
    static final String CURRENT_TOOL_PATH =
            "resources/text.png";
    static final String BOLD_TOOL_PATH =
            "resources/bold.png";
    static final String ITALIC_TOOL_PATH =
            "resources/italic.png";
    static final String UNDERLINE_TOOL_PATH =
            "resources/underline.png";
    static final String FONT_TOOL_PATH =
            "resources/font.png";
    static final String INDENT_TOOL_PATH =
            "resources/indent.png";
    static final String LIST_DIGITS_TOOL_PATH =
            "resources/list-digits.png";
    static final String LIST_LETTERS_TOOL_PATH =
            "resources/list-letters.png";
    static final String PRINT_TOOL_PATH =
            "resources/print.png";
    /*
        Fonts preferences
     */
    public static final int FONT_SIZE = 12;
    public static final Color FONT_COLOR = new Color(255-178, 255-192, 255-190);
    static final Font BOLD =
            new Font(Font.MONOSPACED, Font.BOLD, FONT_SIZE);
    static final Font ITALIC =
            new Font(Font.MONOSPACED, Font.ITALIC, FONT_SIZE);

}

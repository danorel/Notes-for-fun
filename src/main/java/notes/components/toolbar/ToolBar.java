package notes.components.toolbar;

import notes.Preferences;
import notes.components.view.ViewArea;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

public class ToolBar extends JPanel {

    private JButton
            current, bold, italic, underline, font, indent, listDigits, listLetters, print;

    public ToolBar() {
        super();
        this.setBackground(new Color(217, 236, 238));
    }

    public ToolBar generate(){
        return this;
    }

    public ToolBar createToolButtons(){
        defineCurrentTool();
        defineBoldTool();
        defineItalicTool();
        defineUnderlineTool();
        defineFontTool();
        defineIndentTool();
        defineListDigitsTool();
        defineListLettersTool();
        definePrintTool();
        return this;
    }

    public ToolBar activateToolButtons(ViewArea viewArea){
        bold.addActionListener(event -> {
            SimpleAttributeSet attrSet= new SimpleAttributeSet();
            StyleConstants.setFontFamily(attrSet, "Courier New Italic");
            StyleConstants.setForeground(attrSet, Color.BLUE);

            try {
                viewArea.getDocument().insertString(viewArea.getWidth(), viewArea.getText(), attrSet);
            } catch (BadLocationException exception) {
                exception.printStackTrace();
            }
            viewArea.setFont(ToolbarConstants.BOLD);
        });
        italic.addActionListener(event -> viewArea.setFont(ToolbarConstants.ITALIC));
        underline.addActionListener(event -> {
            Map<TextAttribute, Integer> fontAttributes = new HashMap<>();
            fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            viewArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, ToolbarConstants.FONT_SIZE).deriveFont(fontAttributes));
        });
        return this;
    }

    private void defineCurrentTool(){
        // Tool bar items
        current = new JButton(
                new ImageIcon(ToolbarConstants.CURRENT_TOOL_PATH));
        current.setBackground(Preferences.BUTTON_COLOR);
        current.setPreferredSize(Preferences.BUTTON_SIZE);
        this.add(current);
        current.addActionListener(event -> Preferences.TYPE = 0);
    }

    private void defineBoldTool(){
        bold = new JButton(
                new ImageIcon(ToolbarConstants.BOLD_TOOL_PATH));
        bold.setBackground(Preferences.BUTTON_COLOR);
        bold.setPreferredSize(Preferences.BUTTON_SIZE);
        this.add(bold);
        bold.addActionListener(event -> Preferences.TYPE = 1);
    }

    private void defineItalicTool(){
        italic = new JButton(
                new ImageIcon(ToolbarConstants.ITALIC_TOOL_PATH));
        italic.setBackground(Preferences.BUTTON_COLOR);
        italic.setPreferredSize(Preferences.BUTTON_SIZE);
        this.add(italic);
        italic.addActionListener(event -> Preferences.TYPE = 2);
    }

    private void defineUnderlineTool(){
        underline = new JButton(
                new ImageIcon(ToolbarConstants.UNDERLINE_TOOL_PATH));
        underline.setBackground(Preferences.BUTTON_COLOR);
        underline.setPreferredSize(Preferences.BUTTON_SIZE);
        this.add(underline);
        underline.addActionListener(event -> Preferences.TYPE = 3);
    }

    private void defineFontTool(){
        font = new JButton(
                new ImageIcon(ToolbarConstants.FONT_TOOL_PATH));
        font.setBackground(Preferences.BUTTON_COLOR);
        font.setPreferredSize(Preferences.BUTTON_SIZE);
        this.add(font);
        font.addActionListener(event -> Preferences.TYPE = 4);
    }

    private void defineIndentTool(){
        indent = new JButton(
                new ImageIcon(ToolbarConstants.INDENT_TOOL_PATH));
        indent.setBackground(Preferences.BUTTON_COLOR);
        indent.setPreferredSize(Preferences.BUTTON_SIZE);
        this.add(indent);
        indent.addActionListener(event -> Preferences.TYPE = 5);
    }

    private void defineListDigitsTool(){
        listDigits = new JButton(
                new ImageIcon(ToolbarConstants.LIST_DIGITS_TOOL_PATH));
        listDigits.setBackground(Preferences.BUTTON_COLOR);
        listDigits.setPreferredSize(Preferences.BUTTON_SIZE);
        this.add(listDigits);
        listDigits.addActionListener(event -> Preferences.TYPE = 6);
    }

    private void defineListLettersTool(){
        listLetters = new JButton(
                new ImageIcon(ToolbarConstants.LIST_LETTERS_TOOL_PATH));
        listLetters.setBackground(Preferences.BUTTON_COLOR);
        listLetters.setPreferredSize(Preferences.BUTTON_SIZE);
        this.add(listLetters);
        listLetters.addActionListener(event -> Preferences.TYPE = 7);
    }

    private void definePrintTool(){
        print = new JButton(
                new ImageIcon(ToolbarConstants.PRINT_TOOL_PATH));
        print.setBackground(Preferences.BUTTON_COLOR);
        print.setPreferredSize(Preferences.BUTTON_SIZE);
        this.add(print);
        print.addActionListener(event -> Preferences.TYPE = 8);
    }
}

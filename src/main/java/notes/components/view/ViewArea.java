package notes.components.view;

import notes.Preferences;

import javax.swing.*;

public class ViewArea extends JTextArea {

    public ViewArea(){
        super();
        this.setName("Note");
        this.setColumns(Preferences.AREA_COLUMNS);
        this.setRows(Preferences.AREA_ROWS);
    }

    public ViewArea(String title){
        super();
        this.setName(title);
        this.setColumns(Preferences.AREA_COLUMNS);
        this.setRows(Preferences.AREA_ROWS);
    }

    public void generate(){
        this.setBackground(Preferences.BACKGROUND_COLOR);
        this.setFont(Preferences.FONT);
        this.setForeground(Preferences.FONT_COLOR);
    }
}

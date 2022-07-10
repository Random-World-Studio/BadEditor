package org.rws.ui.editor;

import org.rws.global.ui.EdTheme;
import org.rws.global.ui.WindData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class LineNum extends JPanel implements ComponentListener {

    private int num;

    public LineNum(int n) {
        super();
        setLayout(null);
        addComponentListener(this);
        num = n;
        setBackground(EdTheme.LN_BAR);
        setSize(EdTheme.DEFAULT_LN_BAR_WID, WindData.DEFAULT_SIZE.height);
    }

    public void setNum(int n) {
        num = n;
    }

    public int getNum() {
        return num;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        setSize(EdTheme.DEFAULT_LN_BAR_WID, getHeight());
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {

    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {

    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {

    }
}

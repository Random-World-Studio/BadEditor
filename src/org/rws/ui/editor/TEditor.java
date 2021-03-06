package org.rws.ui.editor;

import org.rws.global.ui.EdTheme;

import javax.swing.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.*;

public class TEditor extends JPanel implements ComponentListener {

    LineNum ln;

    public TEditor(File file) throws IOException {
        super();
        setLayout(null);
        addComponentListener(this);
        LineNumberReader lnr = new LineNumberReader(new FileReader(file));
        ln = new LineNum(lnr.getLineNumber());
        lnr.close();
        ln.setLocation(0, 0);
        setBackground(EdTheme.BACKGROUND);
        add(ln);
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        ln.setSize(ln.getWidth(), getHeight());
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

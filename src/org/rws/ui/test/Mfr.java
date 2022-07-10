package org.rws.ui.test;

import org.rws.global.ui.WindData;
import org.rws.ui.editor.TEditor;

import javax.swing.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.io.IOException;

public class Mfr extends JFrame implements ComponentListener {

    TEditor te;
    public Mfr() throws IOException {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WindData.DEFAULT_SIZE);
        setLayout(null);
        te = new TEditor(new File("./testfile.txt"));
        getContentPane().add(te);
        te.setSize(WindData.DEFAULT_SIZE);
        te.setLocation(0, 0);
        addComponentListener(this);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new Mfr();
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        te.setSize(getSize());
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

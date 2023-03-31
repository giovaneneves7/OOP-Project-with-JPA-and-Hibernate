package com.github.nekoyasha7.oopregistrationproject.view.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.Set;
import java.util.TreeSet;

public class CustomCellRenderer extends DefaultTableCellRenderer {

    private final Color customColor = Color.white;
    private final Set<Integer> coloredColumns = new TreeSet<Integer>() {{ add(0); add(1); add(2); add(3); add(4);}};

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        Component component =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if(coloredColumns.contains(column)){

            component.setBackground(customColor);
            component.setForeground(Color.black);

        }
        return component;
    }
}

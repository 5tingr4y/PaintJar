/*------------------------------------------------------------------------
 * PaintJar - Java based modular image editing program
 * Copyright (C) 2016  Raymond "5tingr4y" Kampmann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
------------------------------------------------------------------------*/

package net._5tingr4y.paintcan;

import java.awt.Toolkit;
import java.util.Properties;

public class PaintJar {

    private static Controller controller;

    public static void main(String[] args) {
        //TODO: read config(s)
        Properties settings = new Properties();

        // if I miss half a pixel here or so, it doesn't matter
        int screenWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int screenHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();

        settings.setProperty("mainwindow_posX", Integer.toString(screenWidth / 4));
        settings.setProperty("mainwindow_posY", Integer.toString(screenHeight / 8));
        settings.setProperty("mainwindow_width", Integer.toString(screenWidth / 2));
        settings.setProperty("mainwindow_height", Integer.toString(screenHeight * 3 / 4));

        controller = new Controller(settings);

        controller.init();
        controller.start();
    }

    public static Controller getController() {
        return controller;
    }
}

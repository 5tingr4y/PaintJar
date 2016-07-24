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

import java.util.Properties;

public class PaintJar {

    private static Controller controller;

    public static void main(String[] args) {
        //TODO: read config(s)
        Properties settings = new Properties();

        //TODO: center window
        settings.setProperty("mainwindow_posX", "100");
        settings.setProperty("mainwindow_posY", "100");
        settings.setProperty("mainwindow_width", "800");
        settings.setProperty("mainwindow_height", "600");

        controller = new Controller(settings);

        controller.init();
        controller.start();
    }

    public static Controller getController() {
        return controller;
    }
}

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

import net._5tingr4y.paintcan.ui.MainWindow;

import java.util.Properties;

public class Controller {

    public final Properties settings;

    private MainWindow mainWindow;

    Controller(Properties settings_) {
        if(settings_ == null)
            throw new IllegalArgumentException("Controller Settings must not be null");

        settings = settings_;
    }

    void init() {
        //TODO: init plugins / prepare window creation


        mainWindow = new MainWindow(Integer.parseInt(settings.getProperty("mainwindow_posX")),
                Integer.parseInt(settings.getProperty("mainwindow_posY")),
                Integer.parseInt(settings.getProperty("mainwindow_width")),
                Integer.parseInt(settings.getProperty("mainwindow_height")));
    }

    void start() {
        //TODO: create windows

        mainWindow.createFrame();
    }
}

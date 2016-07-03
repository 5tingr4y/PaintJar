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

import net._5tingr4y.paintcan.data.InitializationData;
import net._5tingr4y.paintcan.ui.MainWindow;

public class Controller {

    private MainWindow mainWindow;

    private Controller() {}

    void init(InitializationData data) {
        //TODO: init plugins / prepare window creation

        mainWindow = new MainWindow(data.width, data.height, data.posX, data.posY);
    }

    void start() {
        //TODO: create windows

        mainWindow.createFrame();
    }

    //statics
    private static Controller instance = new Controller();

    public static Controller get() {
        return instance;
    }
}

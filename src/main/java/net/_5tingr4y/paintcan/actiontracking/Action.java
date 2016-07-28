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

package net._5tingr4y.paintcan.actiontracking;

public class Action {

    public final String name;

    public final int offsetX;
    public final int offsetY;

    public final int width;
    public final int height;

    public final PixelChangeData[][] data;

    public Action(String name_, PixelChangeData[][] data_) {
        this(name_, 0, 0, data_);
    }

    public Action(String name_, int offsetX_, int offsetY_, PixelChangeData[][] data_) {
        name = name_;

        data = data_;

        offsetX = offsetX_;
        offsetY = offsetY_;

        width = data.length;
        height = data[0].length;
    }
}

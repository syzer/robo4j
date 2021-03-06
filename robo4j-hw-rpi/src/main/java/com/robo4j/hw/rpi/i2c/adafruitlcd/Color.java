/*
 * Copyright (C) 2014-2017. Miroslav Wengner, Marcus Hirt
 * This Color.java  is part of robo4j.
 * module: robo4j-hw-rpi
 *
 * robo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * robo4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with robo4j .  If not, see <http://www.gnu.org/licenses/>.
 */
package com.robo4j.hw.rpi.i2c.adafruitlcd;

/**
 * The various colors that can be used if you have one of the multi-colored variants.
 * 
 * @author Marcus Hirt (@hirt)
 * @author Miro Wengner (@miragemiko)
 * @since 01.11.2016
 */
public enum Color {
	OFF(0x00), RED(0x01), GREEN(0x02), BLUE(0x04), YELLOW(RED.getValue()
			+ GREEN.getValue()), TEAL(GREEN.getValue() + BLUE.getValue()), VIOLET(
			RED.getValue() + BLUE.getValue()), WHITE(RED.getValue()
			+ GREEN.getValue() + BLUE.getValue()), ON(WHITE.getValue());

	private final int value;

	Color(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	/**
	 * Returns the matching color value, or WHITE if no matching color could be found.
	 * 
	 * @param colorValue
	 * @return
	 */
	public static Color getByValue(int colorValue) {
		for (Color c : values()) {
			if (c.getValue() == colorValue) {
				return c;
			}
		}
		return WHITE;
	}
	
	public static Color getByName(String name) {
		return valueOf(name);
	}
}
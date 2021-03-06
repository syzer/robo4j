/*
 * Copyright (C)  2016. Miroslav Wengner, Marcus Hirt
 * This LegoAnalogPortEnum.java  is part of robo4j.
 *
 *  robo4j is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  robo4j is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with robo4j .  If not, see <http://www.gnu.org/licenses/>.
 */

package com.robo4j.lego.enums;

import com.robo4j.core.enums.RoboHardwareEnumI;

/**
 *
 * @author Miroslav Wengner (@miragemiko)
 * @since 04.05.2016
 */
public enum LegoAnalogPortEnum implements RoboHardwareEnumI<String> {

	// @formatter:off
	A		("A", "Analog A"),
	B		("B", "Analog B"),
	C		("C", "Analog C"),
	D		("D", "Analog D"),
	;
	// @formatter:on

	private String type;
	private String name;

	LegoAnalogPortEnum(String type, String name) {
		this.type = type;
		this.name = name;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "LegoAnalogPortEnum{" + "type='" + type + '\'' + ", name='" + name + '\'' + '}';
	}
}

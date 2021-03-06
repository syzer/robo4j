/*
 * Copyright (C) 2014, 2017. Miroslav Wengner, Marcus Hirt
 * This SensorTestWrapper.java  is part of robo4j.
 * module: robo4j-units-lego-test
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

package com.robo4j.hw.lego.wrapper;

import com.robo4j.hw.lego.ILegoSensor;
import com.robo4j.hw.lego.enums.DigitalPortEnum;
import com.robo4j.hw.lego.enums.SensorTypeEnum;

/**
 * Simple LegoMindstorm Mock Sensor
 *
 * @author Marcus Hirt (@hirt)
 * @author Miro Wengner (@miragemiko)
 * @since 29.01.2017
 */
public class SensorTestWrapper implements ILegoSensor {

	private final DigitalPortEnum port;
	private final SensorTypeEnum type;

	public SensorTestWrapper(DigitalPortEnum port, SensorTypeEnum type) {
		this.port = port;
		this.type = type;
	}

	@Override
	public DigitalPortEnum getPort() {
		return port;
	}

	@Override
	public SensorTypeEnum getType() {
		return type;
	}

	@Override
	public String toString() {
		return "SensorTestWrapper{" + "port=" + port + ", type=" + type + '}';
	}


}

/*
 * Copyright (C)  2016. Miroslav Kopecky
 * This HttpMessageService.java  is part of robo4j.
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

package com.robo4j.brick.service;

import com.robo4j.commons.control.RoboSystemConfig;
import com.robo4j.commons.service.GenericService;

import java.util.Map;

/**
 *
 *
 * @author Miro Kopecky (@miragemiko)
 * @since 28.11.2016
 */
public interface HttpMessageService extends GenericService {

    String messageByRoboSystemConfig(Map.Entry<String, RoboSystemConfig> entry);

    String createTable(String data);
}
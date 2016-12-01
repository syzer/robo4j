/*
 * Copyright (C)  2016. Miroslav Kopecky
 * This ClientCommandRequestDTO.java  is part of robo4j.
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

package com.robo4j.brick.dto;

import com.robo4j.brick.client.enums.RequestCommandEnum;
import com.robo4j.brick.util.ConstantUtil;

/**
 *
 * Client Request Holder for incoming requests
 * Single instance
 *
 * @author Miro Kopecky (@miragemiko)
 * @since 11.06.2016
 */
public class ClientCommandRequestDTO implements ClientCommandDTO{

    private Long stamp;
    private RequestCommandEnum type;
    private String value;
    private String speed;


    public ClientCommandRequestDTO(String value){
        this.stamp = System.currentTimeMillis();
        final String[] values = value.split(ConstantUtil.getHttpSeparator(3));
        this.type = RequestCommandEnum.getRequestValue(values[ConstantUtil.DEFAULT_VALUE]);
        this.value = values[1];
        this.speed = "300";
    }

    public ClientCommandRequestDTO(RequestCommandEnum type){
        this.stamp = System.currentTimeMillis();
        this.type = type;
        this.value = "";
        this.speed = "200";
    }

    public ClientCommandRequestDTO(RequestCommandEnum type, String value) {
        this.stamp = System.currentTimeMillis();
        this.type = type;
        this.value = value;
        this.speed = "200";
    }

    public ClientCommandRequestDTO(RequestCommandEnum type, String value, String speed) {
        this.stamp = System.currentTimeMillis();
        this.type = type;
        this.value = value;
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public Long getStamp() {
        return stamp;
    }

    @Override
    public RequestCommandEnum getType() {
        return type;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ClientCommandRequestDTO{" +
                "stamp=" + stamp +
                ", type=" + type +
                ", value='" + value + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
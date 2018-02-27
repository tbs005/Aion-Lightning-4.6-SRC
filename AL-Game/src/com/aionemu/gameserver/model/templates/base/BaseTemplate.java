/**
 * This file is part of Aion-Lightning <aion-lightning.org>.
 *
 *  Aion-Lightning is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Aion-Lightning is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details. *
 *  You should have received a copy of the GNU General Public License
 *  along with Aion-Lightning.
 *  If not, see <http://www.gnu.org/licenses/>.
 */


package com.aionemu.gameserver.model.templates.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Source
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Base")
public class BaseTemplate {

    @XmlAttribute(name = "id")
    protected int id;
    @XmlAttribute(name = "world")
    protected int world;
    @XmlAttribute(name = "name_id")
    protected int nameId;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * @return the location id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return the world id
     */
    public int getWorldId() {
        return this.world;
    }

    /**
     * @return the location name id
     */
    public int getNameId() {
        return this.nameId;
    }

    /**
     * @return the location name
     */
    public String getName() {
        return this.name;
    }
}
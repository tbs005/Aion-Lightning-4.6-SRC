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


package com.aionemu.gameserver.services.ecfunctions.tvt;

import com.aionemu.gameserver.model.gameobjects.Npc;

public class TvtBossTemplate {

    private int reward;
    private int vote;
    private boolean removeCd;
    private int ap;
    private boolean boost;
    private Npc boss;

    public TvtBossTemplate(int reward, int vote, boolean removeCd, int ap, boolean boost, Npc boss) {
        this.removeCd = removeCd;
        this.reward = reward;
        this.vote = vote;
        this.ap = ap;
        this.boost = boost;
        this.boss = boss;
    }

    public int getReward() {
        return reward;
    }

    public boolean getRemoveCd() {
        return removeCd;
    }

    public int getAp() {
        return ap;
    }

    public boolean getBoost() {
        return boost;
    }

    public int getVote() {
        return vote;
    }

    public Npc getBoss() {
        return boss;
    }
}

/**
 * -------------------------------------------------------------------------------
 * This file is part of IngeniousThings Sigfox-Api.
 *
 * IngeniousThings Sigfox-Api is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * IngeniousThings Sigfox-Api is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 * -------------------------------------------------------------------------------
 * Author : Paul Pinault aka disk91
 * See https://www.disk91.com
 * ----
 * More information about IngeniousThings : https://www.ingeniousthings.fr
 * ----
 * Commercial license of this software can be obtained contacting ingeniousthings
 * -------------------------------------------------------------------------------
 */
package fr.ingeniousthings.sigfox.api.elements;

import io.swagger.annotations.ApiModelProperty;

public class SigfoxApiDeviceTokenRenewalInput {

    @ApiModelProperty(
            notes = "List of devicesId you want to prevent token renewal, empty if none",
            required = true
    )
    protected String [] forbidden;

    @ApiModelProperty(
            notes = "List of devicesId you want token renewal, empty if none",
            required = true
    )
    protected String [] allowed;

    // ================================================
    // Getters & Setters
    // ================================================


    public String[] getForbidden() {
        return forbidden;
    }

    public void setForbidden(String[] forbidden) {
        this.forbidden = forbidden;
    }

    public String[] getAllowed() {
        return allowed;
    }

    public void setAllowed(String[] allowed) {
        this.allowed = allowed;
    }
}

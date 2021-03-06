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
package fr.ingeniousthings.sigfox.apiv2.models;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

@Api(tags = "UserRole", description = "Defines the rights of the user - returned by sigfox with details")
public class SigfoxApiv2UserRoleRead {

    @ApiModelProperty(
            notes = "The group identifier on which the user will have the permissions set",
            required = true
    )
    protected SigfoxApiv2GroupMinimal group;

    @ApiModelProperty(
            notes = "The profile identifier that will give some permissions to the user",
            required = true
    )
    protected SigfoxApiv2Profile profileId;

    // ============================================================
    // Generated Getters & Setters
    // ============================================================


    public SigfoxApiv2GroupMinimal getGroup() {
        return group;
    }

    public void setGroup(SigfoxApiv2GroupMinimal group) {
        this.group = group;
    }

    public SigfoxApiv2Profile getProfileId() {
        return profileId;
    }

    public void setProfileId(SigfoxApiv2Profile profileId) {
        this.profileId = profileId;
    }
}

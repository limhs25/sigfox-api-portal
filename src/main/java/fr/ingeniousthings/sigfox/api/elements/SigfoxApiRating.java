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

import java.util.List;

/**
 * Format :
 *
 * {
 *      "rating":{
 *      "id":"52a403dae4b026a9f3dbfde3",
 *      "contractId":"52c26ce69336aad2f2d0a43f",
 *      "fromTime":1388530800000,
 *      "toTime":1390172400000,
 *      "state":1,
 *      "tokensInUse":5764,
 *      "maxTokens":9000,
 *      "consumptionData":[
 *          {
 *              "quarterDate":1396303200000,
 *              "activationDays":71169,
 *              "sentMessages":2154451,
 *              "sentDownlinkMessages":3
 *          }
 *      ]
 *      }
 *  }
 *
 */

public class SigfoxApiRating {

    public class SigfoxApiRatingConsumptionData {
        @ApiModelProperty(
                notes = "The quarter end date",
                required = true
        )
        public long quarterDate;

        @ApiModelProperty(
                notes = "The number of activation per day",
                required = true
        )
        public int activationDays;

        @ApiModelProperty(
                notes = "The number of messages sent between the quarter start date and the toTime value",
                required = true
        )
        public int sentMessages;

        @ApiModelProperty(
                notes = "The number of downlink messages sent between the quarter start date and the toTime value",
                required = true
        )
        public int sentDownlinkMessages;
    }

    public class SigfoxApiRatingDetail {

        @ApiModelProperty(
                notes = "The rating’s identifier (if exists)",
                required = false
        )
        public String id;

        @ApiModelProperty(
                notes = "The BSS order’s identifier",
                required = true
        )
        public String conractId;

        @ApiModelProperty(
                notes = "The quarter start date",
                required = true
        )
        public long fromTime;

        @ApiModelProperty(
                notes = "The date parameter",
                required = true
        )
        public long toTime;

        @ApiModelProperty(
                notes = "The rating’s state (0: in progress, 1: final)",
                required = true
        )
        public int state;

        @ApiModelProperty(
                notes = "The number of tokens in use",
                required = true
        )
        public int tokenInUse;

        @ApiModelProperty(
                notes = "The number of tokens",
                required = true
        )
        public int maxTokens;

        @ApiModelProperty(
                notes = "Array of consomption per quarter",
                required = true
        )
        public List<SigfoxApiRatingConsumptionData> consumptionData;

    }

    @ApiModelProperty(
            notes = "BSS order’s rating ",
            required = true
    )
    protected SigfoxApiRatingDetail rating;

    // ==================================================================
    // Getters & Setters
    // ==================================================================


    public SigfoxApiRatingDetail getRating() {
        return rating;
    }

    public void setRating(SigfoxApiRatingDetail rating) {
        this.rating = rating;
    }
}

/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2013
 * Contact : sebastien.bordes@jrebirth.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jrebirth.core.resource.color;

import org.jrebirth.core.resource.color.ColorItemBase;
import org.jrebirth.core.resource.color.GrayColor;
import org.jrebirth.core.resource.color.HSBColor;
import org.jrebirth.core.resource.color.RGB01Color;
import org.jrebirth.core.resource.color.RGB255Color;
import org.jrebirth.core.resource.color.WebColor;

/**
 * The class <strong>TestColors</strong>.
 * 
 * @author Sébastien Bordes
 */
public interface TestColors {

    /**************************************************************************************/
    /** ___________________________________Web Colors.___________________________________ */
    /**************************************************************************************/

    /** The web color. */
    ColorItemBase TEST_COLOR_WEB_1 = ColorItemBase.build(new WebColor("0088D3"));

    /** The web color. */
    ColorItemBase TEST_COLOR_WEB_2 = ColorItemBase.build(new WebColor("0D88D3", 0.4));

    /** The web color. */
    ColorItemBase TEST_COLOR_WEB_3 = ColorItemBase.build(new WebColor("0087D3", 1.0));

    /**************************************************************************************/
    /** __________________________________Gray Colors.___________________________________ */
    /**************************************************************************************/

    /** The gray color. */
    ColorItemBase TEST_COLOR_GRAY_1 = ColorItemBase.build(new GrayColor(0.3));

    /** The gray color. */
    ColorItemBase TEST_COLOR_GRAY_2 = ColorItemBase.build(new GrayColor(0.74, 0.9));

    /** The gray color. */
    ColorItemBase TEST_COLOR_GRAY_3 = ColorItemBase.build(new GrayColor(0.5, 1.0));

    /**************************************************************************************/
    /** ___________________________________HSB Colors.___________________________________ */
    /**************************************************************************************/

    /** The hsb color. */
    ColorItemBase TEST_COLOR_HSB_1 = ColorItemBase.build(new HSBColor(96.0, 0.4, 0.9));

    /** The hsb color. */
    ColorItemBase TEST_COLOR_HSB_2 = ColorItemBase.build(new HSBColor(45.0, 0.3, 0.8, 0.45));

    /** The hsb color. */
    ColorItemBase TEST_COLOR_HSB_3 = ColorItemBase.build(new HSBColor(153.0, 0.6, 0.75, 1.0));

    /**************************************************************************************/
    /** _________________________________RGB 01 Colors.__________________________________ */
    /**************************************************************************************/

    /** The rgb 0-1 color. */
    ColorItemBase TEST_COLOR_RGB01_1 = ColorItemBase.build(new RGB01Color(0.22, 0.752, 0.78));

    /** The rgb 0-1 color. */
    ColorItemBase TEST_COLOR_RGB01_2 = ColorItemBase.build(new RGB01Color(0.78, 0.653, 0.85, 0.12));

    /** The rgb 0-1 color. */
    ColorItemBase TEST_COLOR_RGB01_3 = ColorItemBase.build(new RGB01Color(0.96, 0.851, 0.41, 1.0));

    /**************************************************************************************/
    /** ___________________________________RGB 255 Colors._______________________________ */
    /**************************************************************************************/

    /** The rgb 255 color. */
    ColorItemBase TEST_COLOR_RGB255_1 = ColorItemBase.build(new RGB255Color(107, 69, 251));

    /** The rgb 255 color. */
    ColorItemBase TEST_COLOR_RGB255_2 = ColorItemBase.build(new RGB255Color(255, 248, 189, 70 / 100));

    /** The rgb 255 color. */
    ColorItemBase TEST_COLOR_RGB255_3 = ColorItemBase.build(new RGB255Color(112, 60, 63, 1.0));
}

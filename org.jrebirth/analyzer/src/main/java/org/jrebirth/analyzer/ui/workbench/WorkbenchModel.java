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
package org.jrebirth.analyzer.ui.workbench;

import org.jrebirth.core.ui.AbstractModel;
import org.jrebirth.core.wave.Wave;

/**
 * The class <strong>WorkbenchModel</strong>.
 * 
 * @author Sébastien Bordes
 */
public final class WorkbenchModel extends AbstractModel<WorkbenchModel, WorkbenchView> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customInitialize() {
        // Nothing to do yet
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customInitializeInnerModels() {

        // Do stuff on the model !
        getInnerModel(WorkbenchInnerModels.CONTROLS);
        getInnerModel(WorkbenchInnerModels.PROPERTIES);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void processAction(final Wave wave) {
        // Nothing to do yet
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customShowView() {
        // Nothing to do yet

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customHideView() {
        // Nothing to do yet

    }

}

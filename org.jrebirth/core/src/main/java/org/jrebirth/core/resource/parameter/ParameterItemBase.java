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
package org.jrebirth.core.resource.parameter;

import org.jrebirth.core.resource.ResourceBuilders;

/**
 * The class <strong>ParameterItemBase</strong> is used to build Parameterized Object.
 * 
 * @param <T> the object type of the parameter
 * 
 * @author Sébastien Bordes
 */
public final class ParameterItemBase<T> implements ParameterItem {

    /** The generator of unique id. */
    private static int idGenerator;

    /** The unique identifier of the color item. */
    private int uid;

    /**
     * Private Constructor.
     * 
     * @param parameterParams the params for parameter object
     */
    private ParameterItemBase(final ParameterParams parameterParams) {

        builder().storeParams(this, parameterParams);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public T get() {
        return (T) builder().get(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParameterBuilder builder() {
        return ResourceBuilders.PARAMETER_BUILDER;
    }

    /**
     * Build a color item.
     * 
     * @param <O> the type of parameterized object
     * 
     * @param parameterParams the primitive values for the color
     * 
     * @return a new fresh color item object
     */
    public static <O extends Object> ParameterItemBase<O> build(final ObjectParameter<O> parameterParams) {
        final ParameterItemBase<O> parameterItem = new ParameterItemBase<O>(parameterParams);

        // Ensure that the uid will be unique at runtime
        synchronized (ParameterItemBase.class) {
            parameterItem.setUid(++idGenerator);
        }
        return parameterItem;
    }

    /**
     * Build a color item.
     * 
     * @param <O> the type of parameterized object
     * 
     * @param name the parameter unique name
     * @param value the parameterized object value
     * 
     * @return a new fresh color item object
     */
    public static <O extends Object> ParameterItemBase<O> build(final String name, final O value) {
        final ParameterItemBase<O> parameterItem = new ParameterItemBase<O>(new ObjectParameter<O>(name, value));

        // Ensure that the uid will be unique at runtime
        synchronized (ParameterItemBase.class) {
            parameterItem.setUid(++idGenerator);
        }
        return parameterItem;
    }

    /**
     * Gets the uid.
     * 
     * @return Returns the uid.
     */
    public int getUid() {
        return this.uid;
    }

    /**
     * Sets the uid.
     * 
     * @param uid The uid to set.
     */
    public void setUid(final int uid) {
        this.uid = uid;
    }
}

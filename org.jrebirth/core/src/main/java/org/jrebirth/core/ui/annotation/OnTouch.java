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
package org.jrebirth.core.ui.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.input.TouchEvent;

/**
 * This annotation is used to automatically attached a touch event handler to a property node.
 * 
 * @author Sébastien Bordes
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OnTouch {

    /**
     * The Touch event type.<br />
     * The Touch type will be appended to method name to use.
     */
    enum TouchType implements EnumEventType {

        /** Any Swipe Event. */
        Any(TouchEvent.ANY),

        /** Touch pressed event. */
        Pressed(TouchEvent.TOUCH_PRESSED),

        /** Touch released event. */
        Released(TouchEvent.TOUCH_RELEASED),

        /** Touch moved event. */
        Moved(TouchEvent.TOUCH_MOVED),

        /** Touch stationary event. */
        Stationary(TouchEvent.TOUCH_STATIONARY);

        /** The JavaFX internal api name. */
        private EventType<?> eventType;

        /**
         * Default constructor used to link the apiName
         * 
         * @param eventType the javafx event type
         */
        private TouchType(final EventType<?> eventType) {
            this.eventType = eventType;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public EventType<?> eventType() {
            return this.eventType;
        }

    }

    /**
     * Define the event type to manage.
     * 
     * The default value is TouchType.Any
     */
    TouchType[] value() default TouchType.Any;

    /**
     * Define a unique name used to avoid sharing same handler.
     * 
     * The default value is null, same event handler will be used for multiple annotation
     */
    String name() default "";

    /**
     * Define the JavaFX api event class.
     * 
     * Must not be changed !!!
     */
    Class<? extends Event> apiEventClass() default TouchEvent.class;
}

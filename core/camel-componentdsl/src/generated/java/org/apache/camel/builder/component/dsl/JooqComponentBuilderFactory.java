/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.jooq.JooqComponent;

/**
 * Store and retrieve Java objects from an SQL database using JOOQ.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface JooqComponentBuilderFactory {

    /**
     * JOOQ (camel-jooq)
     * Store and retrieve Java objects from an SQL database using JOOQ.
     * 
     * Category: database
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-jooq
     */
    static JooqComponentBuilder jooq() {
        return new JooqComponentBuilderImpl();
    }

    /**
     * Builder for the JOOQ component.
     */
    interface JooqComponentBuilder extends ComponentBuilder<JooqComponent> {
        /**
         * Component configuration (database connection, database entity type,
         * etc.).
         * 
         * The option is a:
         * <code>org.apache.camel.component.jooq.JooqConfiguration</code> type.
         * 
         * Group: common
         */
        default JooqComponentBuilder configuration(
                org.apache.camel.component.jooq.JooqConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To use a specific database configuration.
         * 
         * The option is a: <code>org.jooq.Configuration</code> type.
         * 
         * Group: common
         */
        default JooqComponentBuilder databaseConfiguration(
                org.jooq.Configuration databaseConfiguration) {
            doSetProperty("databaseConfiguration", databaseConfiguration);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default JooqComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Delete entity after it is consumed.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default JooqComponentBuilder consumeDelete(boolean consumeDelete) {
            doSetProperty("consumeDelete", consumeDelete);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default JooqComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Type of operation to execute on query.
         * 
         * The option is a:
         * <code>org.apache.camel.component.jooq.JooqOperation</code> type.
         * 
         * Default: NONE
         * Group: producer
         */
        default JooqComponentBuilder operation(
                org.apache.camel.component.jooq.JooqOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To execute plain SQL query.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default JooqComponentBuilder query(java.lang.String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default JooqComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class JooqComponentBuilderImpl
            extends
                AbstractComponentBuilder<JooqComponent>
            implements
                JooqComponentBuilder {
        @Override
        protected JooqComponent buildConcreteComponent() {
            return new JooqComponent();
        }
        private org.apache.camel.component.jooq.JooqConfiguration getOrCreateConfiguration(
                org.apache.camel.component.jooq.JooqComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.jooq.JooqConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((JooqComponent) component).setConfiguration((org.apache.camel.component.jooq.JooqConfiguration) value); return true;
            case "databaseConfiguration": getOrCreateConfiguration((JooqComponent) component).setDatabaseConfiguration((org.jooq.Configuration) value); return true;
            case "bridgeErrorHandler": ((JooqComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "consumeDelete": getOrCreateConfiguration((JooqComponent) component).setConsumeDelete((boolean) value); return true;
            case "lazyStartProducer": ((JooqComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((JooqComponent) component).setOperation((org.apache.camel.component.jooq.JooqOperation) value); return true;
            case "query": getOrCreateConfiguration((JooqComponent) component).setQuery((java.lang.String) value); return true;
            case "basicPropertyBinding": ((JooqComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}
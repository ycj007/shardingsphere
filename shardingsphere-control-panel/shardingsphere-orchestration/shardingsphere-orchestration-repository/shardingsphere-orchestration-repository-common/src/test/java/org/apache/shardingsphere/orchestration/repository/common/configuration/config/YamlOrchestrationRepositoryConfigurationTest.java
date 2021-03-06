/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.orchestration.repository.common.configuration.config;

import org.junit.Test;

import java.util.Properties;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public final class YamlOrchestrationRepositoryConfigurationTest {
    
    @Test
    public void assertCenterType() {
        String orchestrationType = "config_center";
        YamlOrchestrationRepositoryConfiguration yamlInstanceConfiguration = new YamlOrchestrationRepositoryConfiguration();
        yamlInstanceConfiguration.setOrchestrationType(orchestrationType);
        assertThat(yamlInstanceConfiguration.getOrchestrationType(), is(orchestrationType));
    }
    
    @Test
    public void assertInstanceType() {
        String instanceType = "zookeeper";
        YamlOrchestrationRepositoryConfiguration yamlInstanceConfiguration = new YamlOrchestrationRepositoryConfiguration();
        yamlInstanceConfiguration.setInstanceType(instanceType);
        assertThat(yamlInstanceConfiguration.getInstanceType(), is(instanceType));
    }
    
    @Test
    public void assertServerLists() {
        String serverLists = "127.0.0.1:2181,127.0.0.1:2182";
        YamlOrchestrationRepositoryConfiguration yamlInstanceConfiguration = new YamlOrchestrationRepositoryConfiguration();
        yamlInstanceConfiguration.setServerLists(serverLists);
        assertThat(yamlInstanceConfiguration.getServerLists(), is(serverLists));
    }
    
    @Test
    public void assertNamespace() {
        String namespace = "orchestration";
        YamlOrchestrationRepositoryConfiguration yamlInstanceConfiguration = new YamlOrchestrationRepositoryConfiguration();
        yamlInstanceConfiguration.setNamespace(namespace);
        assertThat(yamlInstanceConfiguration.getNamespace(), is(namespace));
    }
    
    @Test
    public void assertGetProps() {
        Properties props = new Properties();
        YamlOrchestrationRepositoryConfiguration yamlInstanceConfiguration = new YamlOrchestrationRepositoryConfiguration();
        yamlInstanceConfiguration.setProps(props);
        assertThat(yamlInstanceConfiguration.getProps(), is(props));
    }
}

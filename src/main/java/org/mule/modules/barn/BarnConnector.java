package org.mule.modules.barn;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.modules.barn.config.ConnectorConfig;

@Connector(name="barn",schemaVersion="1.0", friendlyName="Barn")
public class BarnConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor(friendlyName="Put an animal in the barn")
    public String putInBarn(@Placement(group="Parameters")
      @FriendlyName("The animal's name") String animal) {
            return animal + " has been placed in the barn";
        }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}
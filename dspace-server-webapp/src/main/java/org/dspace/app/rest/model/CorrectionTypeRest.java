/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.rest.model;

import org.dspace.app.rest.RestResourceController;

/**
 * The CorrectionType REST Resource
 *
 * @author Mohamed Eskander (mohamed.eskander at 4science.com)
 */
public class CorrectionTypeRest extends BaseObjectRest<String> {

    private static final long serialVersionUID = -8297846719538025938L;

    public static final String NAME = "correctiontype";
    public static final String CATEGORY = RestAddressableModel.CONFIGURATION;

    private String topic;
    private String creationForm;
    private String discoveryConfiguration;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDiscoveryConfiguration() {
        return discoveryConfiguration;
    }

    public void setDiscoveryConfiguration(String discoveryConfiguration) {
        this.discoveryConfiguration = discoveryConfiguration;
    }

    public String getCreationForm() {
        return creationForm;
    }

    public void setCreationForm(String creationForm) {
        this.creationForm = creationForm;
    }

    @Override
    public String getCategory() {
        return CATEGORY;
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public Class getController() {
        return RestResourceController.class;
    }

}

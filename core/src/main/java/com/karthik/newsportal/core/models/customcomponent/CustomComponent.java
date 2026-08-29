package com.karthik.newsportal.core.models.customcomponent;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = {
        Resource.class,
        SlingHttpServletRequest.class
    },
    resourceType = "newsportal/components/customcomponent",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class CustomComponent {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String descriptionTextColor;

    @ValueMapValue
    private String descriptionBackgroundColor;

    @ValueMapValue
    private String[] images;

    @ValueMapValue
    private String[] videos;


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionTextColor() {
        return descriptionTextColor;
    }

    public String getDescriptionBackgroundColor() {
        return descriptionBackgroundColor;
    }

    public String[] getImages() {
        return images;
    }

    public String[] getVideos() {
        return videos;
    }
}
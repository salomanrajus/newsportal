package com.karthik.newsportal.core.models.customcomponent;

import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {Resource.class, SlingHttpServletRequest.class},
		defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class CustomComponent {
	
	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String description;
	
	@ValueMapValue
	private String descriptionTextColor;
	
	@ValueMapValue
	private List<String> images;
	
	@ValueMapValue
	private List<String> videos;
	
	@ValueMapValue
	private String descriptionBackgroundColor;

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

	public List<String> getImages() {
		return images;
	}

	public List<String> getVideos() {
		return videos;
	}
}

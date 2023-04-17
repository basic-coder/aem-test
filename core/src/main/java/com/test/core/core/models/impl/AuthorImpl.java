package com.test.core.core.models.impl;

import com.day.cq.search.QueryBuilder;
import com.day.cq.wcm.api.Page;
import com.test.core.core.models.Author;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;


//@Model(adaptables = Resource.class, adapters = Author.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Model(adaptables = SlingHttpServletRequest.class, adapters = Author.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class AuthorImpl implements Author {

    private static final Logger LOG = LoggerFactory.getLogger(AuthorImpl.class);

    @OSGiService
    QueryBuilder queryBuilder;

    @Inject @Via("resource")
    @Named("jcr:created")
    String lastModified;

    @SlingObject
    ResourceResolver resourceResolver;

    @Self
    SlingHttpServletRequest slingHttpServletRequest;

    @RequestAttribute(name = "rAttribute")
    String requestedTitle;

    @ResourcePath(path = "/content/test/us") @Via("resource")
    Resource resource;

    @Inject
    @Via("resource")
    @Default(values = "bhau")
    String first_name;

    @Inject
    @Via("resource")
    String last_name;

    @Inject
    @Via("resource")
    Boolean isAuthor;

    @ScriptVariable
    Page currentPage;

    @Override
    public String getFirstName() {
        return first_name;
    }

    @Override
    public String getLastName() {
        return last_name;
    }

    @Override
    public Boolean isAuthor() {
        return isAuthor;
    }

    @Override
    public String getPageTitle(){
        return currentPage.getPageTitle();
    }

    @Override
    public String getRequestedTitle() {
        return requestedTitle;
    }

    @Override
    public String getHomePath() {
        return resource.getName();
    }

    @PostConstruct
    protected void init(){
        LOG.info("inside init {} : {}",currentPage.getTitle(),resource.getPath());
    }

    @Override
    public String getLastModified() {
        return lastModified;
    }
}

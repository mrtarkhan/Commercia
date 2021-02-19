package ir.commercia.catalog;

import ir.commercia.coreDomain.EntityBase;

public class Comment extends EntityBase {

    private Customer customer;
    private String author;
    private String title;
    private String content;
    private String positiveContent;
    private String negativeContent;
    private Integer rate;
    private Integer designRate;
    private Integer qualityRate;
    private Integer worthRate;
    private Integer featureRate;
    private Boolean isPublished;

}
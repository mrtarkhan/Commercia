package ir.commercia.catalog;

import ir.commercia.catalog.productEvents.TagAddedEvent;
import ir.commercia.coreDomain.AggregateRoot;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ProductTemplateAggregateRoot extends AggregateRoot {


    //region fields
    private String code;
    private String title;
    private String urlTitle;
    private String description;
    private String thumbnail;
    private Brand brand;
    private Category category;
    private Date createDate;
    private float reputation;

    private List<String> tags;
    private List<byte[]> images;
    private List<String> colors;

    private Boolean hasColor;
    private Boolean hasFeature;
    private Boolean hasSizing;

    private String content;
    private String review;
    private Boolean isPublished;

    private List<Comment> comments;
    //endregion


    //region constructors
    public ProductTemplateAggregateRoot(String code,
                                        String title,
                                        String description,
                                        String thumbnail,
                                        Date createDate) {
        super();
        this.code = code;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.createDate = createDate;
    }

    public ProductTemplateAggregateRoot(UUID id,
                                        String code,
                                        String title,
                                        String description,
                                        String thumbnail,
                                        Date createDate) {
        super(id);
        this.code = code;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.createDate = createDate;
    }
    //endregion


    //region business
    public void setUrlTitle(String urlTitle) {
        this.urlTitle = urlTitle;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setReputation(float reputation) {
        this.reputation = reputation;
    }

    public void addTag(String tag) {
        this.tags.add(tag);

        addEvent(new TagAddedEvent(this.id, tag));
    }

    public void deleteTag(String tag) {
        // todo: remove tag
    }

    public void addImage(byte[] image) {
        this.images.add(image);

        //todo: add event
    }

    public void addColor(String color) {
        this.colors.add(color);

        // todo: add event
    }

    public void setHasColor(Boolean hasColor) {
        this.hasColor = hasColor;
    }

    public void setHasFeature(Boolean hasFeature) {
        this.hasFeature = hasFeature;
    }

    public void setHasSizing(Boolean hasSizing) {
        this.hasSizing = hasSizing;
    }

    public void editContent(String content) {
        this.content = content;

        //todo : add event
    }

    public void editReview(String review) {
        this.review = review;

        //todo : add event
    }

    public void publish() {
        isPublished = true;
    }

    public void unPublish() {
        isPublished = false;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);

        //todo: add comment
    }
    //endregion


    //region getter setter
    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getUrlTitle() {
        return urlTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public Brand getBrand() {
        return brand;
    }

    public Category getCategory() {
        return category;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public float getReputation() {
        return reputation;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<byte[]> getImages() {
        return images;
    }

    public List<String> getColors() {
        return colors;
    }

    public Boolean getHasColor() {
        return hasColor;
    }

    public Boolean getHasFeature() {
        return hasFeature;
    }

    public Boolean getHasSizing() {
        return hasSizing;
    }

    public String getContent() {
        return content;
    }

    public String getReview() {
        return review;
    }

    public Boolean getPublished() {
        return isPublished;
    }

    public List<Comment> getComments() {
        return comments;
    }
    //endregion


}
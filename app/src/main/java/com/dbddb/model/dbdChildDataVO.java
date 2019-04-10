package com.dbddb.model;

import com.squareup.moshi.Json;

public class dbdChildDataVO {

    @Json(name = "name")
    private String name;
    @Json(name = "subreddit")
    private String subreddit;
    @Json(name = "selftext")
    private String selftext;
    @Json(name = "author_fullname")
    private String authorFullname;
    @Json(name = "title")
    private String title;
    @Json(name = "subreddit_type")
    private String subredditType;
    @Json(name = "ups")
    private Integer ups;
    @Json(name = "downs")
    private Integer downs;
    @Json(name = "thumbnail")
    private String thumbnail;
    @Json(name = "is_self")
    private Boolean isSelf;
    @Json(name = "view_count")
    private Object viewCount;
    @Json(name = "over_18")
    private Boolean over18;
    @Json(name = "media_only")
    private Boolean mediaOnly;
    @Json(name = "spoiler")
    private Boolean spoiler;
    @Json(name = "subreddit_id")
    private String subredditId;
    @Json(name = "author")
    private String author;
    @Json(name = "num_comments")
    private Integer numComments;
    @Json(name = "permalink")
    private String permalink;
    @Json(name = "url")
    private String url;
    @Json(name = "media")
    private Object media;
    @Json(name = "is_video")
    private Boolean isVideo;
    @Json(name = "post_hint")
    private String postHint;


    public dbdChildDataVO(String name, String subreddit, String selftext, String authorFullname, String thumbnail,
                          String title, String subredditType, Integer ups, Integer downs, String author,
                          Integer numComments, String permalink, String url, boolean isSelf,
                          boolean isVideo, boolean spoiler, boolean over18) {

        this.name = name;
        this.subreddit = subreddit;
        this.selftext = selftext;
        this.authorFullname = authorFullname;
        this.title = title;
        this.thumbnail = thumbnail;
        this.subredditType = subredditType;
        this.ups = ups;
        this.downs = downs;
        this.author = author;
        this.numComments = numComments;
        this.permalink = permalink;
        this.url = url;
        this.isSelf = isSelf;
        this.isVideo = isVideo;
        this.spoiler = spoiler;
        this.over18 = over18;
    }

    public String getName() {
        return name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public String getSelftext() {
        return selftext;
    }

    public String getTitle() {
        return title;
    }

    public Integer getUps() {
        return ups;
    }

    public Integer getDowns() {
        return downs;
    }

    public String getAuthor() {
        return author;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getUrl() {
        return url;
    }

    public Integer getNumComments() {
        return numComments;
    }

    public boolean getIsSelf() {
        return isSelf;
    }

    public boolean getIsVideo() {
        return isVideo;
    }

    public boolean getIsSpoiler() {
        return spoiler;
    }

    public boolean getIsOver18() {
        return over18;
    }
}
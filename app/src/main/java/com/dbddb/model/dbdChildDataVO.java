package com.dbddb.model;

import com.squareup.moshi.Json;

public class dbdChildDataVO {

    @Json(name = "name")
    public String name;
    @Json(name = "subreddit")
    public String subreddit;
    @Json(name = "selftext")
    public String selftext;
    @Json(name = "author_fullname")
    public String authorFullname;
    @Json(name = "title")
    public String title;
    @Json(name = "subreddit_type")
    public String subredditType;
    @Json(name = "ups")
    public Integer ups;
    @Json(name = "downs")
    public Integer downs;
    @Json(name = "thumbnail")
    public String thumbnail;
    @Json(name = "is_self")
    public Boolean isSelf;
    @Json(name = "view_count")
    public Object viewCount;
    @Json(name = "over_18")
    public Boolean over18;
    @Json(name = "media_only")
    public Boolean mediaOnly;
    @Json(name = "spoiler")
    public Boolean spoiler;
    @Json(name = "subreddit_id")
    public String subredditId;
    @Json(name = "author")
    public String author;
    @Json(name = "num_comments")
    public Integer numComments;
    @Json(name = "permalink")
    public String permalink;
    @Json(name = "url")
    public String url;
    @Json(name = "media")
    public Object media;
    @Json(name = "is_video")
    public Boolean isVideo;
    @Json(name = "post_hint")
    public String postHint;


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
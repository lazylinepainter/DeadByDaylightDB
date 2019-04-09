package com.dbddb.model;

import com.squareup.moshi.Json;

import java.util.List;

interface ViewType {

}
public class dbdChildDataVO {

    @Json(name = "approved_at_utc")
    public Object approvedAtUtc;
    @Json(name = "subreddit")
    public String subreddit;
    @Json(name = "selftext")
    public String selftext;
    @Json(name = "author_fullname")
    public String authorFullname;
    @Json(name = "saved")
    public Boolean saved;
    @Json(name = "mod_reason_title")
    public Object modReasonTitle;
    @Json(name = "gilded")
    public Integer gilded;
    @Json(name = "clicked")
    public Boolean clicked;
    @Json(name = "title")
    public String title;
    @Json(name = "subreddit_name_prefixed")
    public String subredditNamePrefixed;
    @Json(name = "hidden")
    public Boolean hidden;
    @Json(name = "pwls")
    public Integer pwls;
    @Json(name = "link_flair_css_class")
    public String linkFlairCssClass;
    @Json(name = "downs")
    public Integer downs;
    @Json(name = "thumbnail_height")
    public Integer thumbnailHeight;
    @Json(name = "hide_score")
    public Boolean hideScore;
    @Json(name = "name")
    public String name;
    @Json(name = "quarantine")
    public Boolean quarantine;
    @Json(name = "link_flair_text_color")
    public String linkFlairTextColor;
    @Json(name = "author_flair_background_color")
    public Object authorFlairBackgroundColor;
    @Json(name = "subreddit_type")
    public String subredditType;
    @Json(name = "ups")
    public Integer ups;
    @Json(name = "domain")
    public String domain;
    @Json(name = "thumbnail_width")
    public Integer thumbnailWidth;
    @Json(name = "author_flair_template_id")
    public Object authorFlairTemplateId;
    @Json(name = "is_original_content")
    public Boolean isOriginalContent;
    @Json(name = "user_reports")
    public List<Object> userReports = null;
    @Json(name = "secure_media")
    public Object secureMedia;
    @Json(name = "is_reddit_media_domain")
    public Boolean isRedditMediaDomain;
    @Json(name = "is_meta")
    public Boolean isMeta;
    @Json(name = "category")
    public Object category;
    @Json(name = "link_flair_text")
    public String linkFlairText;
    @Json(name = "can_mod_post")
    public Boolean canModPost;
    @Json(name = "score")
    public Integer score;
    @Json(name = "approved_by")
    public Object approvedBy;
    @Json(name = "thumbnail")
    public String thumbnail;
    @Json(name = "edited")
    public Boolean edited;
    @Json(name = "author_flair_css_class")
    public Object authorFlairCssClass;
    @Json(name = "content_categories")
    public Object contentCategories;
    @Json(name = "is_self")
    public Boolean isSelf;
    @Json(name = "mod_note")
    public Object modNote;
    @Json(name = "created")
    public Double created;
    @Json(name = "link_flair_type")
    public String linkFlairType;
    @Json(name = "wls")
    public Integer wls;
    @Json(name = "banned_by")
    public Object bannedBy;
    @Json(name = "author_flair_type")
    public String authorFlairType;
    @Json(name = "contest_mode")
    public Boolean contestMode;
    @Json(name = "selftext_html")
    public Object selftextHtml;
    @Json(name = "likes")
    public Object likes;
    @Json(name = "suggested_sort")
    public Object suggestedSort;
    @Json(name = "banned_at_utc")
    public Object bannedAtUtc;
    @Json(name = "view_count")
    public Object viewCount;
    @Json(name = "archived")
    public Boolean archived;
    @Json(name = "no_follow")
    public Boolean noFollow;
    @Json(name = "is_crosspostable")
    public Boolean isCrosspostable;
    @Json(name = "pinned")
    public Boolean pinned;
    @Json(name = "over_18")
    public Boolean over18;
    @Json(name = "media_only")
    public Boolean mediaOnly;
    @Json(name = "can_gild")
    public Boolean canGild;
    @Json(name = "spoiler")
    public Boolean spoiler;
    @Json(name = "locked")
    public Boolean locked;
    @Json(name = "author_flair_text")
    public Object authorFlairText;
    @Json(name = "visited")
    public Boolean visited;
    @Json(name = "num_reports")
    public Object numReports;
    @Json(name = "distinguished")
    public Object distinguished;
    @Json(name = "subreddit_id")
    public String subredditId;
    @Json(name = "mod_reason_by")
    public Object modReasonBy;
    @Json(name = "removal_reason")
    public Object removalReason;
    @Json(name = "link_flair_background_color")
    public String linkFlairBackgroundColor;
    @Json(name = "id")
    public String id;
    @Json(name = "is_robot_indexable")
    public Boolean isRobotIndexable;
    @Json(name = "report_reasons")
    public Object reportReasons;
    @Json(name = "author")
    public String author;
    @Json(name = "num_crossposts")
    public Integer numCrossposts;
    @Json(name = "num_comments")
    public Integer numComments;
    @Json(name = "send_replies")
    public Boolean sendReplies;
    @Json(name = "whitelist_status")
    public String whitelistStatus;
    @Json(name = "mod_reports")
    public List<Object> modReports = null;
    @Json(name = "author_patreon_flair")
    public Boolean authorPatreonFlair;
    @Json(name = "author_flair_text_color")
    public Object authorFlairTextColor;
    @Json(name = "permalink")
    public String permalink;
    @Json(name = "parent_whitelist_status")
    public String parentWhitelistStatus;
    @Json(name = "stickied")
    public Boolean stickied;
    @Json(name = "url")
    public String url;
    @Json(name = "subreddit_subscribers")
    public Integer subredditSubscribers;
    @Json(name = "created_utc")
    public Double createdUtc;
    @Json(name = "media")
    public Object media;
    @Json(name = "is_video")
    public Boolean isVideo;
    @Json(name = "post_hint")
    public String postHint;


    public dbdChildDataVO(String subreddit, String selftext, String authorFullname, String thumbnail,
                          String title, Integer downs, String name, String subredditType, Integer ups,
                          String author, Integer numComments, String permalink, String url, boolean isSelf) {
        this.subreddit = subreddit;
        this.selftext = selftext;
        this.authorFullname = authorFullname;
        this.title = title;
        this.thumbnail = thumbnail;
        this.downs = downs;
        this.name = name;
        this.subredditType = subredditType;
        this.ups = ups;
        this.author = author;
        this.numComments = numComments;
        this.permalink = permalink;
        this.url = url;
        this.isSelf = isSelf;
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

    public String getAuthorFullname() {
        return authorFullname;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDowns() {
        return downs;
    }

    public String getName() {
        return name;
    }

    public Integer getUps() {
        return ups;
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
}
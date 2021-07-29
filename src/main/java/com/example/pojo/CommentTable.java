package com.example.pojo;

public class CommentTable {
    private Integer id;

    private String commentName;

    private String commentContent;

    private String commentTime;

    private String commentParkname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName == null ? null : commentName.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime == null ? null : commentTime.trim();
    }

    public String getCommentParkname() {
        return commentParkname;
    }

    public void setCommentParkname(String commentParkname) {
        this.commentParkname = commentParkname == null ? null : commentParkname.trim();
    }
}
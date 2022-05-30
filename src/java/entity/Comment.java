/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author CASPER
 */
public class Comment {
    private int CommentId;
    private int ProductId;
    private String Comment;
    private boolean CommentConfirm;
    private Date CommentDate;
    private Date CommentUpdateDate;

    public Comment(int CommentId, int ProductId, String Comment, boolean CommentConfirm, Date CommentDate, Date CommentUpdateDate) {
        this.CommentId = CommentId;
        this.ProductId = ProductId;
        this.Comment = Comment;
        this.CommentConfirm = CommentConfirm;
        this.CommentDate = CommentDate;
        this.CommentUpdateDate = CommentUpdateDate;
    }

    public int getCommentId() {
        return CommentId;
    }

    public void setCommentId(int CommentId) {
        this.CommentId = CommentId;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public boolean isCommentOnaylama() {
        return CommentConfirm;
    }

    public void setCommentOnaylama(boolean CommentConfirm) {
        this.CommentConfirm = CommentConfirm;
    }

    public Date getCommentDate() {
        return CommentDate;
    }

    public void setCommentDate(Date CommentDate) {
        this.CommentDate = CommentDate;
    }

    public Date getCommentUpdateDate() {
        return CommentUpdateDate;
    }

    public void setCommentUpdateDate(Date CommentUpdateDate) {
        this.CommentUpdateDate = CommentUpdateDate;
    }
    
    
}

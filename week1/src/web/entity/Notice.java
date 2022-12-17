package web.entity;

import java.io.StringWriter;
import java.util.Date;

public class Notice {
    private int     id;
    private String  title;
    private String  writer;
    private Date    regDate;
    private Date    modDate;
    private int     views;
    private String  files;
    private String  content;

    public Notice() {
    }

    public Notice(int id, String title, String writer, Date regDate, Date modDate, int views, String files, String content) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.regDate = regDate;
        this.modDate = modDate;
        this.views = views;
        this.files = files;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriterId() {
        return writer;
    }

    public void setWriterId(String writerId) {
        this.writer = writerId;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", writerId='" + writer + '\'' +
                ", regDate='" + regDate + '\'' +
                ", modDate='" + modDate + '\'' +
                ", views='" + views + '\'' +
                ", files='" + files + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

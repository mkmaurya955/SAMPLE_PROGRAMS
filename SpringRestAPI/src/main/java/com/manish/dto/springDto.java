package com.manish.dto;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="emp")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)

//We don’t want clients to send the createdAt value. If they send a value for this field, 
//we’ll simply ignore it.
public class springDto {
	@Id
    private String id;

//    db.emp.insert([{id:"1002",title:"DemoProg",completed:"false",createdAt:"08-01-2020"}])

    private String title;

    private Boolean completed = false;

    protected Date createdAt = new Date();

    public springDto() {
        super();
    }

    public springDto(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo[id=%s, title='%s', completed='%s']",
                id, title, completed);
    }


}

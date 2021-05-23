package models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "books"
})

public class Books {

    @JsonProperty("books")
    private List<Book> books = null;

    @JsonProperty("books")
    public List<Book> getBooks() {
        return books;
    }

    @JsonProperty("books")
    public void setBooks(List<Book> books) {
        this.books = books;
    }

}


package main;

public interface ReadyOnlyBook {
    int getId();

    String getTitle();

    String getAuthor();

    String toString();

    Price getPrice();

    void setPrice(Double price);
}

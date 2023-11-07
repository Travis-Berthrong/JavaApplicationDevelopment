package question3.datamodel;

import java.util.Date;

public class Booking {
    private String bookingId;
    private String userId;
    private String movieId;
    private int payId;
    private Date bookingDate;
    private String bookingTime;
    private int bookingSeats;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public int getBookingSeats() {
        return bookingSeats;
    }

    public void setBookingSeats(int bookingSeats) {
        this.bookingSeats = bookingSeats;
    }
}
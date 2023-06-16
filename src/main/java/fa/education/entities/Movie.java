package fa.education.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @Column(name = "MOVIE_ID")
    private String movieId;
    @Column(name = "ACTOR", nullable = false)
    private String actor;
    @Column(name = "CONTENT", nullable = false)
    private String content;
    @Column(name = "DIRECTOR", nullable = false)
    private String director;
    @Column(name = "DURATION", nullable = false)
    private Double duration;
    @Column(name = "FROM_DATE", nullable = false)
    private Date fromDate;
    @Column(name = "TO_DATE", nullable = false)
    private Date toDate;
    @Column(name = "MOVIE_PRODUCTION_COMPANY", nullable = false)
    private String movieProductionCompany;
    @Column(name = "VERSION", nullable = false)
    private String version;
    @Column(name = "MOVIE_NAME_ENG", nullable = false, unique = true)
    private String movieNameEng;
    @Column(name = "MOVIE_NAME_VIE", nullable = false, unique = true)
    private String getMovieNameVie;
    @Column(name = "LARGE_IMAGE", nullable = false)
    private String largeImage;
    @Column(name = "SMALL_IMAGE", nullable = false)
    private String smallImage;
    @OneToMany(mappedBy = "movie")
    private List<MovieType> movieTypes;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getMovieProductionCompany() {
        return movieProductionCompany;
    }

    public void setMovieProductionCompany(String movieProductionCompany) {
        this.movieProductionCompany = movieProductionCompany;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMovieNameEng() {
        return movieNameEng;
    }

    public void setMovieNameEng(String movieNameEng) {
        this.movieNameEng = movieNameEng;
    }

    public String getGetMovieNameVie() {
        return getMovieNameVie;
    }

    public void setGetMovieNameVie(String getMovieNameVie) {
        this.getMovieNameVie = getMovieNameVie;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }
}

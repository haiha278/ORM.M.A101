package fa.education.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MovieType")
public class MovieType {
    @Id
    @ManyToOne
    @JoinColumn(name = "TYPE_ID", nullable = false)
    private Type type;
    @Id
    @ManyToOne
    @JoinColumn(name = "MOVIE_ID", nullable = false)
    private Movie movie;
    @Column(name = "MT_DESCRIPTION", nullable = false)
    private String mtDescription;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getMtDescription() {
        return mtDescription;
    }

    public void setMtDescription(String mtDescription) {
        this.mtDescription = mtDescription;
    }
}

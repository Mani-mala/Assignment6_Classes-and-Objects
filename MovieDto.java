package assignment6;

public class MovieDto {
	private final static String language="Tamil";
	private String movie_name;
	private String starring;
	private String genres;
	private String director;
	private String releasing_date;
	private float duration;
	private float ratings;
	public String getMovieName() {
		return movie_name;
	}
	public void setMovieName(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getStarring() {
		return starring;
	}
	public void setStarring(String starring) {
		this.starring = starring;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getReleasingDate() {
		return releasing_date;
	}
	public void setReleasingDate(String releasing_date) {
		this.releasing_date = releasing_date;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public static void main(String[] args) {
		MovieDto movie1=new MovieDto();
		movie1.setMovieName("Sachin");
		System.out.println("Movie : "+movie1.getMovieName());
		movie1.setStarring("Vijay, Jenelia");
		System.out.println("Starring : "+movie1.getStarring());
		movie1.setGenres("Comedy, Love");
		System.out.println("Genres : "+movie1.getGenres());
		movie1.setDirector("John");
		System.out.println("Director : "+movie1.getDirector());
		movie1.setReleasingDate("14-04-2005");
		System.out.println("Releasing Date : "+movie1.getReleasingDate());
		movie1.setDuration(2.31f);
		System.out.println("Duration : "+movie1.getDuration()+" hrs");
		movie1.setRatings(9.5f);
		System.out.println("Rating : "+movie1.getRatings());
		System.out.println("Language : "+ language);
	}
}

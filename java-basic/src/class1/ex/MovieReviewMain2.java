package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        MovieReview movie2 = new MovieReview();
        MovieReview[] movieReviews = {movie1, movie2};
        movie1.title = "인셉션";
        movie2.title = "어바웃타임";
        movie1.review = "인생은 무한루프";
        movie2.review = "인생 시간 영화";
        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목: "+movieReview.title+", 리뷰: "+movieReview.review);
        }
    }
}

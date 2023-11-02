package basic1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Movie {
	int mYear;
	int mPrice;
	String mName;

	public Movie(int mYear, int mPrice, String mName) {
		super();
		this.mYear = mYear;
		this.mPrice = mPrice;
		this.mName = mName;
	}

	@Override
	public String toString() {
		return "Movie [mYear=" + mYear + ", mPrice=" + mPrice + ", mName=" + mName + "]";
	}
}
class SortByMovieName implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.mName.compareTo(o2.mName);
	}
	 
}
class sortbyMovieYear implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.mYear-o2.mYear;
	}
	
}
class SortbyMoviePrice implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.mPrice-o2.mPrice;
	}
	
}

public class ComparableEx {

	public static void main(String[] args) {
		ArrayList<Movie> ar = new ArrayList<Movie>();
		ar.add(new Movie(2006, 80, "Raja Rani"));
		ar.add(new Movie(2022, 100, "RRR"));
		ar.add(new Movie(2023, 150, "Baby"));
		ar.add(new Movie(2018, 540, "Sir"));
		
		Collections.sort(ar,new SortbyMoviePrice());
		
		System.out.println("Sort by movie name");
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}

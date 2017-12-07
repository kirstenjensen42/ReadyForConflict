
public class Conflicted {
	
	private String sadNews;
	
	private String reallySadNews;
	
	private String pleaseNoMoreReallySadNews;
	
	public Conflicted() {
		sadNews = new String();
		reallySadNews = new String();
		pleaseNoMoreReallySadNews = new String();
	}
	
	
	public String getSadNews() {
		
		sadNews = "I'm so sorry, but this is really sad news.";
		
		return sadNews;
		
	}
	
	
	public String getReallySadNews() {
		
		reallySadNews = getSadNews() + " You won't believe how sad.";
		
		return reallySadNews;
		
	}
	
	
	public String getPleaseNoMoreReallySadNews() {
		
		pleaseNoMoreReallySadNews = getReallySadNews() + " I won't even tell you it's so sad.";
		
		return pleaseNoMoreReallySadNews;
		
	}
	
	
}

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Playlist mp = new Playlist();
		//mp.addsongs_usingList();
		
		//create a playlist
		List<Integer> p_Indices = Arrays.asList(3,6,5);
		
		try {
			List<String> selectedLines = mp.addsongs_usingList1(p_Indices);
			for(String line : selectedLines) {
				System.out.println(line);
			}
		}catch(Exception e) {
				e.printStackTrace();
			}
		
	

	}	

}

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Playlist {
	private List<Integer> songids = new ArrayList<>();
	
	Playlist(){
		this.songids = new ArrayList<>(songids);
	}
	//CSVLoader csv = new CSVLoader();
//	public void addsongs() throws IOException {
//		CSVLoader csv = new CSVLoader();
//		try {
//			String[] data = csv.csvReading1("C:\\\\\\\\Users\\\\\\\\sande\\\\\\\\Downloads\\\\\\\\songs.csv");
//			for(String row : data) {
//				System.out.println(row);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		//csv.csvReading("C:\\\\Users\\\\sande\\\\Downloads\\\\songs.csv");
//	}
	// this method is written using String[] return type
	public String[] addsongs1(){
		CSVLoader csv = new CSVLoader();
		String[] result = null;
		
		try {
			result = csv.csvReading1("C:\\\\\\\\Users\\\\\\\\sande\\\\\\\\Downloads\\\\\\\\songs.csv");
			for(String row : result) {
				System.out.println(row);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// this method is written using List<String> as written type
	 public List<String> addsongs_usingList() {
	        CSVLoader csv = new CSVLoader();
	        List<String> result = null;

	        try {
	            result = csv.csvReading_usingList("C:\\Users\\sande\\Downloads\\songs.csv");
	            for (String row : result) {
	                System.out.println(row);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return result;
	    }
	 
	 public List<String> addsongs_usingList1(List<Integer> indices) throws IOException {
	        CSVLoader csv = new CSVLoader();
	        List<String> result = csv.csvReading_usingList11("C:\\Users\\sande\\Downloads\\songs.csv", indices.size());
	        
	        List<String> selectedLines = Arrays.asList(new String[indices.size()]);

	        // Populate the selected lines based on specified indices
	        for (int i = 0; i < indices.size(); i++) {
	            int index = indices.get(i);
	            if (index >= 0 && index < result.size()) {
	                selectedLines.set(i, result.get(index));
	            }
	        }

	        // Shuffle the list randomly
//	        Collections.shuffle(result);
//
//	        List<String> selectedLines = new ArrayList<>();
//
//	        // Select lines based on specified indices
//	        for (int index : indices) {
//	            if (index >= 0 && index < result.size()) {
//	                selectedLines.add(result.get(index));
//	            }
//	        }

	        return selectedLines;
	 }
}

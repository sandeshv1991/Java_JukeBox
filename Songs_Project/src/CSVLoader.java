import com.opencsv.CSVReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVLoader {

	public static void main(String[] args) throws IOException {
		
		String filepath = "C:\\\\Users\\\\sande\\\\Downloads\\\\songs.csv";
		//String filepath = "‪C:\\Users\\sande\\Downloads\\songs.csv";
		String header = "S_No,Song_name, Genre, Album_Name, Album_Artist, #featured_artists";
		
		try {
			addHeader(filepath, header);
			csvReading1(filepath);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void addHeader(String filepath, String header) throws IOException {
		Path path = Paths.get(filepath);
		List<String> originalcontent = Files.readAllLines(path);
		
		try (FileWriter fw = new FileWriter(filepath)){
			fw.write(header + "\n");
			
			for(String line : originalcontent) {
				fw.write(line + "\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//System.out.println("operation successful");
	}
	
	 public static void csvReading(String filepath) throws IOException {
		 BufferedReader reader = null;
		 String line = "";
		 int count = 0;
		 
		 try {
			 reader = new BufferedReader(new FileReader(filepath));
					 while((line = reader.readLine()) != null && count<10) {
						 String[] row = line.split(",");
						 for(String index : row) {
							 System.out.printf("%-10s", index);
						 }
						 System.out.println();
						 count++;
					 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 if(reader!=null) {
				 reader.close();
			 }
		 }
		 
	 }
	 // this method is written using String[] as a return type
	 public static String[] csvReading1(String filepath) throws IOException {
	        BufferedReader reader = null;
	        String line = "";
	        int count = 0;
	        List<String[]> rows = new ArrayList<>();

	        try {
	            reader = new BufferedReader(new FileReader(filepath));
	            while ((line = reader.readLine()) != null && count < 10) {
	                String[] row = line.split(",");
	                rows.add(row);
	                count++;
	            }
	        } catch (Exception e) {
	        	 e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                reader.close();
	            }
	        }
	        String[] result = new String[rows.size()];
	        for (int i = 0; i < rows.size(); i++) {
	            result[i] = String.join(",", rows.get(i));
	        }

	        return result;
	 }
	 // this method is written using List<String> as a return type
	 public static List<String> csvReading_usingList(String filepath) throws IOException {
	        BufferedReader reader = null;
	        String line = "";
	        int count = 0;
	        List<String> rows = new ArrayList<>();

	        try {
	            reader = new BufferedReader(new FileReader(filepath));
	            while ((line = reader.readLine()) != null && count < 10) {
	                String[] row = line.split(",");
	                StringBuilder joinedRow = new StringBuilder();
	                for (String element : row) {
	                    if (joinedRow.length() > 0) {
	                        joinedRow.append(",");
	                    }
	                    joinedRow.append(element);
	                }
	                rows.add(joinedRow.toString());
	                count++;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                reader.close();
	            }
	        }

	        return rows;
	 }
	 public static List<String> csvReading_usingList11(String filepath) throws IOException {
	        BufferedReader reader = null;
	        String line = "";
	        int count = 0;
	        List<String> rows = new ArrayList<>();

	        try {
	            reader = new BufferedReader(new FileReader(filepath));
	            while ((line = reader.readLine()) != null && count < 10) {
	                String[] row = line.split(",");
	                StringBuilder joinedRow = new StringBuilder();
	                for (String element : row) {
	                    if (joinedRow.length() > 0) {
	                        joinedRow.append(",");
	                    }
	                    joinedRow.append(element);
	                }
	                rows.add(joinedRow.toString());
	                count++;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                reader.close();
	            }
	        }

	        return rows;
	 } public static List<String> csvReading_usingList11(String filepath, int indices) throws IOException {
	        BufferedReader reader = null;
	        String line = "";
	        int count = 0;
	        List<String> rows = new ArrayList<>();

	        try {
	            reader = new BufferedReader(new FileReader(filepath));
	            while ((line = reader.readLine()) != null && count < 10) {
	                String[] row = line.split(",");
	                StringBuilder joinedRow = new StringBuilder();
	                for (String element : row) {
	                    if (joinedRow.length() > 0) {
	                        joinedRow.append(",");
	                    }
	                    joinedRow.append(element);
	                }
	                rows.add(joinedRow.toString());
	                count++;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                reader.close();
	            }
	        }

	        return rows;
	 }
	}
	 


		//String csvfilepath = "‪‪‪C:\\Users\\sande\\Downloads\\songs.csv";
//		String csvfilepath = "C:\\Users\\sande\\Downloads\\songs.csv";
//
//		BufferedReader reader = null;
//		String line = "";
//		
//		try {
//			reader = new BufferedReader(new FileReader(csvfilepath));
//			while((line = reader.readLine())!= null) {
//				String[] row  = line.split(",");
//				for(String index : row) {
//					System.out.printf("%-10s", index);
//				}
//				System.out.println();
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			reader.close();
//		}
//


package kyro.properties;

import kyro.properties.File_Reader_Manager;

public class File_Reader_Manager {

	private File_Reader_Manager() {
		
	}

  	public Configuration_Reader getInstanceCR() throws Exception {
		
  		Configuration_Reader reader = new Configuration_Reader();
  		
  		return reader;
  		
	}
  	
  	public static File_Reader_Manager getInstance() {
		
  		File_Reader_Manager fr_manager = new File_Reader_Manager();
  		
  		return fr_manager;
	}

}

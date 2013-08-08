package org.eclectic.test.streaming.javaparser;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class FileRetriever {
	public String[] dirs;
	public FileRetriever(String... dirs) {
		this.dirs = dirs;
	}
	
	public Collection<String> getFiles() {
		LinkedList<String> files = new LinkedList<String>();
		for(int i = 0; i < dirs.length; i++) {
			getFilesAux(dirs[i], files);
		}
		System.out.println("Retrieving " + files.size() + " files.");
		return files;
	}
	
	protected void getFilesAux(String dir, final List<String> list) {
		String[] files = new File(dir).list();
		for(int i = 0; i < files.length; i++) {
			String fname = dir + File.separator + files[i];
			File f       = new File(fname);
			if ( f.isDirectory() ) {
				getFilesAux(fname, list);
			} else if ( fname.endsWith(".java") ) {
				list.add(fname);
			}				
			
		}
	}
}

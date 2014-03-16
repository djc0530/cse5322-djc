/*
 * Copyright (C) 2014 djc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package classdiagrameditor;

import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author djc
 */
public class ProjectPanel extends JPanel {

    public ProjectPanel() {
        super();
    }
  
    public boolean newProject() {
        boolean success = false;
        
        // fake it for now
        success = true;
        System.out.println("projectPanel newProject() called"); 
        
        return success;
    }
    
    public boolean openProject() {
        boolean openStatus = false;
        
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileFilter filter = new FileNameExtensionFilter("XML file", new String []{"xml"});
        fc.setFileFilter(filter);
        Component parent = null;
        int returnVal = fc.showOpenDialog(parent);
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            System.out.println("Opening project file: " + fc.getSelectedFile().getAbsolutePath());
            File projFile = fc.getSelectedFile();

            // Call routine to read the obtained XML project file (projFile) here...
            
            // fake it for now
            openStatus = true;
            
        }
        
        return openStatus;
    }
    
    public boolean closeProject() {
        boolean okToClose = false;
        
        // fake it for now
        okToClose = true;
        
        // to do: check for unsaved data
        if(okToClose == true)
            System.out.println("projectPanel closeProject() called");      
        
        return okToClose;
    }
    
    public void saveProject() {
        String sb = "TEST CONTENT";
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileFilter filter = new FileNameExtensionFilter("XML file", new String []{"xml"});
        chooser.setFileFilter(filter);
        Component parent = null;
        chooser.setCurrentDirectory(new File("C:\\Users\\djc"));
        int retrival = chooser.showSaveDialog(parent);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter fw = new FileWriter(chooser.getSelectedFile()+".xml");
                fw.write(sb.toString());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("projectPanel saveProject() called");       
    }
    
    public boolean deleteProject() {
        boolean deleteStatus = false;
        
        // to do:  prompt for confirmation
        int button = JOptionPane.YES_NO_OPTION;
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the project?", "Warning", button);
        //fake it for now
        if(response == JOptionPane.YES_OPTION)
        {
            // call delete routine here...
            
            deleteStatus = true; // fake it for now
        }
        else
        {
            deleteStatus = false; // fake it for now
        }
        
        System.out.println("projectPanel deleteProject() called");  
        
        return deleteStatus;
    }
    
}

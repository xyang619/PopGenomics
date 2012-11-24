/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.ac.picb.popgenomics.api;

import javax.swing.JFileChooser;

/**
 *
 * @author young
 */
public class PickFile {
    public String getFile(String type,boolean dirOnly) {
        JFileChooser jfc = new JFileChooser(System.getProperty("user.home"));
        if(dirOnly)
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int retVal;
        if(type.equals("open"))
            retVal= jfc.showOpenDialog(null);
        else{
            retVal=jfc.showSaveDialog(null);
        }
        if (retVal == JFileChooser.APPROVE_OPTION) {
            String file = jfc.getSelectedFile().getAbsolutePath();
            return file;
        } else {
            return null;
        }
    }
}
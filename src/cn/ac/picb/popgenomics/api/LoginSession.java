/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.ac.picb.popgenomics.api;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 *
 * @author young
 */
public class LoginSession extends JSch{
    private boolean isLogin=false;
    private String username="";
    private Session session = null;
    public LoginSession(String host,String user,String pwd){
        JSch jsch = new JSch();
        try{
            session = jsch.getSession(user, host,22);
            session.setPassword(pwd);
            java.util.Properties config = new java.util.Properties(); 
            config.put("StrictHostKeyChecking", "no");        
            session.setConfig(config);
            session.connect();
            if(session.isConnected()){
                isLogin=true;
                username=session.getUserName();
            }
        }catch(JSchException ex){
            ex.printStackTrace();
        }
    }
    public Session getSession(){
        return this.session;
    }  
}

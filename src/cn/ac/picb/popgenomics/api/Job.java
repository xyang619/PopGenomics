/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.ac.picb.popgenomics.api;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 *
 * @author young
 */
public class Job {
    private Session session;
    private String cmd;

    public Job(Session session, String cmd) {
        this.session = session;
        this.cmd = cmd;
    }
    public void submit() throws JSchException{
            try{
                ChannelExec channel = (ChannelExec)session.openChannel("exec");
            channel.setCommand(cmd);
            /*channel.setInputStream(null);
            channel.setOutputStream(null);
            channel.setErrStream(null);
            ((ChannelExec)channel).setErrStream(System.err);
            channel.setOutputStream(System.out);
            InputStream is = channel.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            * */
            channel.connect();
            //channel
            channel.disconnect();
        }catch(JSchException e){
            e.printStackTrace();
        }
    }
    
}

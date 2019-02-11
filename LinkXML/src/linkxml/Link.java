/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkxml;

/**
 *
 * @author riva_roland
 */
public class Link {

    @Override
    public String toString() {
        return "Link{" + "path=" + path + ", link=" + link + '}';
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Link(String path, String link) {
        this.path = path;
        this.link = link;
    }
    private String path;
    private String link;
    
}

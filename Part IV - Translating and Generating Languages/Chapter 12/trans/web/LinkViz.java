package web;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class LinkViz {
    STGroup templates;

    List<Link> links = new ArrayList<Link>();
    public static class Link {
        String from;
        String to;
        public Link(String from, String to) { this.from = from; this.to = to; }
    }

    public LinkViz() throws IOException {
        templates = new STGroupFile("DOT.stg");
    }

    public void addLink(String from, String to) {
        links.add(new Link(from, to));
    }

    public String toString() {
        ST fileST = templates.getInstanceOf("file");
        fileST.add("gname", "testgraph");
        for (Link x : links) {
            ST edgeST = templates.getInstanceOf("edge");
            edgeST.add("from", x.from);
            edgeST.add("to", x.to);
            fileST.add("edges", edgeST.render()); // or just edgeST, if the template group is configured to render automatically
        }
        return fileST.render(); // render (eval) template to text
    }
}

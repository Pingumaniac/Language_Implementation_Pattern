package web;

public class GenDOT {
    public static void main(String[] args) throws Exception {
        LinkViz viz = new LinkViz();
        viz.addLink("index.html", "login.html");
        viz.addLink("index.html", "about.html");
        viz.addLink("login.html", "error.html");
        viz.addLink("about.html", "news.html");
        viz.addLink("index.html", "news.html");
        viz.addLink("logout.html", "index.html");
        viz.addLink("index.html", "logout.html");
        System.out.println(viz.toString());
    }
}

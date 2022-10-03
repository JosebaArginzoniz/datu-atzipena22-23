package dambi;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystems;

public class Path_Create {
    Path p1 = Paths.get("/tmp/foo");
    private URI[] args;
    Path p2 = Paths.get(args[0]);
    Path p3 = Paths.get(URI.create("file:///Users/joe/FileTest.java"));
    Path p4 = FileSystems.getDefault().getPath("/users/sally");
    Path p5 = Paths.get(System.getProperty("user.home"),"logs", "foo.log");

    public static void main(String[] args) {

    // None of these methods requires that the file corresponding
    // to the Path exists.
    // Microsoft Windows syntax
    Path path = Paths.get(/*"C:\\home\\joe\\foo*/"F:\\2022-2023\\DatuAtzipena\\1-Fitxategiak_Stream _moduan _atzitzekoak\\04-fileio\\karpeta_berriak\\animaliak\\arrainak");

    System.out.format("toString: %s%n", path.toString());
    System.out.format("getFileName: %s%n", path.getFileName());
    System.out.format("getName(0): %s%n", path.getName(0));
    System.out.format("getNameCount: %d%n", path.getNameCount());
    System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
    System.out.format("getParent: %s%n", path.getParent());
    System.out.format("getRoot: %s%n", path.getRoot());  
    
    }
}

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String filename = "", cmd, inputname = "";
        boolean toDifferentFile = false;
        try {
            if (args.length < 1) {
                System.err.println("usage: java Main.java <filename>");
                // filename = "Y1SB";
                return;
            } else if (args.length == 1 && !args[0].startsWith("-")) {
                inputname = extractFileName(args[0]);
            } else {
                for (int i = 0; i < args.length; i++) {
                    cmd = args[i];
                    switch (cmd) {
                        case "--help":
                        case "-h":
                            System.out.println("Usage: java Main.java <inputfile> [options]");
                            System.out.println("Options:");
                            System.out.println("  --help, -h            Show this help message");
                            System.out.println("  --output, -o <file>   Specify output ICS file name");
                            System.out.println("  --setfile, -s         Set the input file name");
                            System.out.println("  --toDifferentFile, -d Export each course to a different ICS file");
                            return;
                        case "--output":
                        case "-o":
                            filename = args[++i];
                            break;
                        case "-s":
                        case "--setfile":

                            inputname = extractFileName(args[++i]);

                            break;
                        case "--toDifferentFile":
                        case "-d":
                            i++;
                            toDifferentFile = true;
                            break;

                        default:
                            break;
                    }
                }
            }
            if (filename.equals("")) {
                filename = inputname;
            }
            if (inputname.equals("")) {
                inputname = filename;
            }
            DataReader rd = new DataReader(inputname + ".txt");
            if (!toDifferentFile) {
                ICSExporter exporter = new ICSExporter(rd.getCoursesAry());
                exporter.export(filename);
                // System.out.println(rd.getCoursesJSON());
            } else {
                ArrayList<Course> courses = rd.getCoursesAry();
                for (Course c : courses) {
                    ICSExporter exporter = new ICSExporter(c);
                    exporter.export();
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing argument value");
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String extractFileName(String path) {
        // System.out.println(path.split("\\.")[0]);
        return path.split("\\.")[0];
    }
}
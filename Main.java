public class Main {

    public static void main(String[] args) {
        String filename;
        if (args.length < 1) {
            System.err.println("usage: java Main.java <filename>");
            // filename = "Y1SB";
            return;
        } else
            filename = args[0];
        DataReader rd = new DataReader(filename + ".txt");
        ICSExporter exporter = new ICSExporter(rd.getCoursesAry());
        exporter.export(filename + ".ics");
    }
}
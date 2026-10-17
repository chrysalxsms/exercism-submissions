public class LogLevels {
    
    public static String message(String logLine) {
        int firstSpaceIdx = logLine.indexOf(' ');
        if (firstSpaceIdx == -1) {
            return ""; // No space found
        }
        return logLine.substring(firstSpaceIdx + 1).strip();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf('[');
        int end = logLine.indexOf(']');
        String level = logLine.substring(start + 1, end);
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        String reform = message(logLine) + " (" + logLevel(logLine) + ')';
        return reform;
    }
}

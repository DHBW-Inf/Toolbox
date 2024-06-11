package de.tinf.io;

/**
 * The ConsoleANSICode enum represents the ANSI escape codes for console text formatting and colors.
 * Each enum constant represents a specific ANSI escape code.
 */
public enum ConsoleANSICode {
    COLOR_OFF("\u001B[0m"),
    FG_BLACK("\u001B[30m"),
    FG_RED("\u001B[31m"),
    FG_GREEN("\u001B[32m"),
    FG_YELLOW("\u001B[33m"),
    FG_BLUE("\u001B[34m"),
    FG_MAGENTA("\u001B[35m"),
    FG_CYAN("\u001B[36m"),
    FG_WHITE("\u001B[37m"),
    FG_DEFAULT("\u001B[39m"),

    FG_BLACK_LIGHT("\u001B[90m"),
    FG_RED_LIGHT("\u001B[91m"),
    FG_GREEN_LIGHT("\u001B[92m"),
    FG_YELLOW_LIGHT("\u001B[93m"),
    FG_BLUE_LIGHT("\u001B[94m"),
    FG_MAGENTA_LIGHT("\u001B[95m"),
    FG_CYAN_LIGHT("\u001B[96m"),
    FG_WHITE_LIGHT("\u001B[97m"),
    FG_DEFAULT_LIGHT("\u001B[99m"),

    BG_BLACK("\u001B[40m"),
    BG_RED("\u001B[41m"),
    BG_GREEN("\u001B[42m"),
    BG_YELLOW("\u001B[43m"),
    BG_BLUE("\u001B[44m"),
    BG_MAGENTA("\u001B[45m"),
    BG_CYAN("\u001B[46m"),
    BG_WHITE("\u001B[47m"),
    BG_DEFAULT("\u001B[49m"),

    BG_BLACK_LIGHT("\u001B[100m"),
    BG_RED_LIGHT("\u001B[101m"),
    BG_GREEN_LIGHT("\u001B[102m"),
    BG_YELLOW_LIGHT("\u001B[103m"),
    BG_BLUE_LIGHT("\u001B[104m"),
    BG_MAGENTA_LIGHT("\u001B[105m"),
    BG_CYAN_LIGHT("\u001B[106m"),
    BG_WHITE_LIGHT("\u001B[107m"),
    BG_DEFAULT_LIGHT("\u001B[109m"),

    BOLD_ON("\u001B[1m"),
    BOLD_OFF("\u001B[21m"),
    DIM_ON("\u001B[2m"),
    DIM_OFF("\u001B[22m"),
    UNDERLINE_ON("\u001B[4m"),
    UNDERLINE_OFF("\u001B[24m");

    private String code;

    /**
     * Constructs a ConsoleANSICode enum constant with the specified ANSI escape code.
     *
     * @param code the ANSI escape code
     */
    ConsoleANSICode(String code) {
        this.code = code;
    }

    /**
     * Returns the ANSI escape code associated with this enum constant.
     *
     * @return the ANSI escape code
     */
    public String getCode() {
        return code;
    }

    /**
     * Returns a string representation of the ANSI escape code associated with this enum constant.
     *
     * @return a string representation of the ANSI escape code
     */
    @Override
    public String toString() {
        return code;
    }
}

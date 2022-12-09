package com.github.jdk15.jep378;


import lombok.extern.log4j.Log4j2;

@Log4j2
public final class TextBlocksSample1 {

    private static final String HTML = """
            <html>
                <body>
                    <p>Hello, world</p>
                </body>
            </html>
        """;

    private static final String SQL_QUERY = """
            SELECT "EMP_ID", "LAST_NAME" FROM "EMPLOYEE_TB"
            WHERE "CITY" = 'INDIANAPOLIS'
            ORDER BY "EMP_ID", "LAST_NAME";
        """;

    private static final String HTML_WITH_LINE_TERMINAL_ESCAPE = """
            <html> \
                <body> \
                    <p>Hello, world</p> \
                </body> \
            </html> \
        """;

    private static final String SQL_QUERY_WITH_SIMPLE_SPACE_ESCAPE = """
            SELECT "EMP_ID", "LAST_NAME" FROM "EMPLOYEE_TB" \s
            WHERE "CITY" = 'INDIANAPOLIS' \s
            ORDER BY "EMP_ID", "LAST_NAME"; \s
        """;

    private static final String HTML_REPLACE_P_TAG = HTML.replace("p", "div");

    public static void main(final String[] args) {

        log.info("HTML using text block feature: {}", HTML);
        log.info("SQL using text block feature: {}", SQL_QUERY);

        log.info("HTML using text block feature with line terminal escape: {}",
            HTML_WITH_LINE_TERMINAL_ESCAPE);
        log.info("SQL using text block feature with simple space escape: {}",
            SQL_QUERY_WITH_SIMPLE_SPACE_ESCAPE);

        log.info("HTML using text block feature and using method of String class: {}",
            HTML_REPLACE_P_TAG);

    }

}



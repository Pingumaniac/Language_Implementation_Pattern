package sql;

import org.stringtemplate.v4.AttributeRenderer;

import java.util.Locale;

public class TypeRenderer implements AttributeRenderer {
    @Override
    public String toString(Object o, String formatString, Locale locale) {
        if ("capitalized".equals(formatString)) {
            return capitalize(((Class<?>) o).getSimpleName());
        }
        return ((Class<?>) o).getSimpleName();
    }

    public static String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}

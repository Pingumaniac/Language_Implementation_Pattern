package sql;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DBGen {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("java DBGen [-sql|-java]");
            return;
        }
        String groupFile;
        if (args[0].equals("-sql")) groupFile = "SQL2.stg";
        else if (args[0].equals("-java")) groupFile = "persist.stg";
        else {
            System.err.println("java DBGen [-sql|-java]");
            return;
        }

        STGroup templates = new STGroupFile(groupFile);
        templates.registerRenderer(Class.class, new TypeRenderer());

        ST output = gen(templates, Person.class);
        System.out.println(output.render());
    }

    public static ST gen(STGroup templates, Class<?> c) {
        List<Field> fields = new ArrayList<>();
        List<Field> arrayFields = new ArrayList<>();
        Set<Class<?>> nonPrimitiveTypes = new HashSet<>();

        filterFields(c, fields, arrayFields, nonPrimitiveTypes);

        ST classST = templates.getInstanceOf("output");
        classST.add("class", c);
        classST.add("fields", fields);
        classST.add("arrayFields", arrayFields);
        classST.add("nonPrimitiveTypes", nonPrimitiveTypes);

        return classST;
    }

    protected static void filterFields(Class<?> c, List<Field> fields,
                                       List<Field> arrayFields,
                                       Set<Class<?>> nonPrimitiveTypes) {
        for (Field f : c.getFields()) {
            if (f.getType().isArray()) arrayFields.add(f);
            else {
                fields.add(f);
                if (!f.getType().isPrimitive()) {
                    nonPrimitiveTypes.add(f.getType());
                }
            }
        }
    }
}

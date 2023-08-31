package sql;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class GenSchema {
    STGroup templates;

    public static void main(String[] args) throws Exception {
        GenSchema gen = new GenSchema();
        ST schemaST = gen.genSchema(Person.class);
        System.out.println(schemaST.render());
    }

    public GenSchema() throws IOException {
        templates = new STGroupFile("SQL.stg");
    }

    public ST genSchema(Class<?> c) {
        List<Field> fields = new ArrayList<>();
        List<Field> arrayFields = new ArrayList<>();
        filterFields(c, fields, arrayFields);
        ST classST = templates.getInstanceOf("objectTables");
        classST.add("class", c);
        classST.add("fields", fields);
        classST.add("arrayFields", arrayFields);
        return classST;
    }

    protected void filterFields(Class<?> c, List<Field> fields, List<Field> arrayFields) {
        for (Field f : c.getFields()) {
            if (f.getType().isArray()) arrayFields.add(f);
            else fields.add(f);
        }
    }
}

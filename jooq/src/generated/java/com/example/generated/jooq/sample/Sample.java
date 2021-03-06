/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.sample;


import com.example.generated.jooq.DefaultCatalog;
import com.example.generated.jooq.sample.tables.FlywaySchemaHistory;
import com.example.generated.jooq.sample.tables.Greetings;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sample extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sample</code>
     */
    public static final Sample SAMPLE = new Sample();

    /**
     * The table <code>sample.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>sample.greetings</code>.
     */
    public final Greetings GREETINGS = Greetings.GREETINGS;

    /**
     * No further instances allowed
     */
    private Sample() {
        super("sample", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            Greetings.GREETINGS
        );
    }
}

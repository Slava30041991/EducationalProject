package lesson6;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({"Value1", "Value2", "Value1"})
class Number {
    public int Value1;
    public int Value2;
    public int Value3;

    public Number(int Value1, int Value2, int Value3) {
        this.Value1 = Value1;
        this.Value2 = Value2;
        this.Value3 = Value3;

    }
}

public class Table {
    public static void main(String[] args) throws IOException {
        List<Number> numbers = new ArrayList<>();
        numbers.add(new Number(100, 200, 123));
        numbers.add(new Number(300, 400, 500));


        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = mapper.schemaFor(Number.class).withColumnSeparator(';').withoutQuoteChar().withHeader();
        ObjectWriter writer = mapper.writer(schema);
        writer.writeValue(new FileWriter("test.csv", StandardCharsets.UTF_8), numbers);
    }
}
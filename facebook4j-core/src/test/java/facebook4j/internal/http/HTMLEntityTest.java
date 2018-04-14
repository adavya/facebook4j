package facebook4j.internal.http;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class HTMLEntityTest {

    @Test
    public void unescapeNull() {
        String nullString = null;
        assertNull(HTMLEntity.unescape(nullString));
    }
}

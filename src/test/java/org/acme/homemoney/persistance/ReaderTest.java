package org.acme.homemoney.persistance;

import org.junit.jupiter.api.Test;

class ReaderTest {

    @Test
    void test() {
        Reader r = new Reader();
        r.readQuickEntry();
    }

}
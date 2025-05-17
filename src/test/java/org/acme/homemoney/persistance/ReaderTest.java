package org.acme.homemoney.persistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    @Test
    void test() {
        Reader r = new Reader();
        r.readFile();
    }

}
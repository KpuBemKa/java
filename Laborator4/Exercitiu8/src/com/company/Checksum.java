package com.company;

public interface Checksum {
    void update(int b);

    void update(byte[] b, int off, int len);

    long getValue();

    void reset();
}
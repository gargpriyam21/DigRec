package com.example.digrec;

public interface Classifier {
    String name();

    Classification recognize(final float[] pixels);
}

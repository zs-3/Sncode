package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public interface Box {
    void getBox(java.nio.channels.WritableByteChannel r1) throws java.io.IOException;

    long getOffset();

    com.coremedia.iso.boxes.Container getParent();

    long getSize();

    java.lang.String getType();

    void parse(com.googlecode.mp4parser.DataSource r1, java.nio.ByteBuffer r2, long r3, com.coremedia.iso.BoxParser r5) throws java.io.IOException;

    void setParent(com.coremedia.iso.boxes.Container r1);
}

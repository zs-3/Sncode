package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public interface Container {
    java.util.List<com.coremedia.iso.boxes.Box> getBoxes();

    <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getBoxes(java.lang.Class<T> r1);

    <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getBoxes(java.lang.Class<T> r1, boolean r2);

    java.nio.ByteBuffer getByteBuffer(long r1, long r3) throws java.io.IOException;

    void setBoxes(java.util.List<com.coremedia.iso.boxes.Box> r1);

    void writeContainer(java.nio.channels.WritableByteChannel r1) throws java.io.IOException;
}

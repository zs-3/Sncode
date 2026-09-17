package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

/* loaded from: classes2.dex */
public abstract class GroupEntry {
    public GroupEntry() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.nio.ByteBuffer get();

    public abstract java.lang.String getType();

    public abstract void parse(java.nio.ByteBuffer r1);

    public int size() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.get()
            int r0 = r0.limit()
            return r0
    }
}

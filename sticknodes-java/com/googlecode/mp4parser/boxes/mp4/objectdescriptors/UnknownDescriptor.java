package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

/* loaded from: classes2.dex */
public class UnknownDescriptor extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor {
    private static java.util.logging.Logger log;
    private java.nio.ByteBuffer data;

    static {
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.UnknownDescriptor> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.UnknownDescriptor.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.UnknownDescriptor.log = r0
            return
    }

    public UnknownDescriptor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "sdjlhfl"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(java.nio.ByteBuffer r1) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = r1.slice()
            r0.data = r1
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.nio.ByteBuffer serialize() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "sdjlhfl"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UnknownDescriptor"
            r0.append(r1)
            java.lang.String r1 = "{tag="
            r0.append(r1)
            int r1 = r2.tag
            r0.append(r1)
            java.lang.String r1 = ", sizeOfInstance="
            r0.append(r1)
            int r1 = r2.sizeOfInstance
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            java.nio.ByteBuffer r1 = r2.data
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

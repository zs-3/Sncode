package com.mp4parser.streaming;

/* loaded from: classes2.dex */
public abstract class WriteOnlyBox implements com.coremedia.iso.boxes.Box {
    private com.coremedia.iso.boxes.Container parent;
    private final java.lang.String type;

    public WriteOnlyBox(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getOffset() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "It's a´write only box"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public com.coremedia.iso.boxes.Container getParent() {
            r1 = this;
            com.coremedia.iso.boxes.Container r0 = r1.parent
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r1, java.nio.ByteBuffer r2, long r3, com.coremedia.iso.BoxParser r5) throws java.io.IOException {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "It's a´write only box"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.coremedia.iso.boxes.Box
    public void setParent(com.coremedia.iso.boxes.Container r1) {
            r0 = this;
            r0.parent = r1
            return
    }
}

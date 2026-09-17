package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class UserDataBox extends com.googlecode.mp4parser.AbstractContainerBox {
    public static final java.lang.String TYPE = "udta";

    public UserDataBox() {
            r1 = this;
            java.lang.String r0 = "udta"
            r1.<init>(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r1) throws java.io.IOException {
            r0 = this;
            super.getBox(r1)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r1, java.nio.ByteBuffer r2, long r3, com.coremedia.iso.BoxParser r5) throws java.io.IOException {
            r0 = this;
            super.parse(r1, r2, r3, r5)
            return
    }
}

package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class NullMediaHeaderBox extends com.coremedia.iso.boxes.AbstractMediaHeaderBox {
    public static final java.lang.String TYPE = "nmhd";

    public NullMediaHeaderBox() {
            r1 = this;
            java.lang.String r0 = "nmhd"
            r1.<init>(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.parseVersionAndFlags(r1)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.writeVersionAndFlags(r1)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 4
            return r0
    }
}

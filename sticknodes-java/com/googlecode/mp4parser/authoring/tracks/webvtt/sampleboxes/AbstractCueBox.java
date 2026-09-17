package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

/* loaded from: classes2.dex */
public abstract class AbstractCueBox extends com.mp4parser.streaming.WriteOnlyBox {
    java.lang.String content;

    public AbstractCueBox(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = ""
            r0.content = r1
            return
    }

    @Override // com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r4) throws java.io.IOException {
            r3 = this;
            long r0 = r3.getSize()
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            long r1 = r3.getSize()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            java.lang.String r1 = r3.getType()
            byte[] r1 = com.coremedia.iso.IsoFile.fourCCtoBytes(r1)
            r0.put(r1)
            java.lang.String r1 = r3.content
            byte[] r1 = com.coremedia.iso.Utf8.convert(r1)
            r0.put(r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r4.write(r0)
            return
    }

    public java.lang.String getContent() {
            r1 = this;
            java.lang.String r0 = r1.content
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
            r2 = this;
            java.lang.String r0 = r2.content
            int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
            int r0 = r0 + 8
            long r0 = (long) r0
            return r0
    }

    public void setContent(java.lang.String r1) {
            r0 = this;
            r0.content = r1
            return
    }
}

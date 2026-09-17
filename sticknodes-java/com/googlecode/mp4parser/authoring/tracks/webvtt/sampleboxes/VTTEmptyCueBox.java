package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

/* loaded from: classes2.dex */
public class VTTEmptyCueBox extends com.mp4parser.streaming.WriteOnlyBox {
    public VTTEmptyCueBox() {
            r1 = this;
            java.lang.String r0 = "vtte"
            r1.<init>(r0)
            return
    }

    @Override // com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r4) throws java.io.IOException {
            r3 = this;
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            long r1 = r3.getSize()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            java.lang.String r1 = r3.getType()
            byte[] r1 = com.coremedia.iso.IsoFile.fourCCtoBytes(r1)
            r0.put(r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r4.write(r0)
            return
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
            r2 = this;
            r0 = 8
            return r0
    }
}

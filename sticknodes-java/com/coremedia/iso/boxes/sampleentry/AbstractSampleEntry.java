package com.coremedia.iso.boxes.sampleentry;

/* loaded from: classes.dex */
public abstract class AbstractSampleEntry extends com.googlecode.mp4parser.AbstractContainerBox implements com.coremedia.iso.boxes.sampleentry.SampleEntry {
    protected int dataReferenceIndex;

    protected AbstractSampleEntry(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.dataReferenceIndex = r1
            return
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public abstract void getBox(java.nio.channels.WritableByteChannel r1) throws java.io.IOException;

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
            r1 = this;
            int r0 = r1.dataReferenceIndex
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public abstract void parse(com.googlecode.mp4parser.DataSource r1, java.nio.ByteBuffer r2, long r3, com.coremedia.iso.BoxParser r5) throws java.io.IOException;

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int r1) {
            r0 = this;
            r0.dataReferenceIndex = r1
            return
    }
}

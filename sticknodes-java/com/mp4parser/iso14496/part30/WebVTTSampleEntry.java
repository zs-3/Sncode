package com.mp4parser.iso14496.part30;

/* loaded from: classes2.dex */
public class WebVTTSampleEntry extends com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry {
    public static final java.lang.String TYPE = "wvtt";

    public WebVTTSampleEntry() {
            r1 = this;
            java.lang.String r0 = "wvtt"
            r1.<init>(r0)
            return
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r2) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.getHeader()
            r2.write(r0)
            r1.writeContainer(r2)
            return
    }

    public com.mp4parser.iso14496.part30.WebVTTConfigurationBox getConfig() {
            r1 = this;
            java.lang.String r0 = "vttC"
            com.coremedia.iso.boxes.Box r0 = com.googlecode.mp4parser.util.Path.getPath(r1, r0)
            com.mp4parser.iso14496.part30.WebVTTConfigurationBox r0 = (com.mp4parser.iso14496.part30.WebVTTConfigurationBox) r0
            return r0
    }

    public com.mp4parser.iso14496.part30.WebVTTSourceLabelBox getSourceLabel() {
            r1 = this;
            java.lang.String r0 = "vlab"
            com.coremedia.iso.boxes.Box r0 = com.googlecode.mp4parser.util.Path.getPath(r1, r0)
            com.mp4parser.iso14496.part30.WebVTTSourceLabelBox r0 = (com.mp4parser.iso14496.part30.WebVTTSourceLabelBox) r0
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r1, java.nio.ByteBuffer r2, long r3, com.coremedia.iso.BoxParser r5) throws java.io.IOException {
            r0 = this;
            r0.initContainer(r1, r3, r5)
            return
    }
}

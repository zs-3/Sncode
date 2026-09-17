package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

/* loaded from: classes2.dex */
public class VTTCueBox extends com.mp4parser.streaming.WriteOnlyBox {
    com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueIDBox cueIDBox;
    com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CuePayloadBox cuePayloadBox;
    com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSettingsBox cueSettingsBox;
    com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSourceIDBox cueSourceIDBox;
    com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueTimeBox cueTimeBox;

    public VTTCueBox() {
            r1 = this;
            java.lang.String r0 = "vtcc"
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
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSourceIDBox r0 = r3.cueSourceIDBox
            if (r0 == 0) goto L28
            r0.getBox(r4)
        L28:
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueIDBox r0 = r3.cueIDBox
            if (r0 == 0) goto L2f
            r0.getBox(r4)
        L2f:
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueTimeBox r0 = r3.cueTimeBox
            if (r0 == 0) goto L36
            r0.getBox(r4)
        L36:
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSettingsBox r0 = r3.cueSettingsBox
            if (r0 == 0) goto L3d
            r0.getBox(r4)
        L3d:
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CuePayloadBox r0 = r3.cuePayloadBox
            if (r0 == 0) goto L44
            r0.getBox(r4)
        L44:
            return
    }

    public com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueIDBox getCueIDBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueIDBox r0 = r1.cueIDBox
            return r0
    }

    public com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CuePayloadBox getCuePayloadBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CuePayloadBox r0 = r1.cuePayloadBox
            return r0
    }

    public com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSettingsBox getCueSettingsBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSettingsBox r0 = r1.cueSettingsBox
            return r0
    }

    public com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSourceIDBox getCueSourceIDBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSourceIDBox r0 = r1.cueSourceIDBox
            return r0
    }

    public com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueTimeBox getCueTimeBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueTimeBox r0 = r1.cueTimeBox
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
            r7 = this;
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSourceIDBox r0 = r7.cueSourceIDBox
            r1 = 0
            if (r0 == 0) goto Lb
            long r3 = r0.getSize()
            goto Lc
        Lb:
            r3 = r1
        Lc:
            r5 = 8
            long r3 = r3 + r5
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueIDBox r0 = r7.cueIDBox
            if (r0 == 0) goto L18
            long r5 = r0.getSize()
            goto L19
        L18:
            r5 = r1
        L19:
            long r3 = r3 + r5
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueTimeBox r0 = r7.cueTimeBox
            if (r0 == 0) goto L23
            long r5 = r0.getSize()
            goto L24
        L23:
            r5 = r1
        L24:
            long r3 = r3 + r5
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSettingsBox r0 = r7.cueSettingsBox
            if (r0 == 0) goto L2e
            long r5 = r0.getSize()
            goto L2f
        L2e:
            r5 = r1
        L2f:
            long r3 = r3 + r5
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CuePayloadBox r0 = r7.cuePayloadBox
            if (r0 == 0) goto L38
            long r1 = r0.getSize()
        L38:
            long r3 = r3 + r1
            return r3
    }

    public void setCueIDBox(com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueIDBox r1) {
            r0 = this;
            r0.cueIDBox = r1
            return
    }

    public void setCuePayloadBox(com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CuePayloadBox r1) {
            r0 = this;
            r0.cuePayloadBox = r1
            return
    }

    public void setCueSettingsBox(com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSettingsBox r1) {
            r0 = this;
            r0.cueSettingsBox = r1
            return
    }

    public void setCueSourceIDBox(com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSourceIDBox r1) {
            r0 = this;
            r0.cueSourceIDBox = r1
            return
    }

    public void setCueTimeBox(com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueTimeBox r1) {
            r0 = this;
            r0.cueTimeBox = r1
            return
    }
}

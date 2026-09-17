package com.googlecode.mp4parser.authoring;

/* loaded from: classes2.dex */
public abstract class AbstractTrack implements com.googlecode.mp4parser.authoring.Track {
    java.util.List<com.googlecode.mp4parser.authoring.Edit> edits;
    java.lang.String name;
    java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> sampleGroups;

    public AbstractTrack(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.edits = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.sampleGroups = r0
            r1.name = r2
            return
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long getDuration() {
            r7 = this;
            long[] r0 = r7.getSampleDurations()
            int r1 = r0.length
            r2 = 0
            r4 = 0
        L8:
            if (r4 < r1) goto Lb
            return r2
        Lb:
            r5 = r0[r4]
            long r2 = r2 + r5
            int r4 = r4 + 1
            goto L8
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Edit> getEdits() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Edit> r0 = r1.edits
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> getSampleGroups() {
            r1 = this;
            java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> r0 = r1.sampleGroups
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            r0 = 0
            return r0
    }
}

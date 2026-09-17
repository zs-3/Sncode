package com.googlecode.mp4parser.authoring;

/* loaded from: classes2.dex */
public interface Track extends java.io.Closeable {
    java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries();

    long getDuration();

    java.util.List<com.googlecode.mp4parser.authoring.Edit> getEdits();

    java.lang.String getHandler();

    java.lang.String getName();

    java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies();

    com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox();

    long[] getSampleDurations();

    java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> getSampleGroups();

    java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples();

    com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox();

    long[] getSyncSamples();

    com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData();
}

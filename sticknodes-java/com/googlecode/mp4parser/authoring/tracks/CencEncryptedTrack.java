package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public interface CencEncryptedTrack extends com.googlecode.mp4parser.authoring.Track {
    java.util.UUID getDefaultKeyId();

    java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> getSampleEncryptionEntries();

    boolean hasSubSampleEncryption();
}

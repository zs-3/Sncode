package com.google.android.gms.games.video;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "VideoCapabilitiesCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class VideoCapabilities extends com.google.android.gms.games.internal.zzc {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.video.VideoCapabilities> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isCameraSupported", id = 1)
    private final boolean zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isMicSupported", id = 2)
    private final boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isWriteStorageSupported", id = 3)
    private final boolean zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSupportedCaptureModes", id = 4)
    private final boolean[] zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSupportedQualityLevels", id = 5)
    private final boolean[] zze;

    static {
            com.google.android.gms.games.video.zza r0 = new com.google.android.gms.games.video.zza
            r0.<init>()
            com.google.android.gms.games.video.VideoCapabilities.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public VideoCapabilities(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean[] r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean[] r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.games.video.VideoCapabilities
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            com.google.android.gms.games.video.VideoCapabilities r5 = (com.google.android.gms.games.video.VideoCapabilities) r5
            boolean[] r2 = r5.getSupportedCaptureModes()
            boolean[] r3 = r4.getSupportedCaptureModes()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L6b
            boolean[] r2 = r5.getSupportedQualityLevels()
            boolean[] r3 = r4.getSupportedQualityLevels()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L6b
            boolean r2 = r5.isCameraSupported()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r4.isCameraSupported()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L6b
            boolean r2 = r5.isMicSupported()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r4.isMicSupported()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L6b
            boolean r5 = r5.isWriteStorageSupported()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r2 = r4.isWriteStorageSupported()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r5, r2)
            if (r5 == 0) goto L6b
            return r0
        L6b:
            return r1
    }

    public boolean[] getSupportedCaptureModes() {
            r1 = this;
            boolean[] r0 = r1.zzd
            return r0
    }

    public boolean[] getSupportedQualityLevels() {
            r1 = this;
            boolean[] r0 = r1.zze
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean[] r1 = r3.getSupportedCaptureModes()
            r2 = 0
            r0[r2] = r1
            boolean[] r1 = r3.getSupportedQualityLevels()
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.isCameraSupported()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            boolean r1 = r3.isMicSupported()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            boolean r1 = r3.isWriteStorageSupported()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public boolean isCameraSupported() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }

    public boolean isFullySupported(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 == 0) goto L1a
            boolean r0 = r1.zzb
            if (r0 == 0) goto L1a
            boolean r0 = r1.zzc
            if (r0 == 0) goto L1a
            boolean r2 = r1.supportsCaptureMode(r2)
            if (r2 == 0) goto L1a
            boolean r2 = r1.supportsQualityLevel(r3)
            if (r2 == 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public boolean isMicSupported() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }

    public boolean isWriteStorageSupported() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    public boolean supportsCaptureMode(int r2) {
            r1 = this;
            r0 = 0
            boolean r0 = com.google.android.gms.games.video.VideoConfiguration.isValidCaptureMode(r2, r0)
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            boolean[] r0 = r1.zzd
            boolean r2 = r0[r2]
            return r2
    }

    public boolean supportsQualityLevel(int r2) {
            r1 = this;
            r0 = 0
            boolean r0 = com.google.android.gms.games.video.VideoConfiguration.isValidQualityLevel(r2, r0)
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            boolean[] r0 = r1.zze
            boolean r2 = r0[r2]
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            boolean[] r1 = r3.getSupportedCaptureModes()
            java.lang.String r2 = "SupportedCaptureModes"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean[] r1 = r3.getSupportedQualityLevels()
            java.lang.String r2 = "SupportedQualityLevels"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.isCameraSupported()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "CameraSupported"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.isMicSupported()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "MicSupported"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.isWriteStorageSupported()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "StorageWriteSupported"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            boolean r0 = r3.isCameraSupported()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            boolean r0 = r3.isMicSupported()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            boolean r0 = r3.isWriteStorageSupported()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            boolean[] r0 = r3.getSupportedCaptureModes()
            r1 = 4
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(r4, r1, r0, r2)
            boolean[] r0 = r3.getSupportedQualityLevels()
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}

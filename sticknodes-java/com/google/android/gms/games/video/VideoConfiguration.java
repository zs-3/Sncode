package com.google.android.gms.games.video;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "VideoConfigurationCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class VideoConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int CAPTURE_MODE_FILE = 0;
    public static final int CAPTURE_MODE_STREAM = 1;
    public static final int CAPTURE_MODE_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.video.VideoConfiguration> CREATOR = null;
    public static final int NUM_CAPTURE_MODE = 2;
    public static final int NUM_QUALITY_LEVEL = 4;
    public static final int QUALITY_LEVEL_FULLHD = 3;
    public static final int QUALITY_LEVEL_HD = 1;
    public static final int QUALITY_LEVEL_SD = 0;
    public static final int QUALITY_LEVEL_UNKNOWN = -1;
    public static final int QUALITY_LEVEL_XHD = 2;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getQualityLevel", id = 1)
    private final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCaptureMode", id = 2)
    private final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "shouldShowToastAfterRecording", id = 7)
    private final boolean zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCameraEnabled", id = 8)
    private final boolean zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMicEnabled", id = 9)
    private final boolean zze;

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    public static final class Builder {
        private int zza;
        private int zzb;
        private boolean zzc;
        private boolean zzd;
        private boolean zze;

        public Builder(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                r1 = 1
                r0.zzd = r1
                r0.zze = r1
                r0.zzc = r1
                return
        }

        public com.google.android.gms.games.video.VideoConfiguration build() {
                r7 = this;
                com.google.android.gms.games.video.VideoConfiguration r6 = new com.google.android.gms.games.video.VideoConfiguration
                int r1 = r7.zza
                int r2 = r7.zzb
                boolean r3 = r7.zzc
                boolean r4 = r7.zzd
                boolean r5 = r7.zze
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        public com.google.android.gms.games.video.VideoConfiguration.Builder setCameraEnabled(boolean r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        public com.google.android.gms.games.video.VideoConfiguration.Builder setCaptureMode(int r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.games.video.VideoConfiguration.Builder setMicEnabled(boolean r1) {
                r0 = this;
                r0.zze = r1
                return r0
        }

        public com.google.android.gms.games.video.VideoConfiguration.Builder setQualityLevel(int r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ValidCaptureModes {
    }

    static {
            com.google.android.gms.games.video.zzb r0 = new com.google.android.gms.games.video.zzb
            r0.<init>()
            com.google.android.gms.games.video.VideoConfiguration.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public VideoConfiguration(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) boolean r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) boolean r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            boolean r1 = isValidQualityLevel(r3, r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            boolean r0 = isValidCaptureMode(r4, r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r6
            r2.zze = r7
            return
    }

    public static boolean isValidCaptureMode(int r1, boolean r2) {
            r0 = -1
            if (r1 == r0) goto La
            r2 = 1
            if (r1 == 0) goto La
            if (r1 == r2) goto La
            r1 = 0
            return r1
        La:
            return r2
    }

    public static boolean isValidQualityLevel(int r1, boolean r2) {
            r0 = -1
            if (r1 == r0) goto L10
            r2 = 1
            if (r1 == 0) goto L10
            if (r1 == r2) goto L10
            r0 = 2
            if (r1 == r0) goto L10
            r0 = 3
            if (r1 == r0) goto L10
            r1 = 0
            return r1
        L10:
            return r2
    }

    public boolean getCameraEnabled() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    public int getCaptureMode() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public boolean getMicEnabled() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    public int getQualityLevel() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            int r0 = r2.getQualityLevel()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            int r0 = r2.getCaptureMode()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            boolean r0 = r2.zzc
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
            boolean r0 = r2.getCameraEnabled()
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
            boolean r0 = r2.getMicEnabled()
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}

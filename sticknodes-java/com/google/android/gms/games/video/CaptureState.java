package com.google.android.gms.games.video;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class CaptureState {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final boolean zze;

    private CaptureState(boolean r3, int r4, int r5, boolean r6, boolean r7) {
            r2 = this;
            r2.<init>()
            r0 = 1
            boolean r1 = com.google.android.gms.games.video.VideoConfiguration.isValidCaptureMode(r4, r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            boolean r0 = com.google.android.gms.games.video.VideoConfiguration.isValidQualityLevel(r5, r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r6
            r2.zze = r7
            return
    }

    public static com.google.android.gms.games.video.CaptureState zza(android.os.Bundle r8) {
            if (r8 == 0) goto L31
            java.lang.String r0 = "IsCapturing"
            java.lang.Object r1 = r8.get(r0)
            if (r1 != 0) goto Lb
            goto L31
        Lb:
            com.google.android.gms.games.video.CaptureState r1 = new com.google.android.gms.games.video.CaptureState
            r2 = 0
            boolean r3 = r8.getBoolean(r0, r2)
            java.lang.String r0 = "CaptureMode"
            r4 = -1
            int r0 = r8.getInt(r0, r4)
            java.lang.String r5 = "CaptureQuality"
            int r5 = r8.getInt(r5, r4)
            java.lang.String r4 = "IsOverlayVisible"
            boolean r6 = r8.getBoolean(r4, r2)
            java.lang.String r4 = "IsPaused"
            boolean r7 = r8.getBoolean(r4, r2)
            r2 = r1
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        L31:
            r8 = 0
            return r8
    }

    public int getCaptureMode() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public int getCaptureQuality() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public boolean isCapturing() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }

    public boolean isOverlayVisible() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    public boolean isPaused() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            boolean r1 = r3.zza
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "IsCapturing"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CaptureMode"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CaptureQuality"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zzd
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "IsOverlayVisible"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r1 = r3.zze
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "IsPaused"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

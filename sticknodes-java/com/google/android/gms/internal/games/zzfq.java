package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzfq {
    public android.os.IBinder zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzfq(int r1, android.os.IBinder r2) {
            r0 = this;
            r0.<init>()
            r2 = -1
            r0.zzc = r2
            r2 = 0
            r0.zzd = r2
            r0.zze = r2
            r0.zzf = r2
            r0.zzg = r2
            r0.zzb = r1
            r1 = 0
            r0.zza = r1
            return
    }

    public final android.os.Bundle zza() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.zzb
            java.lang.String r2 = "popupLocationInfo.gravity"
            r0.putInt(r2, r1)
            int r1 = r3.zzc
            java.lang.String r2 = "popupLocationInfo.displayId"
            r0.putInt(r2, r1)
            int r1 = r3.zzd
            java.lang.String r2 = "popupLocationInfo.left"
            r0.putInt(r2, r1)
            int r1 = r3.zze
            java.lang.String r2 = "popupLocationInfo.top"
            r0.putInt(r2, r1)
            int r1 = r3.zzf
            java.lang.String r2 = "popupLocationInfo.right"
            r0.putInt(r2, r1)
            int r1 = r3.zzg
            java.lang.String r2 = "popupLocationInfo.bottom"
            r0.putInt(r2, r1)
            return r0
    }
}

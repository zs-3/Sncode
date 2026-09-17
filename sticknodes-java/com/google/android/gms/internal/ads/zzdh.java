package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdh {
    private static final java.lang.String zzd = null;
    private static final java.lang.String zze = null;
    private static final java.lang.String zzf = null;
    public final int zza;
    public final int zzb;
    public final int zzc;

    static {
            r0 = 0
            r1 = 36
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            com.google.android.gms.internal.ads.zzdh.zzd = r0
            r0 = 1
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            com.google.android.gms.internal.ads.zzdh.zze = r0
            r0 = 2
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            com.google.android.gms.internal.ads.zzdh.zzf = r0
            return
    }

    public zzdh(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final android.os.Bundle zza() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzdh.zzd
            int r2 = r3.zza
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzdh.zze
            int r2 = r3.zzb
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzdh.zzf
            int r2 = r3.zzc
            r0.putInt(r1, r2)
            return r0
    }
}

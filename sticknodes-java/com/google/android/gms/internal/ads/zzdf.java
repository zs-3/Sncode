package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdf {
    private static final java.lang.String zzc = null;
    private static final java.lang.String zzd = null;
    public final java.lang.String zza;
    public final int zzb;

    static {
            r0 = 0
            r1 = 36
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            com.google.android.gms.internal.ads.zzdf.zzc = r0
            r0 = 1
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            com.google.android.gms.internal.ads.zzdf.zzd = r0
            return
    }

    public zzdf(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final android.os.Bundle zza() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzdf.zzc
            java.lang.String r2 = r3.zza
            r0.putString(r1, r2)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzdf.zzd
            int r2 = r3.zzb
            r0.putInt(r1, r2)
            return r0
    }
}

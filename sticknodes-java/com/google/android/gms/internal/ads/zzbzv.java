package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbzv {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbzw zza;
    private long zzb;
    private long zzc;

    public zzbzv(com.google.android.gms.internal.ads.zzbzw r3) {
            r2 = this;
            r2.zza = r3
            r2.<init>()
            r0 = -1
            r2.zzb = r0
            r2.zzc = r0
            return
    }

    public final long zza() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    public final android.os.Bundle zzb() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            long r1 = r4.zzb
            java.lang.String r3 = "topen"
            r0.putLong(r3, r1)
            long r1 = r4.zzc
            java.lang.String r3 = "tclose"
            r0.putLong(r3, r1)
            return r0
    }

    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbzw r0 = r2.zza
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.internal.ads.zzbzw.zzb(r0)
            long r0 = r0.elapsedRealtime()
            r2.zzc = r0
            return
    }

    public final void zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbzw r0 = r2.zza
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.internal.ads.zzbzw.zzb(r0)
            long r0 = r0.elapsedRealtime()
            r2.zzb = r0
            return
    }
}

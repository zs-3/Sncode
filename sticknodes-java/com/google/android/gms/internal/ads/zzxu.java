package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzxu implements java.lang.Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxu(com.google.android.gms.internal.ads.zzaf r3, int r4) {
            r2 = this;
            r2.<init>()
            int r3 = r3.zze
            r0 = 1
            r3 = r3 & r0
            r1 = 0
            if (r0 == r3) goto Lb
            r0 = 0
        Lb:
            r2.zza = r0
            boolean r3 = com.google.android.gms.internal.ads.zzls.zza(r4, r1)
            r2.zzb = r3
            return
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzxu r1 = (com.google.android.gms.internal.ads.zzxu) r1
            int r1 = r0.zza(r1)
            return r1
    }

    public final int zza(com.google.android.gms.internal.ads.zzxu r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgam r0 = com.google.android.gms.internal.ads.zzgam.zzj()
            boolean r1 = r3.zzb
            boolean r2 = r4.zzb
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzd(r1, r2)
            boolean r1 = r3.zza
            boolean r4 = r4.zza
            com.google.android.gms.internal.ads.zzgam r4 = r0.zzd(r1, r4)
            int r4 = r4.zza()
            return r4
    }
}

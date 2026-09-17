package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.ShowFirstParty
/* loaded from: classes.dex */
public final class zzfrk {
    private final android.content.Context zza;
    private final android.os.Looper zzb;

    public zzfrk(android.content.Context r1, android.os.Looper r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final void zza(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfry r0 = com.google.android.gms.internal.ads.zzfsa.zza()
            android.content.Context r1 = r3.zza
            java.lang.String r1 = r1.getPackageName()
            r0.zza(r1)
            r1 = 2
            r0.zzc(r1)
            com.google.android.gms.internal.ads.zzfrv r2 = com.google.android.gms.internal.ads.zzfrw.zza()
            r2.zza(r4)
            r2.zzb(r1)
            r0.zzb(r2)
            com.google.android.gms.internal.ads.zzhbe r4 = r0.zzbn()
            com.google.android.gms.internal.ads.zzfsa r4 = (com.google.android.gms.internal.ads.zzfsa) r4
            com.google.android.gms.internal.ads.zzfrl r0 = new com.google.android.gms.internal.ads.zzfrl
            android.content.Context r1 = r3.zza
            android.os.Looper r2 = r3.zzb
            r0.<init>(r1, r2, r4)
            r0.zza()
            return
    }
}

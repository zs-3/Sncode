package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgn implements com.google.android.gms.internal.ads.zzgf {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgf zzb;

    public zzgn(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgp r0 = new com.google.android.gms.internal.ads.zzgp
            r0.<init>()
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.zza = r2
            r1.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgg zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgo r0 = new com.google.android.gms.internal.ads.zzgo
            com.google.android.gms.internal.ads.zzgf r1 = r3.zzb
            com.google.android.gms.internal.ads.zzgp r1 = (com.google.android.gms.internal.ads.zzgp) r1
            com.google.android.gms.internal.ads.zzgu r1 = r1.zzg()
            android.content.Context r2 = r3.zza
            r0.<init>(r2, r1)
            return r0
    }
}

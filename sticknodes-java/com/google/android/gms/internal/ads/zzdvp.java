package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdvp implements com.google.android.gms.internal.ads.zzdvd {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzeoj zzb;

    zzdvp(long r1, android.content.Context r3, com.google.android.gms.internal.ads.zzdvi r4, com.google.android.gms.internal.ads.zzcho r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.internal.ads.zzfem r1 = r5.zzv()
            r1.zzc(r3)
            com.google.android.gms.ads.internal.client.zzs r2 = new com.google.android.gms.ads.internal.client.zzs
            r2.<init>()
            r1.zza(r2)
            r1.zzb(r6)
            com.google.android.gms.internal.ads.zzfen r1 = r1.zzd()
            com.google.android.gms.internal.ads.zzeoj r1 = r1.zza()
            r0.zzb = r1
            com.google.android.gms.internal.ads.zzdvo r2 = new com.google.android.gms.internal.ads.zzdvo
            r2.<init>(r0, r4)
            r1.zzD(r2)
            return
    }

    static /* bridge */ /* synthetic */ long zzd(com.google.android.gms.internal.ads.zzdvp r2) {
            long r0 = r2.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzeoj r0 = r1.zzb
            r0.zzx()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zzb(com.google.android.gms.ads.internal.client.zzm r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeoj r0 = r1.zzb
            r0.zzab(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeoj r0 = r2.zzb
            r1 = 0
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)
            r0.zzW(r1)
            return
    }
}

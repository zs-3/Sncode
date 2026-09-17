package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdzz implements com.google.android.gms.internal.ads.zzday {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzbyz zzb;

    zzdzz(android.content.Context r1, com.google.android.gms.internal.ads.zzbyz r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(com.google.android.gms.internal.ads.zzbwa r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(com.google.android.gms.internal.ads.zzfgt r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            java.lang.String r0 = r0.zze
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L26
            com.google.android.gms.internal.ads.zzbyz r0 = r3.zzb
            android.content.Context r1 = r3.zza
            com.google.android.gms.internal.ads.zzfgq r2 = r4.zza
            com.google.android.gms.internal.ads.zzfhc r2 = r2.zza
            com.google.android.gms.ads.internal.client.zzm r2 = r2.zzd
            r0.zzm(r1, r2)
            com.google.android.gms.internal.ads.zzbyz r0 = r3.zzb
            android.content.Context r1 = r3.zza
            com.google.android.gms.internal.ads.zzfgs r4 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r4 = r4.zzb
            java.lang.String r4 = r4.zze
            r0.zzi(r1, r4)
        L26:
            return
    }
}

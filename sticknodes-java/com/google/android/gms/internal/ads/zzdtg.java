package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdtg implements com.google.android.gms.internal.ads.zzflh {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzbbu zzb;

    zzdtg(com.google.android.gms.internal.ads.zzbbu r1, java.util.Map r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzd(com.google.android.gms.internal.ads.zzfla r2, java.lang.String r3) {
            r1 = this;
            java.util.Map r3 = r1.zza
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L17
            com.google.android.gms.internal.ads.zzbbu r3 = r1.zzb
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzdtf r2 = (com.google.android.gms.internal.ads.zzdtf) r2
            int r2 = r2.zzb
            r3.zzc(r2)
        L17:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdC(com.google.android.gms.internal.ads.zzfla r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdD(com.google.android.gms.internal.ads.zzfla r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            java.util.Map r2 = r0.zza
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L17
            com.google.android.gms.internal.ads.zzbbu r2 = r0.zzb
            java.util.Map r3 = r0.zza
            java.lang.Object r1 = r3.get(r1)
            com.google.android.gms.internal.ads.zzdtf r1 = (com.google.android.gms.internal.ads.zzdtf) r1
            int r1 = r1.zzc
            r2.zzc(r1)
        L17:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdE(com.google.android.gms.internal.ads.zzfla r2, java.lang.String r3) {
            r1 = this;
            java.util.Map r3 = r1.zza
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L17
            com.google.android.gms.internal.ads.zzbbu r3 = r1.zzb
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzdtf r2 = (com.google.android.gms.internal.ads.zzdtf) r2
            int r2 = r2.zza
            r3.zzc(r2)
        L17:
            return
    }
}

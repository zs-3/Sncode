package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzduc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdud zza;
    private final java.util.Map zzb;

    zzduc(com.google.android.gms.internal.ads.zzdud r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzduc zza(com.google.android.gms.internal.ads.zzduc r2) {
            com.google.android.gms.internal.ads.zzdud r0 = r2.zza
            java.util.Map r1 = r2.zzb
            java.util.Map r0 = com.google.android.gms.internal.ads.zzdud.zzc(r0)
            r1.putAll(r0)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzduc zzb(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L11
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L11
            java.util.Map r0 = r1.zzb
            r0.put(r2, r3)
        L11:
            return r1
    }

    public final com.google.android.gms.internal.ads.zzduc zzc(com.google.android.gms.internal.ads.zzfgh r3) {
            r2 = this;
            java.lang.String r0 = r3.zzw
            java.lang.String r1 = "aai"
            r2.zzb(r1, r0)
            java.lang.String r0 = r3.zzan
            java.lang.String r1 = "request_id"
            r2.zzb(r1, r0)
            int r3 = r3.zzb
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfgh.zza(r3)
            java.lang.String r0 = "ad_format"
            r2.zzb(r0, r3)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzduc zzd(com.google.android.gms.internal.ads.zzfgk r2) {
            r1 = this;
            java.lang.String r2 = r2.zzb
            java.lang.String r0 = "gqi"
            r1.zzb(r0, r2)
            return r1
    }

    public final java.lang.String zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdud r0 = r2.zza
            com.google.android.gms.internal.ads.zzdui r0 = com.google.android.gms.internal.ads.zzdud.zzb(r0)
            java.util.Map r1 = r2.zzb
            java.lang.String r0 = r0.zzb(r1)
            return r0
    }

    public final void zzf() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdud r0 = r2.zza
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzdud.zzd(r0)
            com.google.android.gms.internal.ads.zzdua r1 = new com.google.android.gms.internal.ads.zzdua
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    public final void zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdud r0 = r2.zza
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzdud.zzd(r0)
            com.google.android.gms.internal.ads.zzdub r1 = new com.google.android.gms.internal.ads.zzdub
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    final /* synthetic */ void zzh() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdud r0 = r2.zza
            com.google.android.gms.internal.ads.zzdui r0 = com.google.android.gms.internal.ads.zzdud.zzb(r0)
            java.util.Map r1 = r2.zzb
            r0.zzf(r1)
            return
    }

    final /* synthetic */ void zzi() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdud r0 = r2.zza
            com.google.android.gms.internal.ads.zzdui r0 = com.google.android.gms.internal.ads.zzdud.zzb(r0)
            java.util.Map r1 = r2.zzb
            r0.zze(r1)
            return
    }
}

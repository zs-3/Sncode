package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdud {
    private final com.google.android.gms.internal.ads.zzdui zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.Map zzc;

    public zzdud(com.google.android.gms.internal.ads.zzdui r1, java.util.concurrent.Executor r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.util.Map r1 = r1.zza()
            r0.zzc = r1
            r0.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdui zzb(com.google.android.gms.internal.ads.zzdud r0) {
            com.google.android.gms.internal.ads.zzdui r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzc(com.google.android.gms.internal.ads.zzdud r0) {
            java.util.Map r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Executor zzd(com.google.android.gms.internal.ads.zzdud r0) {
            java.util.concurrent.Executor r0 = r0.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzduc zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzduc r0 = new com.google.android.gms.internal.ads.zzduc
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzduc.zza(r0)
            return r0
    }

    public final void zze() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlm
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            com.google.android.gms.internal.ads.zzduc r0 = r3.zza()
            java.lang.String r1 = "action"
            java.lang.String r2 = "pecr"
            r0.zzb(r1, r2)
            r0.zzf()
            return
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdoo {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzcpw zzb;
    private final com.google.android.gms.internal.ads.zzdfu zzc;
    private final com.google.android.gms.internal.ads.zzcop zzd;

    zzdoo(java.util.concurrent.Executor r1, com.google.android.gms.internal.ads.zzcpw r2, com.google.android.gms.internal.ads.zzdfu r3, com.google.android.gms.internal.ads.zzcop r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r3
            r0.zzb = r2
            r0.zzd = r4
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzcfo r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            com.google.android.gms.internal.ads.zzdfu r0 = r3.zzc
            android.view.View r1 = r4.zzF()
            r0.zza(r1)
            com.google.android.gms.internal.ads.zzdfu r0 = r3.zzc
            com.google.android.gms.internal.ads.zzdok r1 = new com.google.android.gms.internal.ads.zzdok
            r1.<init>(r4)
            java.util.concurrent.Executor r2 = r3.zza
            r0.zzo(r1, r2)
            com.google.android.gms.internal.ads.zzdfu r0 = r3.zzc
            com.google.android.gms.internal.ads.zzdol r1 = new com.google.android.gms.internal.ads.zzdol
            r1.<init>(r4)
            java.util.concurrent.Executor r2 = r3.zza
            r0.zzo(r1, r2)
            com.google.android.gms.internal.ads.zzdfu r0 = r3.zzc
            com.google.android.gms.internal.ads.zzcpw r1 = r3.zzb
            java.util.concurrent.Executor r2 = r3.zza
            r0.zzo(r1, r2)
            com.google.android.gms.internal.ads.zzcpw r0 = r3.zzb
            r0.zzf(r4)
            com.google.android.gms.internal.ads.zzchg r0 = r4.zzN()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzjL
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L55
            if (r0 == 0) goto L55
            com.google.android.gms.internal.ads.zzcop r1 = r3.zzd
            r0.zzJ(r1)
            com.google.android.gms.internal.ads.zzcop r1 = r3.zzd
            r2 = 0
            r0.zzK(r1, r2, r2)
        L55:
            com.google.android.gms.internal.ads.zzdom r0 = new com.google.android.gms.internal.ads.zzdom
            r0.<init>(r3)
            java.lang.String r1 = "/trackActiveViewUnit"
            r4.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzdon r0 = new com.google.android.gms.internal.ads.zzdon
            r0.<init>(r3)
            java.lang.String r1 = "/untrackActiveViewUnit"
            r4.zzag(r1, r0)
            return
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcfo r1, java.util.Map r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcpw r1 = r0.zzb
            r1.zzb()
            return
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzcfo r1, java.util.Map r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcpw r1 = r0.zzb
            r1.zza()
            return
    }
}

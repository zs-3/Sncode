package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdmo implements com.google.android.gms.internal.ads.zzcyu {
    private final com.google.android.gms.internal.ads.zzdkp zza;
    private final com.google.android.gms.internal.ads.zzdku zzb;
    private final java.util.concurrent.Executor zzc;
    private final java.util.concurrent.Executor zzd;

    public zzdmo(com.google.android.gms.internal.ads.zzdkp r1, com.google.android.gms.internal.ads.zzdku r2, java.util.concurrent.Executor r3, java.util.concurrent.Executor r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzdmo r0, com.google.android.gms.internal.ads.zzcfo r1) {
            r0.zzb(r1)
            return
    }

    private final void zzb(com.google.android.gms.internal.ads.zzcfo r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdmm r0 = new com.google.android.gms.internal.ads.zzdmm
            r0.<init>(r2)
            java.util.concurrent.Executor r2 = r1.zzc
            r2.execute(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
            r4 = this;
            com.google.android.gms.internal.ads.zzdku r0 = r4.zzb
            boolean r0 = r0.zzd()
            if (r0 != 0) goto L9
            goto L68
        L9:
            com.google.android.gms.internal.ads.zzdkp r0 = r4.zza
            com.google.android.gms.internal.ads.zzegf r1 = r0.zzu()
            if (r1 != 0) goto L4f
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzw()
            if (r0 == 0) goto L4f
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfd
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4f
            com.google.android.gms.internal.ads.zzdkp r0 = r4.zza
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzw()
            com.google.android.gms.internal.ads.zzcas r0 = r0.zzp()
            if (r1 == 0) goto L68
            if (r0 == 0) goto L68
            r2 = 2
            com.google.common.util.concurrent.ListenableFuture[] r2 = new com.google.common.util.concurrent.ListenableFuture[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzl(r2)
            com.google.android.gms.internal.ads.zzdmn r1 = new com.google.android.gms.internal.ads.zzdmn
            r1.<init>(r4)
            java.util.concurrent.Executor r2 = r4.zzd
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r2)
            return
        L4f:
            if (r1 == 0) goto L68
            com.google.android.gms.internal.ads.zzdkp r0 = r4.zza
            com.google.android.gms.internal.ads.zzcfo r1 = r0.zzr()
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzs()
            if (r1 == 0) goto L5e
            goto L63
        L5e:
            if (r0 == 0) goto L62
            r1 = r0
            goto L63
        L62:
            r1 = 0
        L63:
            if (r1 == 0) goto L68
            r4.zzb(r1)
        L68:
            return
    }
}

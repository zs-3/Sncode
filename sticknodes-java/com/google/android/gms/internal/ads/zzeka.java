package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeka extends com.google.android.gms.internal.ads.zzejt {
    private final com.google.android.gms.internal.ads.zzcho zza;
    private final com.google.android.gms.internal.ads.zzcxi zzb;
    private final com.google.android.gms.internal.ads.zzddu zzc;
    private final com.google.android.gms.internal.ads.zzeke zzd;
    private final com.google.android.gms.internal.ads.zzfgu zze;
    private final com.google.android.gms.internal.ads.zzegp zzf;

    public zzeka(com.google.android.gms.internal.ads.zzcho r1, com.google.android.gms.internal.ads.zzcxi r2, com.google.android.gms.internal.ads.zzddu r3, com.google.android.gms.internal.ads.zzfgu r4, com.google.android.gms.internal.ads.zzeke r5, com.google.android.gms.internal.ads.zzegp r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zze = r4
            r0.zzd = r5
            r0.zzf = r6
            return
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    protected final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfhc r2, android.os.Bundle r3, com.google.android.gms.internal.ads.zzfgh r4, com.google.android.gms.internal.ads.zzfgt r5) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcxi r0 = r1.zzb
            r0.zzi(r2)
            r0.zzf(r3)
            com.google.android.gms.internal.ads.zzcxc r2 = new com.google.android.gms.internal.ads.zzcxc
            com.google.android.gms.internal.ads.zzeke r3 = r1.zzd
            r2.<init>(r5, r4, r3)
            r0.zzg(r2)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzdy
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.zzfgu r2 = r1.zze
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.zzcxi r3 = r1.zzb
            r3.zzh(r2)
        L2d:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzdz
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L46
            com.google.android.gms.internal.ads.zzcxi r2 = r1.zzb
            com.google.android.gms.internal.ads.zzegp r3 = r1.zzf
            r2.zzd(r3)
        L46:
            com.google.android.gms.internal.ads.zzcho r2 = r1.zza
            com.google.android.gms.internal.ads.zzcxi r3 = r1.zzb
            com.google.android.gms.internal.ads.zzdqm r2 = r2.zzi()
            com.google.android.gms.internal.ads.zzcxk r3 = r3.zzj()
            r2.zzd(r3)
            com.google.android.gms.internal.ads.zzddu r3 = r1.zzc
            r2.zzc(r3)
            com.google.android.gms.internal.ads.zzdqn r2 = r2.zze()
            com.google.android.gms.internal.ads.zzcum r2 = r2.zzb()
            com.google.common.util.concurrent.ListenableFuture r3 = r2.zzj()
            com.google.common.util.concurrent.ListenableFuture r2 = r2.zzi(r3)
            return r2
    }
}

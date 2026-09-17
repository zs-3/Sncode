package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzejw extends com.google.android.gms.internal.ads.zzejt {
    private final com.google.android.gms.internal.ads.zzcho zza;
    private final com.google.android.gms.internal.ads.zzcxi zzb;
    private final com.google.android.gms.internal.ads.zzemk zzc;
    private final com.google.android.gms.internal.ads.zzddu zzd;
    private final com.google.android.gms.internal.ads.zzdit zze;
    private final com.google.android.gms.internal.ads.zzdat zzf;
    private final android.view.ViewGroup zzg;
    private final com.google.android.gms.internal.ads.zzdcz zzh;
    private final com.google.android.gms.internal.ads.zzeke zzi;
    private final com.google.android.gms.internal.ads.zzegp zzj;

    public zzejw(com.google.android.gms.internal.ads.zzcho r1, com.google.android.gms.internal.ads.zzcxi r2, com.google.android.gms.internal.ads.zzemk r3, com.google.android.gms.internal.ads.zzddu r4, com.google.android.gms.internal.ads.zzdit r5, com.google.android.gms.internal.ads.zzdat r6, android.view.ViewGroup r7, com.google.android.gms.internal.ads.zzdcz r8, com.google.android.gms.internal.ads.zzeke r9, com.google.android.gms.internal.ads.zzegp r10) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            return
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    protected final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfhc r2, android.os.Bundle r3, com.google.android.gms.internal.ads.zzfgh r4, com.google.android.gms.internal.ads.zzfgt r5) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcxi r0 = r1.zzb
            r0.zzi(r2)
            r0.zzf(r3)
            com.google.android.gms.internal.ads.zzcxc r2 = new com.google.android.gms.internal.ads.zzcxc
            com.google.android.gms.internal.ads.zzeke r3 = r1.zzi
            r2.<init>(r5, r4, r3)
            r0.zzg(r2)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzdz
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.ads.zzcxi r2 = r1.zzb
            com.google.android.gms.internal.ads.zzegp r3 = r1.zzj
            r2.zzd(r3)
        L2b:
            com.google.android.gms.internal.ads.zzcho r2 = r1.zza
            com.google.android.gms.internal.ads.zzcxi r3 = r1.zzb
            com.google.android.gms.internal.ads.zzcru r2 = r2.zze()
            com.google.android.gms.internal.ads.zzcxk r3 = r3.zzj()
            r2.zzi(r3)
            com.google.android.gms.internal.ads.zzddu r3 = r1.zzd
            r2.zzf(r3)
            com.google.android.gms.internal.ads.zzemk r3 = r1.zzc
            r2.zze(r3)
            com.google.android.gms.internal.ads.zzdit r3 = r1.zze
            r2.zzd(r3)
            com.google.android.gms.internal.ads.zzdat r3 = r1.zzf
            com.google.android.gms.internal.ads.zzdcz r4 = r1.zzh
            com.google.android.gms.internal.ads.zzcsw r5 = new com.google.android.gms.internal.ads.zzcsw
            r5.<init>(r3, r4)
            r2.zzg(r5)
            android.view.ViewGroup r3 = r1.zzg
            com.google.android.gms.internal.ads.zzcqo r4 = new com.google.android.gms.internal.ads.zzcqo
            r4.<init>(r3)
            r2.zzc(r4)
            com.google.android.gms.internal.ads.zzcrv r2 = r2.zzk()
            com.google.android.gms.internal.ads.zzcum r2 = r2.zzd()
            com.google.common.util.concurrent.ListenableFuture r3 = r2.zzj()
            com.google.common.util.concurrent.ListenableFuture r2 = r2.zzi(r3)
            return r2
    }
}

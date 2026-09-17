package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcxe {
    private final com.google.android.gms.internal.ads.zzflg zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final android.content.pm.ApplicationInfo zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;
    private final android.content.pm.PackageInfo zzf;
    private final com.google.android.gms.internal.ads.zzhic zzg;
    private final java.lang.String zzh;
    private final com.google.android.gms.internal.ads.zzexk zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final com.google.android.gms.internal.ads.zzfhc zzk;
    private final com.google.android.gms.internal.ads.zzddm zzl;

    public zzcxe(com.google.android.gms.internal.ads.zzflg r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, android.content.pm.ApplicationInfo r3, java.lang.String r4, java.util.List r5, android.content.pm.PackageInfo r6, com.google.android.gms.internal.ads.zzhic r7, com.google.android.gms.ads.internal.util.zzg r8, java.lang.String r9, com.google.android.gms.internal.ads.zzexk r10, com.google.android.gms.internal.ads.zzfhc r11, com.google.android.gms.internal.ads.zzddm r12) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r9
            r0.zzi = r10
            r0.zzj = r8
            r0.zzk = r11
            r0.zzl = r12
            return
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbwa zza(com.google.common.util.concurrent.ListenableFuture r17, android.os.Bundle r18) throws java.lang.Exception {
            r16 = this;
            r0 = r16
            com.google.android.gms.internal.ads.zzbwa r15 = new com.google.android.gms.internal.ads.zzbwa
            java.lang.Object r1 = r17.get()
            r2 = r1
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.gms.internal.ads.zzhic r1 = r0.zzg
            java.lang.Object r1 = r1.zzb()
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            java.lang.Object r1 = r1.get()
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgQ
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 0
            if (r1 == 0) goto L38
            com.google.android.gms.ads.internal.util.zzg r1 = r0.zzj
            boolean r1 = r1.zzS()
            if (r1 == 0) goto L38
            r1 = 1
            r12 = 1
            goto L39
        L38:
            r12 = 0
        L39:
            java.lang.String r9 = r0.zzh
            android.content.pm.PackageInfo r7 = r0.zzf
            java.util.List r6 = r0.zze
            java.lang.String r5 = r0.zzd
            android.content.pm.ApplicationInfo r4 = r0.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r0.zzb
            r10 = 0
            r11 = 0
            com.google.android.gms.internal.ads.zzfhc r1 = r0.zzk
            boolean r13 = r1.zzb()
            r1 = r15
            r14 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(android.os.Bundle r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzddm r0 = r3.zzl
            r0.zza()
            com.google.android.gms.internal.ads.zzfla r0 = com.google.android.gms.internal.ads.zzfla.zza
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.internal.ads.zzexk r2 = r3.zzi
            com.google.common.util.concurrent.ListenableFuture r4 = r2.zza(r1, r4)
            com.google.android.gms.internal.ads.zzflg r1 = r3.zza
            com.google.android.gms.internal.ads.zzfkx r4 = com.google.android.gms.internal.ads.zzfkq.zzc(r4, r0, r1)
            com.google.android.gms.internal.ads.zzfkl r4 = r4.zza()
            return r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc() {
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L26
            com.google.android.gms.internal.ads.zzfhc r1 = r7.zzk
            android.os.Bundle r1 = r1.zzs
            if (r1 == 0) goto L21
            r0.putAll(r1)
        L21:
            java.lang.String r1 = "ls"
            r0.putBoolean(r1, r2)
        L26:
            com.google.common.util.concurrent.ListenableFuture r1 = r7.zzb(r0)
            com.google.android.gms.internal.ads.zzflg r3 = r7.zza
            com.google.android.gms.internal.ads.zzfla r4 = com.google.android.gms.internal.ads.zzfla.zzb
            r5 = 2
            com.google.common.util.concurrent.ListenableFuture[] r5 = new com.google.common.util.concurrent.ListenableFuture[r5]
            r5[r2] = r1
            r2 = 1
            com.google.android.gms.internal.ads.zzhic r6 = r7.zzg
            java.lang.Object r6 = r6.zzb()
            com.google.common.util.concurrent.ListenableFuture r6 = (com.google.common.util.concurrent.ListenableFuture) r6
            r5[r2] = r6
            com.google.android.gms.internal.ads.zzfko r2 = r3.zza(r4, r5)
            com.google.android.gms.internal.ads.zzcxd r3 = new com.google.android.gms.internal.ads.zzcxd
            r3.<init>(r7, r1, r0)
            com.google.android.gms.internal.ads.zzfkx r0 = r2.zza(r3)
            com.google.android.gms.internal.ads.zzfkl r0 = r0.zza()
            return r0
    }
}

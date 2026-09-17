package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdty {
    private final java.util.concurrent.ConcurrentHashMap zza;
    private final com.google.android.gms.internal.ads.zzcah zzb;
    private final com.google.android.gms.internal.ads.zzfhc zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.ads.internal.zzj zzf;
    private final android.os.Bundle zzg;
    private final android.content.Context zzh;

    public zzdty(android.content.Context r4, com.google.android.gms.internal.ads.zzdui r5, com.google.android.gms.internal.ads.zzcah r6, com.google.android.gms.internal.ads.zzfhc r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.ads.internal.zzj r10) {
            r3 = this;
            r3.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r3.zzg = r0
            java.util.concurrent.ConcurrentHashMap r5 = r5.zzc()
            r3.zza = r5
            r3.zzb = r6
            r3.zzc = r7
            r3.zzd = r8
            r3.zze = r9
            r3.zzf = r10
            r3.zzh = r4
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r6 = r9.toUpperCase(r6)
            java.lang.String r9 = "ad_format"
            r5.put(r9, r6)
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzjc
            com.google.android.gms.internal.ads.zzbct r9 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r9.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.String r9 = "1"
            r0 = 1
            if (r6 == 0) goto L57
            int r6 = r10.zzj()
            int r10 = r6 + (-1)
            if (r6 == 0) goto L55
            if (r10 == 0) goto L4e
            if (r10 == r0) goto L4b
            java.lang.String r6 = "na"
            goto L4f
        L4b:
            java.lang.String r6 = "2"
            goto L4f
        L4e:
            r6 = r9
        L4f:
            java.lang.String r10 = "asv"
            r5.put(r10, r6)
            goto L57
        L55:
            r4 = 0
            throw r4
        L57:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r10 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r10.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto Lde
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            long r1 = r6.freeMemory()
            java.lang.String r10 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "rt_f"
            r3.zzc(r1, r10)
            long r1 = r6.maxMemory()
            java.lang.String r10 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "rt_m"
            r3.zzc(r1, r10)
            long r1 = r6.totalMemory()
            java.lang.String r6 = java.lang.String.valueOf(r1)
            java.lang.String r10 = "rt_t"
            r3.zzc(r10, r6)
            com.google.android.gms.internal.ads.zzcad r6 = com.google.android.gms.ads.internal.zzu.zzo()
            int r6 = r6.zzb()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r10 = "wv_c"
            r3.zzc(r10, r6)
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzck
            com.google.android.gms.internal.ads.zzbct r10 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r10.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto Lde
            android.app.ActivityManager$MemoryInfo r4 = com.google.android.gms.ads.internal.util.client.zzf.zzc(r4)
            if (r4 == 0) goto Lde
            long r1 = r4.availMem
            java.lang.String r6 = java.lang.String.valueOf(r1)
            java.lang.String r10 = "mem_avl"
            r3.zzc(r10, r6)
            long r1 = r4.totalMem
            java.lang.String r6 = java.lang.String.valueOf(r1)
            java.lang.String r10 = "mem_tt"
            r3.zzc(r10, r6)
            boolean r4 = r4.lowMemory
            if (r0 == r4) goto Ld9
            java.lang.String r9 = "0"
        Ld9:
            java.lang.String r4 = "low_m"
            r3.zzc(r4, r9)
        Lde:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzgK
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r6.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto Lf1
            return
        Lf1:
            int r4 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzf(r7)
            int r4 = r4 + (-1)
            java.lang.String r6 = "scar"
            java.lang.String r9 = "request_id"
            if (r4 == 0) goto L13f
            java.lang.String r10 = "se"
            if (r4 == r0) goto L119
            r8 = 2
            if (r4 == r8) goto L113
            r8 = 3
            if (r4 == r8) goto L10d
            java.lang.String r4 = "r_both"
            r5.put(r10, r4)
            goto L121
        L10d:
            java.lang.String r4 = "r_adstring"
            r5.put(r10, r4)
            goto L121
        L113:
            java.lang.String r4 = "r_adinfo"
            r5.put(r10, r4)
            goto L121
        L119:
            r5.put(r9, r8)
            java.lang.String r4 = "query_g"
            r5.put(r10, r4)
        L121:
            java.lang.String r4 = "true"
            r5.put(r6, r4)
            com.google.android.gms.ads.internal.client.zzm r4 = r7.zzd
            java.lang.String r4 = r4.zzp
            java.lang.String r5 = "ragent"
            r3.zzc(r5, r4)
            com.google.android.gms.ads.internal.client.zzm r4 = r7.zzd
            java.lang.String r4 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(r4)
            java.lang.String r4 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(r4)
            java.lang.String r5 = "rtype"
            r3.zzc(r5, r4)
            return
        L13f:
            r5.put(r9, r8)
            java.lang.String r4 = "false"
            r5.put(r6, r4)
            return
    }

    public final android.os.Bundle zza() {
            r1 = this;
            android.os.Bundle r0 = r1.zzg
            return r0
    }

    public final java.util.Map zzb() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r1.zza
            return r0
    }

    public final void zzc(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L11
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L11
            java.util.concurrent.ConcurrentHashMap r0 = r1.zza
            r0.put(r2, r3)
        L11:
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzfgt r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            java.util.List r0 = r0.zza
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3a
            com.google.android.gms.internal.ads.zzfgs r0 = r4.zzb
            java.util.List r0 = r0.zza
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzfgh r0 = (com.google.android.gms.internal.ads.zzfgh) r0
            int r1 = r0.zzb
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfgh.zza(r1)
            java.lang.String r2 = "ad_format"
            r3.zzc(r2, r1)
            int r0 = r0.zzb
            r1 = 6
            if (r0 != r1) goto L3a
            java.util.concurrent.ConcurrentHashMap r0 = r3.zza
            r1 = 1
            com.google.android.gms.internal.ads.zzcah r2 = r3.zzb
            boolean r2 = r2.zzm()
            if (r1 == r2) goto L33
            java.lang.String r1 = "0"
            goto L35
        L33:
            java.lang.String r1 = "1"
        L35:
            java.lang.String r2 = "as"
            r0.put(r2, r1)
        L3a:
            com.google.android.gms.internal.ads.zzfgs r4 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r4 = r4.zzb
            java.lang.String r4 = r4.zzb
            java.lang.String r0 = "gqi"
            r3.zzc(r0, r4)
            return
    }

    public final void zze(android.os.Bundle r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L2d
        L3:
            java.lang.String r0 = "cnt"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L18
            int r0 = r3.getInt(r0)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "network_coarse"
            r2.zzc(r1, r0)
        L18:
            java.lang.String r0 = "gnt"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L2d
            int r3 = r3.getInt(r0)
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "network_fine"
            r2.zzc(r0, r3)
        L2d:
            return
    }
}

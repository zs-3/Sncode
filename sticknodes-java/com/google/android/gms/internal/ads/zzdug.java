package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdug implements com.google.android.gms.internal.ads.zzflh {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzdty zzb;
    private final com.google.android.gms.common.util.Clock zzc;
    private final java.util.Map zzd;

    public zzdug(com.google.android.gms.internal.ads.zzdty r3, java.util.Set r4, com.google.android.gms.common.util.Clock r5) {
            r2 = this;
            r2.<init>()
            r2.zzb = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.zza = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.zzd = r3
            java.util.Iterator r3 = r4.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r3.next()
            com.google.android.gms.internal.ads.zzduf r4 = (com.google.android.gms.internal.ads.zzduf) r4
            java.util.Map r0 = r2.zzd
            com.google.android.gms.internal.ads.zzfla r1 = com.google.android.gms.internal.ads.zzduf.zza(r4)
            r0.put(r1, r4)
            goto L17
        L2d:
            r2.zzc = r5
            return
    }

    private final void zze(com.google.android.gms.internal.ads.zzfla r6, boolean r7) {
            r5 = this;
            java.util.Map r0 = r5.zzd
            java.lang.Object r0 = r0.get(r6)
            com.google.android.gms.internal.ads.zzduf r0 = (com.google.android.gms.internal.ads.zzduf) r0
            com.google.android.gms.internal.ads.zzfla r0 = com.google.android.gms.internal.ads.zzduf.zzb(r0)
            java.util.Map r1 = r5.zza
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L56
            r1 = 1
            if (r1 == r7) goto L1a
            java.lang.String r7 = "f."
            goto L1c
        L1a:
            java.lang.String r7 = "s."
        L1c:
            com.google.android.gms.common.util.Clock r1 = r5.zzc
            java.util.Map r2 = r5.zza
            long r3 = r1.elapsedRealtime()
            java.lang.Object r0 = r2.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r3 = r3 - r0
            com.google.android.gms.internal.ads.zzdty r0 = r5.zzb
            java.util.Map r1 = r5.zzd
            java.util.Map r0 = r0.zzb()
            java.lang.Object r6 = r1.get(r6)
            com.google.android.gms.internal.ads.zzduf r6 = (com.google.android.gms.internal.ads.zzduf) r6
            java.lang.String r6 = com.google.android.gms.internal.ads.zzduf.zzc(r6)
            java.lang.String r1 = java.lang.Long.toString(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "label."
            java.lang.String r6 = r2.concat(r6)
            java.lang.String r7 = r7.concat(r1)
            r0.put(r6, r7)
        L56:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzd(com.google.android.gms.internal.ads.zzfla r5, java.lang.String r6) {
            r4 = this;
            java.util.Map r0 = r4.zza
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L3c
            com.google.android.gms.common.util.Clock r0 = r4.zzc
            java.util.Map r1 = r4.zza
            long r2 = r0.elapsedRealtime()
            java.lang.Object r0 = r1.get(r5)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r2 = r2 - r0
            com.google.android.gms.internal.ads.zzdty r0 = r4.zzb
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.util.Map r0 = r0.zzb()
            java.lang.String r1 = java.lang.Long.toString(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "task."
            java.lang.String r6 = r2.concat(r6)
            java.lang.String r2 = "s."
            java.lang.String r1 = r2.concat(r1)
            r0.put(r6, r1)
        L3c:
            java.util.Map r6 = r4.zzd
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L48
            r6 = 1
            r4.zze(r5, r6)
        L48:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdC(com.google.android.gms.internal.ads.zzfla r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdD(com.google.android.gms.internal.ads.zzfla r6, java.lang.String r7, java.lang.Throwable r8) {
            r5 = this;
            java.util.Map r8 = r5.zza
            boolean r8 = r8.containsKey(r6)
            if (r8 == 0) goto L3c
            com.google.android.gms.common.util.Clock r8 = r5.zzc
            java.util.Map r0 = r5.zza
            long r1 = r8.elapsedRealtime()
            java.lang.Object r8 = r0.get(r6)
            java.lang.Long r8 = (java.lang.Long) r8
            long r3 = r8.longValue()
            long r1 = r1 - r3
            com.google.android.gms.internal.ads.zzdty r8 = r5.zzb
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.util.Map r8 = r8.zzb()
            java.lang.String r0 = java.lang.Long.toString(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "task."
            java.lang.String r7 = r1.concat(r7)
            java.lang.String r1 = "f."
            java.lang.String r0 = r1.concat(r0)
            r8.put(r7, r0)
        L3c:
            java.util.Map r7 = r5.zzd
            boolean r7 = r7.containsKey(r6)
            if (r7 == 0) goto L48
            r7 = 0
            r5.zze(r6, r7)
        L48:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdE(com.google.android.gms.internal.ads.zzfla r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.common.util.Clock r4 = r2.zzc
            long r0 = r4.elapsedRealtime()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.util.Map r0 = r2.zza
            r0.put(r3, r4)
            return
    }
}

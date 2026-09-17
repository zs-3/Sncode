package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdww {
    private final com.google.android.gms.internal.ads.zzdwg zza;
    private final com.google.android.gms.internal.ads.zzdrr zzb;
    private final java.lang.Object zzc;
    private final java.util.List zzd;
    private boolean zze;

    zzdww(com.google.android.gms.internal.ads.zzdwg r2, com.google.android.gms.internal.ads.zzdrr r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzc = r0
            r1.zza = r2
            r1.zzb = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.zzd = r2
            return
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzdww r0, java.util.List r1) {
            r0.zzd(r1)
            return
    }

    private final void zzd(java.util.List r13) {
            r12 = this;
            java.lang.Object r0 = r12.zzc
            monitor-enter(r0)
            boolean r1 = r12.zze     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            return
        L9:
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L89
        Ld:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Throwable -> L89
            r2 = 1
            if (r1 == 0) goto L85
            java.lang.Object r1 = r13.next()     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzblu r1 = (com.google.android.gms.internal.ads.zzblu) r1     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zziT     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L89
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L89
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L43
            com.google.android.gms.internal.ads.zzdrr r3 = r12.zzb     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = r1.zza     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzdrq r3 = r3.zza(r4)     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L40
            com.google.android.gms.internal.ads.zzbrz r3 = r3.zzc     // Catch: java.lang.Throwable -> L89
            if (r3 != 0) goto L3b
            goto L40
        L3b:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L89
            goto L45
        L40:
            java.lang.String r3 = ""
            goto L45
        L43:
            java.lang.String r3 = ""
        L45:
            r6 = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zziU     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L89
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L89
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L89
            r4 = 0
            if (r3 == 0) goto L6a
            com.google.android.gms.internal.ads.zzdrr r3 = r12.zzb     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = r1.zza     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzdrq r3 = r3.zza(r5)     // Catch: java.lang.Throwable -> L89
            if (r3 != 0) goto L64
            goto L6a
        L64:
            boolean r3 = r3.zzd     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L6a
            r11 = 1
            goto L6b
        L6a:
            r11 = 0
        L6b:
            java.util.List r2 = r12.zzd     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzdwv r3 = new com.google.android.gms.internal.ads.zzdwv     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = r1.zza     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzdrr r4 = r12.zzb     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = r4.zzb(r5)     // Catch: java.lang.Throwable -> L89
            boolean r8 = r1.zzb     // Catch: java.lang.Throwable -> L89
            java.lang.String r9 = r1.zzd     // Catch: java.lang.Throwable -> L89
            int r10 = r1.zzc     // Catch: java.lang.Throwable -> L89
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L89
            r2.add(r3)     // Catch: java.lang.Throwable -> L89
            goto Ld
        L85:
            r12.zze = r2     // Catch: java.lang.Throwable -> L89
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            return
        L89:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            throw r13
    }

    public final org.json.JSONArray zza() throws org.json.JSONException {
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = r4.zzc
            monitor-enter(r1)
            boolean r2 = r4.zze     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzdwg r2 = r4.zza     // Catch: java.lang.Throwable -> L3f
            boolean r2 = r2.zzt()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.ads.zzdwg r2 = r4.zza     // Catch: java.lang.Throwable -> L3f
            java.util.List r2 = r2.zzg()     // Catch: java.lang.Throwable -> L3f
            r4.zzd(r2)     // Catch: java.lang.Throwable -> L3f
            goto L23
        L1e:
            r4.zzc()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            goto L3e
        L23:
            java.util.List r2 = r4.zzd     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3f
        L29:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.internal.ads.zzdwv r3 = (com.google.android.gms.internal.ads.zzdwv) r3     // Catch: java.lang.Throwable -> L3f
            org.json.JSONObject r3 = r3.zza()     // Catch: java.lang.Throwable -> L3f
            r0.put(r3)     // Catch: java.lang.Throwable -> L3f
            goto L29
        L3d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
        L3e:
            return r0
        L3f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            throw r0
    }

    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdwu r0 = new com.google.android.gms.internal.ads.zzdwu
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzdwg r1 = r2.zza
            r1.zzs(r0)
            return
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzbdk {
    private final java.util.List zza;
    private final java.util.Map zzb;
    private final java.lang.Object zzc;

    public zzbdk(boolean r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r1.zza = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.zzb = r2
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r1.zzc = r3
            java.lang.String r3 = "action"
            java.lang.String r0 = "make_wv"
            r2.put(r3, r0)
            java.lang.String r3 = "ad_format"
            r2.put(r3, r4)
            return
    }

    public static final com.google.android.gms.internal.ads.zzbdh zzf() {
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.elapsedRealtime()
            com.google.android.gms.internal.ads.zzbdh r2 = new com.google.android.gms.internal.ads.zzbdh
            r3 = 0
            r2.<init>(r0, r3, r3)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzbdj zza() {
            r14 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Object r3 = r14.zzc
            monitor-enter(r3)
            java.util.List r4 = r14.zza     // Catch: java.lang.Throwable -> L117
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L117
        L23:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L117
            r6 = 44
            r7 = 46
            if (r5 == 0) goto L90
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L117
            com.google.android.gms.internal.ads.zzbdh r5 = (com.google.android.gms.internal.ads.zzbdh) r5     // Catch: java.lang.Throwable -> L117
            long r8 = r5.zza()     // Catch: java.lang.Throwable -> L117
            java.lang.String r10 = r5.zzc()     // Catch: java.lang.Throwable -> L117
            com.google.android.gms.internal.ads.zzbdh r5 = r5.zzb()     // Catch: java.lang.Throwable -> L117
            if (r5 == 0) goto L23
            r11 = 0
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 <= 0) goto L23
            long r11 = r5.zza()     // Catch: java.lang.Throwable -> L117
            long r8 = r8 - r11
            r1.append(r10)     // Catch: java.lang.Throwable -> L117
            r1.append(r7)     // Catch: java.lang.Throwable -> L117
            r1.append(r8)     // Catch: java.lang.Throwable -> L117
            r1.append(r6)     // Catch: java.lang.Throwable -> L117
            if (r0 == 0) goto L23
            long r6 = r5.zza()     // Catch: java.lang.Throwable -> L117
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L117
            boolean r6 = r2.containsKey(r6)     // Catch: java.lang.Throwable -> L117
            if (r6 != 0) goto L79
            long r5 = r5.zza()     // Catch: java.lang.Throwable -> L117
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L117
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L117
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L117
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L117
            goto L23
        L79:
            long r5 = r5.zza()     // Catch: java.lang.Throwable -> L117
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L117
            java.lang.Object r5 = r2.get(r5)     // Catch: java.lang.Throwable -> L117
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5     // Catch: java.lang.Throwable -> L117
            r6 = 43
            r5.append(r6)     // Catch: java.lang.Throwable -> L117
            r5.append(r10)     // Catch: java.lang.Throwable -> L117
            goto L23
        L90:
            java.util.List r4 = r14.zza     // Catch: java.lang.Throwable -> L117
            r4.clear()     // Catch: java.lang.Throwable -> L117
            r4 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L117
            if (r5 != 0) goto La0
            r1.append(r4)     // Catch: java.lang.Throwable -> L117
            goto Laf
        La0:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L117
            if (r5 <= 0) goto Laf
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L117
            int r5 = r5 + (-1)
            r1.setLength(r5)     // Catch: java.lang.Throwable -> L117
        Laf:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L117
            r5.<init>()     // Catch: java.lang.Throwable -> L117
            if (r0 == 0) goto L10c
            java.util.Set r0 = r2.entrySet()     // Catch: java.lang.Throwable -> L117
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L117
        Lbe:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L117
            if (r2 == 0) goto Lf9
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L117
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L117
            java.lang.Object r4 = r2.getValue()     // Catch: java.lang.Throwable -> L117
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> L117
            r5.append(r4)     // Catch: java.lang.Throwable -> L117
            r5.append(r7)     // Catch: java.lang.Throwable -> L117
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L117
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L117
            long r8 = r2.longValue()     // Catch: java.lang.Throwable -> L117
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L117
            long r10 = r2.currentTimeMillis()     // Catch: java.lang.Throwable -> L117
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L117
            long r12 = r2.elapsedRealtime()     // Catch: java.lang.Throwable -> L117
            long r8 = r8 - r12
            long r10 = r10 + r8
            r5.append(r10)     // Catch: java.lang.Throwable -> L117
            r5.append(r6)     // Catch: java.lang.Throwable -> L117
            goto Lbe
        Lf9:
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L117
            if (r0 <= 0) goto L108
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L117
            int r0 = r0 + (-1)
            r5.setLength(r0)     // Catch: java.lang.Throwable -> L117
        L108:
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L117
        L10c:
            com.google.android.gms.internal.ads.zzbdj r0 = new com.google.android.gms.internal.ads.zzbdj     // Catch: java.lang.Throwable -> L117
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L117
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L117
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L117
            return r0
        L117:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L117
            throw r0
    }

    public final java.util.Map zzb() {
            r2 = this;
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> Le
            r1.zzg()     // Catch: java.lang.Throwable -> Le
            java.util.Map r1 = r2.zzb     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbdk r2) {
            r1 = this;
            java.lang.Object r2 = r1.zzc
            monitor-enter(r2)
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final void zzd(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L7
            goto L2c
        L7:
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.internal.ads.zzbda r0 = r0.zzg()
            if (r0 == 0) goto L2c
            java.lang.Object r1 = r4.zzc
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbdg r0 = r0.zza(r5)     // Catch: java.lang.Throwable -> L29
            java.util.Map r2 = r4.zzb     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = r2.get(r5)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = r0.zza(r3, r6)     // Catch: java.lang.Throwable -> L29
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r5
        L2c:
            return
    }

    public final boolean zze(com.google.android.gms.internal.ads.zzbdh r3, long r4, java.lang.String... r6) {
            r2 = this;
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            r1 = 0
            r6 = r6[r1]     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.ads.zzbdh r1 = new com.google.android.gms.internal.ads.zzbdh     // Catch: java.lang.Throwable -> L13
            r1.<init>(r4, r6, r3)     // Catch: java.lang.Throwable -> L13
            java.util.List r3 = r2.zza     // Catch: java.lang.Throwable -> L13
            r3.add(r1)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            r3 = 1
            return r3
        L13:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r3
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfql implements com.google.android.gms.internal.ads.zzfpm {
    private static final com.google.android.gms.internal.ads.zzfql zza = null;
    private static final android.os.Handler zzb = null;
    private static android.os.Handler zzc;
    private static final java.lang.Runnable zzd = null;
    private static final java.lang.Runnable zze = null;
    private final java.util.List zzf;
    private int zzg;
    private boolean zzh;
    private final java.util.List zzi;
    private final com.google.android.gms.internal.ads.zzfpo zzj;
    private final com.google.android.gms.internal.ads.zzfqe zzk;
    private final com.google.android.gms.internal.ads.zzfqf zzl;
    private long zzm;

    static {
            com.google.android.gms.internal.ads.zzfql r0 = new com.google.android.gms.internal.ads.zzfql
            r0.<init>()
            com.google.android.gms.internal.ads.zzfql.zza = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzfql.zzb = r0
            r0 = 0
            com.google.android.gms.internal.ads.zzfql.zzc = r0
            com.google.android.gms.internal.ads.zzfqh r0 = new com.google.android.gms.internal.ads.zzfqh
            r0.<init>()
            com.google.android.gms.internal.ads.zzfql.zzd = r0
            com.google.android.gms.internal.ads.zzfqi r0 = new com.google.android.gms.internal.ads.zzfqi
            r0.<init>()
            com.google.android.gms.internal.ads.zzfql.zze = r0
            return
    }

    zzfql() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzf = r0
            r0 = 0
            r2.zzh = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzi = r0
            com.google.android.gms.internal.ads.zzfqe r0 = new com.google.android.gms.internal.ads.zzfqe
            r0.<init>()
            r2.zzk = r0
            com.google.android.gms.internal.ads.zzfpo r0 = new com.google.android.gms.internal.ads.zzfpo
            r0.<init>()
            r2.zzj = r0
            com.google.android.gms.internal.ads.zzfqf r0 = new com.google.android.gms.internal.ads.zzfqf
            com.google.android.gms.internal.ads.zzfqo r1 = new com.google.android.gms.internal.ads.zzfqo
            r1.<init>()
            r0.<init>(r1)
            r2.zzl = r0
            return
    }

    static /* bridge */ /* synthetic */ android.os.Handler zzb() {
            android.os.Handler r0 = com.google.android.gms.internal.ads.zzfql.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfqf zzc(com.google.android.gms.internal.ads.zzfql r0) {
            com.google.android.gms.internal.ads.zzfqf r0 = r0.zzl
            return r0
    }

    public static com.google.android.gms.internal.ads.zzfql zzd() {
            com.google.android.gms.internal.ads.zzfql r0 = com.google.android.gms.internal.ads.zzfql.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Runnable zze() {
            java.lang.Runnable r0 = com.google.android.gms.internal.ads.zzfql.zze
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Runnable zzf() {
            java.lang.Runnable r0 = com.google.android.gms.internal.ads.zzfql.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzfql r10) {
            r0 = 0
            r10.zzg = r0
            java.util.List r1 = r10.zzi
            r1.clear()
            r10.zzh = r0
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            java.util.Collection r0 = r0.zzb()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfom r1 = (com.google.android.gms.internal.ads.zzfom) r1
            goto L16
        L23:
            long r0 = java.lang.System.nanoTime()
            r10.zzm = r0
            com.google.android.gms.internal.ads.zzfqe r0 = r10.zzk
            r0.zzi()
            long r0 = java.lang.System.nanoTime()
            com.google.android.gms.internal.ads.zzfpo r2 = r10.zzj
            com.google.android.gms.internal.ads.zzfpn r5 = r2.zza()
            com.google.android.gms.internal.ads.zzfqe r2 = r10.zzk
            java.util.HashSet r2 = r2.zze()
            int r2 = r2.size()
            r3 = 0
            if (r2 <= 0) goto L9a
            com.google.android.gms.internal.ads.zzfqe r2 = r10.zzk
            java.util.HashSet r2 = r2.zze()
            java.util.Iterator r2 = r2.iterator()
        L4f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L9a
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            org.json.JSONObject r6 = r5.zza(r3)
            com.google.android.gms.internal.ads.zzfqe r7 = r10.zzk
            android.view.View r7 = r7.zza(r4)
            com.google.android.gms.internal.ads.zzfpo r8 = r10.zzj
            com.google.android.gms.internal.ads.zzfpn r8 = r8.zzb()
            com.google.android.gms.internal.ads.zzfqe r9 = r10.zzk
            java.lang.String r9 = r9.zzc(r4)
            if (r9 == 0) goto L89
            org.json.JSONObject r7 = r8.zza(r7)
            com.google.android.gms.internal.ads.zzfpx.zzb(r7, r4)
            java.lang.String r8 = "notVisibleReason"
            r7.put(r8, r9)     // Catch: org.json.JSONException -> L80
            goto L86
        L80:
            r8 = move-exception
            java.lang.String r9 = "Error with setting not visible reason"
            com.google.android.gms.internal.ads.zzfpy.zza(r9, r8)
        L86:
            com.google.android.gms.internal.ads.zzfpx.zzc(r6, r7)
        L89:
            com.google.android.gms.internal.ads.zzfpx.zzf(r6)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r7.add(r4)
            com.google.android.gms.internal.ads.zzfqf r4 = r10.zzl
            r4.zzc(r6, r7, r0)
            goto L4f
        L9a:
            com.google.android.gms.internal.ads.zzfqe r2 = r10.zzk
            java.util.HashSet r2 = r2.zzf()
            int r2 = r2.size()
            if (r2 <= 0) goto Lc1
            org.json.JSONObject r2 = r5.zza(r3)
            r4 = 0
            r7 = 1
            r8 = 0
            r3 = r10
            r6 = r2
            r3.zzk(r4, r5, r6, r7, r8)
            com.google.android.gms.internal.ads.zzfpx.zzf(r2)
            com.google.android.gms.internal.ads.zzfqf r3 = r10.zzl
            com.google.android.gms.internal.ads.zzfqe r4 = r10.zzk
            java.util.HashSet r4 = r4.zzf()
            r3.zzd(r2, r4, r0)
            goto Lc6
        Lc1:
            com.google.android.gms.internal.ads.zzfqf r0 = r10.zzl
            r0.zzb()
        Lc6:
            com.google.android.gms.internal.ads.zzfqe r0 = r10.zzk
            r0.zzg()
            long r0 = java.lang.System.nanoTime()
            long r2 = r10.zzm
            long r0 = r0 - r2
            java.util.List r2 = r10.zzf
            int r2 = r2.size()
            if (r2 <= 0) goto Lfe
            java.util.List r10 = r10.zzf
            java.util.Iterator r10 = r10.iterator()
        Le0:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lfe
            java.lang.Object r2 = r10.next()
            com.google.android.gms.internal.ads.zzfqk r2 = (com.google.android.gms.internal.ads.zzfqk) r2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            r3.toMillis(r0)
            r2.zzb()
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzfqj
            if (r3 == 0) goto Le0
            com.google.android.gms.internal.ads.zzfqj r2 = (com.google.android.gms.internal.ads.zzfqj) r2
            r2.zza()
            goto Le0
        Lfe:
            return
    }

    private final void zzk(android.view.View r8, com.google.android.gms.internal.ads.zzfpn r9, org.json.JSONObject r10, int r11, boolean r12) {
            r7 = this;
            r0 = 1
            if (r11 != r0) goto L5
            r5 = 1
            goto L7
        L5:
            r0 = 0
            r5 = 0
        L7:
            r1 = r9
            r2 = r8
            r3 = r10
            r4 = r7
            r6 = r12
            r1.zzb(r2, r3, r4, r5, r6)
            return
    }

    private static final void zzl() {
            android.os.Handler r0 = com.google.android.gms.internal.ads.zzfql.zzc
            if (r0 == 0) goto Lc
            java.lang.Runnable r1 = com.google.android.gms.internal.ads.zzfql.zze
            r0.removeCallbacks(r1)
            r0 = 0
            com.google.android.gms.internal.ads.zzfql.zzc = r0
        Lc:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final void zza(android.view.View r10, com.google.android.gms.internal.ads.zzfpn r11, org.json.JSONObject r12, boolean r13) {
            r9 = this;
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfqc.zza(r10)
            if (r0 != 0) goto La6
            com.google.android.gms.internal.ads.zzfqe r0 = r9.zzk
            int r5 = r0.zzk(r10)
            r0 = 3
            if (r5 != r0) goto L11
            goto La6
        L11:
            org.json.JSONObject r4 = r11.zza(r10)
            com.google.android.gms.internal.ads.zzfpx.zzc(r12, r4)
            com.google.android.gms.internal.ads.zzfqe r12 = r9.zzk
            java.lang.String r12 = r12.zzd(r10)
            r0 = 1
            if (r12 == 0) goto L40
            com.google.android.gms.internal.ads.zzfpx.zzb(r4, r12)
            com.google.android.gms.internal.ads.zzfqe r11 = r9.zzk
            boolean r10 = r11.zzj(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.String r11 = "hasWindowFocus"
            r4.put(r11, r10)     // Catch: org.json.JSONException -> L34
            goto L3a
        L34:
            r10 = move-exception
            java.lang.String r11 = "Error with setting has window focus"
            com.google.android.gms.internal.ads.zzfpy.zza(r11, r10)
        L3a:
            com.google.android.gms.internal.ads.zzfqe r10 = r9.zzk
            r10.zzh()
            goto La1
        L40:
            com.google.android.gms.internal.ads.zzfqe r12 = r9.zzk
            com.google.android.gms.internal.ads.zzfqd r12 = r12.zzb(r10)
            r1 = 0
            if (r12 == 0) goto L92
            com.google.android.gms.internal.ads.zzfpg r2 = r12.zza()
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.ArrayList r12 = r12.zzb()
            int r6 = r12.size()
            r7 = 0
        L5b:
            if (r7 >= r6) goto L69
            java.lang.Object r8 = r12.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            r3.put(r8)
            int r7 = r7 + 1
            goto L5b
        L69:
            java.lang.String r12 = "isFriendlyObstructionFor"
            r4.put(r12, r3)     // Catch: org.json.JSONException -> L8a
            java.lang.String r12 = "friendlyObstructionClass"
            java.lang.String r3 = r2.zzd()     // Catch: org.json.JSONException -> L8a
            r4.put(r12, r3)     // Catch: org.json.JSONException -> L8a
            java.lang.String r12 = "friendlyObstructionPurpose"
            com.google.android.gms.internal.ads.zzfop r3 = r2.zza()     // Catch: org.json.JSONException -> L8a
            r4.put(r12, r3)     // Catch: org.json.JSONException -> L8a
            java.lang.String r12 = "friendlyObstructionReason"
            java.lang.String r2 = r2.zzc()     // Catch: org.json.JSONException -> L8a
            r4.put(r12, r2)     // Catch: org.json.JSONException -> L8a
            goto L90
        L8a:
            r12 = move-exception
            java.lang.String r2 = "Error with setting friendly obstruction"
            com.google.android.gms.internal.ads.zzfpy.zza(r2, r12)
        L90:
            r12 = 1
            goto L93
        L92:
            r12 = 0
        L93:
            if (r13 != 0) goto L9a
            if (r12 == 0) goto L98
            goto L9a
        L98:
            r6 = 0
            goto L9b
        L9a:
            r6 = 1
        L9b:
            r1 = r9
            r2 = r10
            r3 = r11
            r1.zzk(r2, r3, r4, r5, r6)
        La1:
            int r10 = r9.zzg
            int r10 = r10 + r0
            r9.zzg = r10
        La6:
            return
    }

    public final void zzh() {
            r0 = this;
            zzl()
            return
    }

    public final void zzi() {
            r4 = this;
            android.os.Handler r0 = com.google.android.gms.internal.ads.zzfql.zzc
            if (r0 != 0) goto L1d
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzfql.zzc = r0
            java.lang.Runnable r1 = com.google.android.gms.internal.ads.zzfql.zzd
            r0.post(r1)
            android.os.Handler r0 = com.google.android.gms.internal.ads.zzfql.zzc
            java.lang.Runnable r1 = com.google.android.gms.internal.ads.zzfql.zze
            r2 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r1, r2)
        L1d:
            return
    }

    public final void zzj() {
            r2 = this;
            zzl()
            java.util.List r0 = r2.zzf
            r0.clear()
            android.os.Handler r0 = com.google.android.gms.internal.ads.zzfql.zzb
            com.google.android.gms.internal.ads.zzfqg r1 = new com.google.android.gms.internal.ads.zzfqg
            r1.<init>(r2)
            r0.post(r1)
            return
    }
}

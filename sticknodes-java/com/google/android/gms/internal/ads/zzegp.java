package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzegp {
    private final java.util.List zza;
    private final java.util.Map zzb;
    private final java.lang.String zzc;
    private com.google.android.gms.internal.ads.zzfgk zzd;
    private com.google.android.gms.internal.ads.zzfgh zze;
    private com.google.android.gms.ads.internal.client.zzw zzf;

    public zzegp(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzd = r0
            r1.zze = r0
            r1.zzf = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.zzb = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r1.zza = r0
            r1.zzc = r2
            return
    }

    private static java.lang.String zzj(com.google.android.gms.internal.ads.zzfgh r2) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdz
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            java.lang.String r2 = r2.zzap
            return r2
        L15:
            java.lang.String r2 = r2.zzw
            return r2
    }

    private final synchronized void zzk(com.google.android.gms.internal.ads.zzfgh r13, int r14) {
            r12 = this;
            monitor-enter(r12)
            java.util.Map r0 = r12.zzb     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = zzj(r13)     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto Lf
            monitor-exit(r12)
            return
        Lf:
            android.os.Bundle r7 = new android.os.Bundle     // Catch: java.lang.Throwable -> L79
            r7.<init>()     // Catch: java.lang.Throwable -> L79
            org.json.JSONObject r0 = r13.zzv     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r0 = r0.keys()     // Catch: java.lang.Throwable -> L79
        L1a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L79
            org.json.JSONObject r3 = r13.zzv     // Catch: org.json.JSONException -> L1a java.lang.Throwable -> L79
            java.lang.String r3 = r3.getString(r2)     // Catch: org.json.JSONException -> L1a java.lang.Throwable -> L79
            r7.putString(r2, r3)     // Catch: org.json.JSONException -> L1a java.lang.Throwable -> L79
            goto L1a
        L30:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgz     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L4b
            java.lang.String r0 = r13.zzF     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r13.zzG     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r13.zzH     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r13.zzI     // Catch: java.lang.Throwable -> L79
            goto L53
        L4b:
            java.lang.String r0 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
        L53:
            r8 = r0
            r9 = r2
            r10 = r3
            r11 = r4
            com.google.android.gms.ads.internal.client.zzw r0 = new com.google.android.gms.ads.internal.client.zzw     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r13.zzE     // Catch: java.lang.Throwable -> L79
            r4 = 0
            r6 = 0
            r2 = r0
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L79
            java.util.List r13 = r12.zza     // Catch: java.lang.IndexOutOfBoundsException -> L68 java.lang.Throwable -> L79
            r13.add(r14, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L68 java.lang.Throwable -> L79
            goto L72
        L68:
            r13 = move-exception
            java.lang.String r14 = "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation"
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L79
            r2.zzw(r13, r14)     // Catch: java.lang.Throwable -> L79
        L72:
            java.util.Map r13 = r12.zzb     // Catch: java.lang.Throwable -> L79
            r13.put(r1, r0)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r12)
            return
        L79:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
    }

    private final void zzl(com.google.android.gms.internal.ads.zzfgh r3, long r4, com.google.android.gms.ads.internal.client.zze r6, boolean r7) {
            r2 = this;
            java.util.Map r0 = r2.zzb
            java.lang.String r1 = zzj(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld
            goto L35
        Ld:
            com.google.android.gms.internal.ads.zzfgh r0 = r2.zze
            if (r0 != 0) goto L13
            r2.zze = r3
        L13:
            java.util.Map r3 = r2.zzb
            java.lang.Object r3 = r3.get(r1)
            com.google.android.gms.ads.internal.client.zzw r3 = (com.google.android.gms.ads.internal.client.zzw) r3
            r3.zzb = r4
            r3.zzc = r6
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzgA
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            if (r7 == 0) goto L35
            r2.zzf = r3
        L35:
            return
    }

    public final com.google.android.gms.ads.internal.client.zzw zza() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzw r0 = r1.zzf
            return r0
    }

    public final com.google.android.gms.internal.ads.zzcxt zzb() {
            r7 = this;
            com.google.android.gms.internal.ads.zzcxt r6 = new com.google.android.gms.internal.ads.zzcxt
            com.google.android.gms.internal.ads.zzfgh r1 = r7.zze
            com.google.android.gms.internal.ads.zzfgk r4 = r7.zzd
            java.lang.String r5 = r7.zzc
            java.lang.String r2 = ""
            r0 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public final java.util.List zzc() {
            r1 = this;
            java.util.List r0 = r1.zza
            return r0
    }

    public final void zzd(com.google.android.gms.internal.ads.zzfgh r2) {
            r1 = this;
            java.util.List r0 = r1.zza
            int r0 = r0.size()
            r1.zzk(r2, r0)
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzfgh r4) {
            r3 = this;
            java.util.Map r0 = r3.zzb
            java.lang.String r4 = zzj(r4)
            java.lang.Object r4 = r0.get(r4)
            java.util.List r0 = r3.zza
            int r4 = r0.indexOf(r4)
            if (r4 < 0) goto L1a
            java.util.Map r0 = r3.zzb
            int r0 = r0.size()
            if (r4 < r0) goto L22
        L1a:
            java.util.List r4 = r3.zza
            com.google.android.gms.ads.internal.client.zzw r0 = r3.zzf
            int r4 = r4.indexOf(r0)
        L22:
            if (r4 < 0) goto L51
            java.util.Map r0 = r3.zzb
            int r0 = r0.size()
            if (r4 < r0) goto L2d
            goto L51
        L2d:
            java.util.List r0 = r3.zza
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.ads.internal.client.zzw r0 = (com.google.android.gms.ads.internal.client.zzw) r0
            r3.zzf = r0
        L37:
            int r4 = r4 + 1
            java.util.List r0 = r3.zza
            int r0 = r0.size()
            if (r4 >= r0) goto L51
            java.util.List r0 = r3.zza
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.ads.internal.client.zzw r0 = (com.google.android.gms.ads.internal.client.zzw) r0
            r1 = 0
            r0.zzb = r1
            r1 = 0
            r0.zzc = r1
            goto L37
        L51:
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzfgh r7, long r8, com.google.android.gms.ads.internal.client.zze r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r0.zzl(r1, r2, r4, r5)
            return
    }

    public final void zzg(com.google.android.gms.internal.ads.zzfgh r7, long r8, com.google.android.gms.ads.internal.client.zze r10) {
            r6 = this;
            r4 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r0.zzl(r1, r2, r4, r5)
            return
    }

    public final synchronized void zzh(java.lang.String r5, java.util.List r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.Map r0 = r4.zzb     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto La
            goto L43
        La:
            java.util.Map r0 = r4.zzb     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.ads.internal.client.zzw r0 = (com.google.android.gms.ads.internal.client.zzw) r0     // Catch: java.lang.Throwable -> L45
            java.util.List r1 = r4.zza     // Catch: java.lang.Throwable -> L45
            int r0 = r1.indexOf(r0)     // Catch: java.lang.Throwable -> L45
            java.util.List r1 = r4.zza     // Catch: java.lang.IndexOutOfBoundsException -> L1e java.lang.Throwable -> L45
            r1.remove(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L1e java.lang.Throwable -> L45
            goto L28
        L1e:
            r1 = move-exception
            java.lang.String r2 = "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry"
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L45
            r3.zzw(r1, r2)     // Catch: java.lang.Throwable -> L45
        L28:
            java.util.Map r1 = r4.zzb     // Catch: java.lang.Throwable -> L45
            r1.remove(r5)     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r5 = r6.iterator()     // Catch: java.lang.Throwable -> L45
        L31:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L43
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.zzfgh r6 = (com.google.android.gms.internal.ads.zzfgh) r6     // Catch: java.lang.Throwable -> L45
            r4.zzk(r6, r0)     // Catch: java.lang.Throwable -> L45
            int r0 = r0 + 1
            goto L31
        L43:
            monitor-exit(r4)
            return
        L45:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final void zzi(com.google.android.gms.internal.ads.zzfgk r1) {
            r0 = this;
            r0.zzd = r1
            return
    }
}

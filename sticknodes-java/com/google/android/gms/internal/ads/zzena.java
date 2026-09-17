package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzena extends com.google.android.gms.internal.ads.zzbrm {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzbrk zzb;
    private final com.google.android.gms.internal.ads.zzcas zzc;
    private final org.json.JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzena(java.lang.String r3, com.google.android.gms.internal.ads.zzbrk r4, com.google.android.gms.internal.ads.zzcas r5, long r6) {
            r2 = this;
            r2.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r2.zzd = r0
            r1 = 0
            r2.zzf = r1
            r2.zzc = r5
            r2.zza = r3
            r2.zzb = r4
            r2.zze = r6
            java.lang.String r5 = "adapter_version"
            com.google.android.gms.internal.ads.zzbrz r6 = r4.zzf()     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L34
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "sdk_version"
            com.google.android.gms.internal.ads.zzbrz r4 = r4.zzg()     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L34
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "name"
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L34
        L34:
            return
    }

    public static synchronized void zzb(java.lang.String r3, com.google.android.gms.internal.ads.zzcas r4) {
            java.lang.Class<com.google.android.gms.internal.ads.zzena> r0 = com.google.android.gms.internal.ads.zzena.class
            monitor-enter(r0)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "name"
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L31 java.lang.Throwable -> L33
            java.lang.String r3 = "signal_error"
            java.lang.String r2 = "Adapter failed to instantiate"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L31 java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzbD     // Catch: org.json.JSONException -> L31 java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L31 java.lang.Throwable -> L33
            java.lang.Object r3 = r2.zza(r3)     // Catch: org.json.JSONException -> L31 java.lang.Throwable -> L33
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: org.json.JSONException -> L31 java.lang.Throwable -> L33
            boolean r3 = r3.booleanValue()     // Catch: org.json.JSONException -> L31 java.lang.Throwable -> L33
            if (r3 == 0) goto L2c
            java.lang.String r3 = "signal_error_code"
            r2 = 1
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L31 java.lang.Throwable -> L33
        L2c:
            r4.zzc(r1)     // Catch: org.json.JSONException -> L31 java.lang.Throwable -> L33
            monitor-exit(r0)
            return
        L31:
            monitor-exit(r0)
            return
        L33:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    private final synchronized void zzh(java.lang.String r6, int r7) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzf     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return
        L7:
            org.json.JSONObject r0 = r5.zzd     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            java.lang.String r1 = "signal_error"
            r0.put(r1, r6)     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzbE     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            java.lang.Object r6 = r0.zza(r6)     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            if (r6 == 0) goto L32
            org.json.JSONObject r6 = r5.zzd     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            java.lang.String r0 = "latency"
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            long r1 = r1.elapsedRealtime()     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            long r3 = r5.zze     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            long r1 = r1 - r3
            r6.put(r0, r1)     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
        L32:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzbD     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            java.lang.Object r6 = r0.zza(r6)     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            if (r6 == 0) goto L4b
            org.json.JSONObject r6 = r5.zzd     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
            java.lang.String r0 = "signal_error_code"
            r6.put(r0, r7)     // Catch: org.json.JSONException -> L4b java.lang.Throwable -> L57
        L4b:
            com.google.android.gms.internal.ads.zzcas r6 = r5.zzc     // Catch: java.lang.Throwable -> L57
            org.json.JSONObject r7 = r5.zzd     // Catch: java.lang.Throwable -> L57
            r6.zzc(r7)     // Catch: java.lang.Throwable -> L57
            r6 = 1
            r5.zzf = r6     // Catch: java.lang.Throwable -> L57
            monitor-exit(r5)
            return
        L57:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final synchronized void zzc() {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "Signal collection timeout."
            r1 = 3
            r2.zzh(r0, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void zzd() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzf     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L7
            monitor-exit(r3)
            return
        L7:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbD     // Catch: org.json.JSONException -> L21 java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L21 java.lang.Throwable -> L2d
            java.lang.Object r0 = r1.zza(r0)     // Catch: org.json.JSONException -> L21 java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: org.json.JSONException -> L21 java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: org.json.JSONException -> L21 java.lang.Throwable -> L2d
            if (r0 == 0) goto L21
            org.json.JSONObject r0 = r3.zzd     // Catch: org.json.JSONException -> L21 java.lang.Throwable -> L2d
            java.lang.String r1 = "signal_error_code"
            r2 = 0
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L21 java.lang.Throwable -> L2d
        L21:
            com.google.android.gms.internal.ads.zzcas r0 = r3.zzc     // Catch: java.lang.Throwable -> L2d
            org.json.JSONObject r1 = r3.zzd     // Catch: java.lang.Throwable -> L2d
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L2d
            r0 = 1
            r3.zzf = r0     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)
            return
        L2d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final synchronized void zze(java.lang.String r6) throws android.os.RemoteException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzf     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return
        L7:
            if (r6 != 0) goto L10
            java.lang.String r6 = "Adapter returned null signals"
            r5.zzf(r6)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r5)
            return
        L10:
            org.json.JSONObject r0 = r5.zzd     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            java.lang.String r1 = "signals"
            r0.put(r1, r6)     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzbE     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            java.lang.Object r6 = r0.zza(r6)     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            if (r6 == 0) goto L3b
            org.json.JSONObject r6 = r5.zzd     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            java.lang.String r0 = "latency"
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            long r1 = r1.elapsedRealtime()     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            long r3 = r5.zze     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            long r1 = r1 - r3
            r6.put(r0, r1)     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
        L3b:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzbD     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            java.lang.Object r6 = r0.zza(r6)     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            if (r6 == 0) goto L55
            org.json.JSONObject r6 = r5.zzd     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
            java.lang.String r0 = "signal_error_code"
            r1 = 0
            r6.put(r0, r1)     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L61
        L55:
            com.google.android.gms.internal.ads.zzcas r6 = r5.zzc     // Catch: java.lang.Throwable -> L61
            org.json.JSONObject r0 = r5.zzd     // Catch: java.lang.Throwable -> L61
            r6.zzc(r0)     // Catch: java.lang.Throwable -> L61
            r6 = 1
            r5.zzf = r6     // Catch: java.lang.Throwable -> L61
            monitor-exit(r5)
            return
        L61:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final synchronized void zzf(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            r0 = 2
            r1.zzh(r2, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r2 = r2.zzb     // Catch: java.lang.Throwable -> L9
            r0 = 2
            r1.zzh(r2, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}

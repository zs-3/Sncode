package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdru {
    private final com.google.android.gms.internal.ads.zzfhy zza;
    private final com.google.android.gms.internal.ads.zzdrr zzb;

    zzdru(com.google.android.gms.internal.ads.zzfhy r1, com.google.android.gms.internal.ads.zzdrr r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    final com.google.android.gms.internal.ads.zzbpl zza() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzfhy r0 = r1.zza
            com.google.android.gms.internal.ads.zzbpl r0 = r0.zzb()
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.String r0 = "Unexpected call to adapter creator."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzbrk zzb(java.lang.String r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.ads.zzbpl r0 = r2.zza()
            com.google.android.gms.internal.ads.zzbrk r0 = r0.zzc(r3)
            com.google.android.gms.internal.ads.zzdrr r1 = r2.zzb
            r1.zzd(r3, r0)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfia zzc(java.lang.String r6, org.json.JSONObject r7) throws com.google.android.gms.internal.ads.zzfhj {
            r5 = this;
            java.lang.String r0 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            com.google.android.gms.internal.ads.zzfia r1 = new com.google.android.gms.internal.ads.zzfia     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L17
            com.google.android.gms.internal.ads.zzbqm r7 = new com.google.android.gms.internal.ads.zzbqm     // Catch: java.lang.Throwable -> L70
            com.google.ads.mediation.admob.AdMobAdapter r0 = new com.google.ads.mediation.admob.AdMobAdapter     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L70
            goto L67
        L17:
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobCustomTabsAdapter"
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L2a
            com.google.android.gms.internal.ads.zzbqm r7 = new com.google.android.gms.internal.ads.zzbqm     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.zzbsd r0 = new com.google.android.gms.internal.ads.zzbsd     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L70
            goto L67
        L2a:
            com.google.android.gms.internal.ads.zzbpl r2 = r5.zza()     // Catch: java.lang.Throwable -> L70
            boolean r3 = r0.equals(r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            if (r3 != 0) goto L3c
            boolean r3 = r4.equals(r6)     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L63
        L3c:
            java.lang.String r3 = "class_name"
            java.lang.String r7 = r7.getString(r3)     // Catch: org.json.JSONException -> L5d java.lang.Throwable -> L70
            boolean r3 = r2.zze(r7)     // Catch: org.json.JSONException -> L5d java.lang.Throwable -> L70
            if (r3 == 0) goto L4d
            com.google.android.gms.internal.ads.zzbpo r7 = r2.zzb(r0)     // Catch: org.json.JSONException -> L5d java.lang.Throwable -> L70
            goto L67
        L4d:
            boolean r0 = r2.zzd(r7)     // Catch: org.json.JSONException -> L5d java.lang.Throwable -> L70
            if (r0 == 0) goto L58
            com.google.android.gms.internal.ads.zzbpo r7 = r2.zzb(r7)     // Catch: org.json.JSONException -> L5d java.lang.Throwable -> L70
            goto L67
        L58:
            com.google.android.gms.internal.ads.zzbpo r7 = r2.zzb(r4)     // Catch: org.json.JSONException -> L5d java.lang.Throwable -> L70
            goto L67
        L5d:
            r7 = move-exception
            java.lang.String r0 = "Invalid custom event."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r7)     // Catch: java.lang.Throwable -> L70
        L63:
            com.google.android.gms.internal.ads.zzbpo r7 = r2.zzb(r6)     // Catch: java.lang.Throwable -> L70
        L67:
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.zzdrr r7 = r5.zzb
            r7.zzc(r6, r1)
            return r1
        L70:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziU
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L89
            com.google.android.gms.internal.ads.zzdrr r0 = r5.zzb
            r1 = 0
            r0.zzc(r6, r1)
        L89:
            com.google.android.gms.internal.ads.zzfhj r6 = new com.google.android.gms.internal.ads.zzfhj
            r6.<init>(r7)
            throw r6
    }

    public final boolean zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfhy r0 = r1.zza
            com.google.android.gms.internal.ads.zzbpl r0 = r0.zzb()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}

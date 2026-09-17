package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdrr {
    private final java.util.Map zza;

    zzdrr() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public final synchronized com.google.android.gms.internal.ads.zzdrq zza(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zza     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb
            com.google.android.gms.internal.ads.zzdrq r2 = (com.google.android.gms.internal.ads.zzdrq) r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final java.lang.String zzb(java.lang.String r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzdrq r1 = r0.zza(r1)
            if (r1 == 0) goto L10
            com.google.android.gms.internal.ads.zzbrz r1 = r1.zzb
            if (r1 != 0) goto Lb
            goto L10
        Lb:
            java.lang.String r1 = r1.toString()
            return r1
        L10:
            java.lang.String r1 = ""
            return r1
    }

    final synchronized void zzc(java.lang.String r7, com.google.android.gms.internal.ads.zzfia r8) {
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.zza     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto Lb
            monitor-exit(r6)
            return
        Lb:
            com.google.android.gms.internal.ads.zzdrq r0 = new com.google.android.gms.internal.ads.zzdrq     // Catch: java.lang.Throwable -> L44
            r1 = 0
            if (r8 != 0) goto L12
        L10:
            r2 = r1
            goto L16
        L12:
            com.google.android.gms.internal.ads.zzbrz r2 = r8.zze()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L10 java.lang.Throwable -> L44
        L16:
            if (r8 != 0) goto L19
            goto L1d
        L19:
            com.google.android.gms.internal.ads.zzbrz r1 = r8.zzf()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L1d java.lang.Throwable -> L44
        L1d:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zziU     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L44
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L33
        L31:
            r4 = 1
            goto L3a
        L33:
            if (r8 != 0) goto L36
            goto L3a
        L36:
            r8.zzC()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L3a java.lang.Throwable -> L44
            goto L31
        L3a:
            r0.<init>(r7, r2, r1, r4)     // Catch: java.lang.Throwable -> L44
            java.util.Map r8 = r6.zza     // Catch: java.lang.Throwable -> L44
            r8.put(r7, r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r6)
            return
        L44:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    final synchronized void zzd(java.lang.String r4, com.google.android.gms.internal.ads.zzbrk r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.zza     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            com.google.android.gms.internal.ads.zzbrz r0 = r5.zzf()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbrz r5 = r5.zzg()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzdrq r1 = new com.google.android.gms.internal.ads.zzdrq     // Catch: java.lang.Throwable -> L22
            r2 = 1
            r1.<init>(r4, r0, r5, r2)     // Catch: java.lang.Throwable -> L22
            java.util.Map r5 = r3.zza     // Catch: java.lang.Throwable -> L22
            r5.put(r4, r1)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            return
        L20:
            monitor-exit(r3)
            return
        L22:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}

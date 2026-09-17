package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzejp {
    private final java.util.Map zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.ads.zzggh zzc;
    private final java.util.List zzd;
    private final java.util.Set zze;
    private com.google.android.gms.internal.ads.zzekf zzf;
    private int zzg;
    private final java.lang.String zzh;
    private final int zzi;
    private final com.google.android.gms.internal.ads.zzeke zzj;
    private com.google.android.gms.internal.ads.zzfgh zzk;
    private boolean zzl;

    zzejp(com.google.android.gms.internal.ads.zzfgt r3, com.google.android.gms.internal.ads.zzeke r4, com.google.android.gms.internal.ads.zzggh r5) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zza = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzb = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzd = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.zze = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.zzg = r0
            r0 = 0
            r2.zzl = r0
            com.google.android.gms.internal.ads.zzfgs r1 = r3.zzb
            com.google.android.gms.internal.ads.zzfgk r1 = r1.zzb
            int r1 = r1.zzr
            r2.zzi = r1
            r2.zzj = r4
            r2.zzc = r5
            java.lang.String r4 = com.google.android.gms.internal.ads.zzekl.zzc(r3)
            r2.zzh = r4
            com.google.android.gms.internal.ads.zzfgs r3 = r3.zzb
            java.util.List r3 = r3.zza
        L3d:
            int r4 = r3.size()
            if (r0 >= r4) goto L55
            java.util.Map r4 = r2.zza
            java.lang.Object r5 = r3.get(r0)
            com.google.android.gms.internal.ads.zzfgh r5 = (com.google.android.gms.internal.ads.zzfgh) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r4.put(r5, r1)
            int r0 = r0 + 1
            goto L3d
        L55:
            java.util.List r4 = r2.zzb
            r4.addAll(r3)
            return
    }

    private final synchronized void zze() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzeke r0 = r4.zzj     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzfgh r1 = r4.zzk     // Catch: java.lang.Throwable -> L22
            r0.zzi(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzekf r0 = r4.zzf     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzggh r1 = r4.zzc     // Catch: java.lang.Throwable -> L22
            r1.zzc(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r4)
            return
        L13:
            com.google.android.gms.internal.ads.zzggh r0 = r4.zzc     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r4.zzh     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzeki r2 = new com.google.android.gms.internal.ads.zzeki     // Catch: java.lang.Throwable -> L22
            r3 = 3
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            r0.zzd(r2)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r4)
            return
        L22:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    private final synchronized boolean zzf(boolean r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.List r0 = r4.zzb     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4b
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.internal.ads.zzfgh r1 = (com.google.android.gms.internal.ads.zzfgh) r1     // Catch: java.lang.Throwable -> L4b
            java.util.Map r2 = r4.zza     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L22
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L4b
            goto L25
        L22:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L25:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L4b
            if (r5 != 0) goto L35
            java.util.Set r3 = r4.zze     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = r1.zzat     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r3.contains(r1)     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L7
        L35:
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L4b
            int r3 = r4.zzg     // Catch: java.lang.Throwable -> L4b
            if (r1 >= r3) goto L40
            r5 = 1
            monitor-exit(r4)
            return r5
        L40:
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L4b
            int r2 = r4.zzg     // Catch: java.lang.Throwable -> L4b
            if (r1 <= r2) goto L7
        L48:
            r5 = 0
            monitor-exit(r4)
            return r5
        L4b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private final synchronized boolean zzg() {
            r3 = this;
            monitor-enter(r3)
            java.util.List r0 = r3.zzd     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L36
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzfgh r1 = (com.google.android.gms.internal.ads.zzfgh) r1     // Catch: java.lang.Throwable -> L36
            java.util.Map r2 = r3.zza     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L22
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            goto L25
        L22:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L25:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            int r2 = r3.zzg     // Catch: java.lang.Throwable -> L36
            if (r1 >= r2) goto L7
            r0 = 1
        L32:
            monitor-exit(r3)
            return r0
        L34:
            r0 = 0
            goto L32
        L36:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    private final synchronized boolean zzh() {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            boolean r1 = r2.zzf(r0)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            boolean r1 = r2.zzg()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto Lf
            goto L12
        Lf:
            r0 = 0
            monitor-exit(r2)
            return r0
        L12:
            monitor-exit(r2)
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final synchronized boolean zzi() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzl     // Catch: java.lang.Throwable -> L42
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r3)
            return r1
        L8:
            java.util.List r0 = r3.zzb     // Catch: java.lang.Throwable -> L42
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L27
            java.util.List r0 = r3.zzb     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzfgh r0 = (com.google.android.gms.internal.ads.zzfgh) r0     // Catch: java.lang.Throwable -> L42
            boolean r0 = r0.zzav     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L27
            java.util.List r0 = r3.zzd     // Catch: java.lang.Throwable -> L42
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L25
            goto L27
        L25:
            monitor-exit(r3)
            return r1
        L27:
            boolean r0 = r3.zzd()     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L40
            java.util.List r0 = r3.zzd     // Catch: java.lang.Throwable -> L42
            int r2 = r3.zzi     // Catch: java.lang.Throwable -> L42
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L42
            if (r0 >= r2) goto L40
            boolean r0 = r3.zzf(r1)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L40
            r0 = 1
            monitor-exit(r3)
            return r0
        L40:
            monitor-exit(r3)
            return r1
        L42:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    final synchronized com.google.android.gms.internal.ads.zzfgh zza() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.zzi()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L46
            r0 = 0
        L8:
            java.util.List r1 = r4.zzb     // Catch: java.lang.Throwable -> L49
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L49
            if (r0 >= r1) goto L46
            java.util.List r1 = r4.zzb     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.ads.zzfgh r1 = (com.google.android.gms.internal.ads.zzfgh) r1     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r1.zzat     // Catch: java.lang.Throwable -> L49
            java.util.Set r3 = r4.zze     // Catch: java.lang.Throwable -> L49
            boolean r3 = r3.contains(r2)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L25
            int r0 = r0 + 1
            goto L8
        L25:
            boolean r3 = r1.zzav     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L2c
            r3 = 1
            r4.zzl = r3     // Catch: java.lang.Throwable -> L49
        L2c:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L37
            java.util.Set r3 = r4.zze     // Catch: java.lang.Throwable -> L49
            r3.add(r2)     // Catch: java.lang.Throwable -> L49
        L37:
            java.util.List r2 = r4.zzd     // Catch: java.lang.Throwable -> L49
            r2.add(r1)     // Catch: java.lang.Throwable -> L49
            java.util.List r1 = r4.zzb     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.ads.zzfgh r0 = (com.google.android.gms.internal.ads.zzfgh) r0     // Catch: java.lang.Throwable -> L49
            monitor-exit(r4)
            return r0
        L46:
            r0 = 0
            monitor-exit(r4)
            return r0
        L49:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    final synchronized void zzb(java.lang.Throwable r1, com.google.android.gms.internal.ads.zzfgh r2) {
            r0 = this;
            monitor-enter(r0)
            r1 = 0
            r0.zzl = r1     // Catch: java.lang.Throwable -> L23
            java.util.List r1 = r0.zzd     // Catch: java.lang.Throwable -> L23
            r1.remove(r2)     // Catch: java.lang.Throwable -> L23
            java.util.Set r1 = r0.zze     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.zzat     // Catch: java.lang.Throwable -> L23
            r1.remove(r2)     // Catch: java.lang.Throwable -> L23
            boolean r1 = r0.zzd()     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L21
            boolean r1 = r0.zzh()     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L21
            r0.zze()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return
        L21:
            monitor-exit(r0)
            return
        L23:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    final synchronized void zzc(com.google.android.gms.internal.ads.zzekf r4, com.google.android.gms.internal.ads.zzfgh r5) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            r3.zzl = r0     // Catch: java.lang.Throwable -> L5b
            java.util.List r0 = r3.zzd     // Catch: java.lang.Throwable -> L5b
            r0.remove(r5)     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r3.zzd()     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L14
            r4.zzr()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r3)
            return
        L14:
            java.util.Map r0 = r3.zza     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L23
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L5b
            goto L26
        L23:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L26:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5b
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L5b
            int r2 = r3.zzg     // Catch: java.lang.Throwable -> L5b
            if (r1 <= r2) goto L39
            com.google.android.gms.internal.ads.zzeke r4 = r3.zzj     // Catch: java.lang.Throwable -> L5b
            r4.zzm(r5)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r3)
            return
        L39:
            com.google.android.gms.internal.ads.zzekf r1 = r3.zzf     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L44
            com.google.android.gms.internal.ads.zzeke r1 = r3.zzj     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.internal.ads.zzfgh r2 = r3.zzk     // Catch: java.lang.Throwable -> L5b
            r1.zzm(r2)     // Catch: java.lang.Throwable -> L5b
        L44:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L5b
            r3.zzg = r0     // Catch: java.lang.Throwable -> L5b
            r3.zzf = r4     // Catch: java.lang.Throwable -> L5b
            r3.zzk = r5     // Catch: java.lang.Throwable -> L5b
            boolean r4 = r3.zzh()     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L59
            r3.zze()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r3)
            return
        L59:
            monitor-exit(r3)
            return
        L5b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    final synchronized boolean zzd() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzggh r0 = r1.zzc     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}

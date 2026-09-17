package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzazl {
    int zza;
    private final java.lang.Object zzb;
    private final java.util.List zzc;

    public zzazl() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzb = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.zzc = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzazk zza(boolean r9) {
            r8 = this;
            java.lang.Object r0 = r8.zzb
            monitor-enter(r0)
            java.util.List r1 = r8.zzc     // Catch: java.lang.Throwable -> L61
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L61
            r2 = 0
            if (r1 == 0) goto L13
            java.lang.String r9 = "Queue empty"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r9)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            return r2
        L13:
            java.util.List r1 = r8.zzc     // Catch: java.lang.Throwable -> L61
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L61
            r3 = 2
            r4 = 0
            if (r1 < r3) goto L4c
            java.util.List r9 = r8.zzc     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L61
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
        L26:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L45
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L61
            com.google.android.gms.internal.ads.zzazk r5 = (com.google.android.gms.internal.ads.zzazk) r5     // Catch: java.lang.Throwable -> L61
            int r6 = r5.zzb()     // Catch: java.lang.Throwable -> L61
            if (r6 <= r1) goto L39
            r4 = r3
        L39:
            if (r6 <= r1) goto L3d
            r7 = r6
            goto L3e
        L3d:
            r7 = r1
        L3e:
            if (r6 <= r1) goto L41
            r2 = r5
        L41:
            int r3 = r3 + 1
            r1 = r7
            goto L26
        L45:
            java.util.List r9 = r8.zzc     // Catch: java.lang.Throwable -> L61
            r9.remove(r4)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            return r2
        L4c:
            java.util.List r1 = r8.zzc     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L61
            com.google.android.gms.internal.ads.zzazk r1 = (com.google.android.gms.internal.ads.zzazk) r1     // Catch: java.lang.Throwable -> L61
            if (r9 == 0) goto L5c
            java.util.List r9 = r8.zzc     // Catch: java.lang.Throwable -> L61
            r9.remove(r4)     // Catch: java.lang.Throwable -> L61
            goto L5f
        L5c:
            r1.zzi()     // Catch: java.lang.Throwable -> L61
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            return r1
        L61:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            throw r9
    }

    public final void zzb(com.google.android.gms.internal.ads.zzazk r5) {
            r4 = this;
            java.lang.Object r0 = r4.zzb
            monitor-enter(r0)
            java.util.List r1 = r4.zzc     // Catch: java.lang.Throwable -> L40
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L40
            r2 = 10
            if (r1 < r2) goto L2d
            java.util.List r1 = r4.zzc     // Catch: java.lang.Throwable -> L40
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r2.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "Queue is full, current size = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L40
            r2.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)     // Catch: java.lang.Throwable -> L40
            java.util.List r1 = r4.zzc     // Catch: java.lang.Throwable -> L40
            r2 = 0
            r1.remove(r2)     // Catch: java.lang.Throwable -> L40
        L2d:
            int r1 = r4.zza     // Catch: java.lang.Throwable -> L40
            int r2 = r1 + 1
            r4.zza = r2     // Catch: java.lang.Throwable -> L40
            r5.zzj(r1)     // Catch: java.lang.Throwable -> L40
            r5.zzn()     // Catch: java.lang.Throwable -> L40
            java.util.List r1 = r4.zzc     // Catch: java.lang.Throwable -> L40
            r1.add(r5)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r5
    }

    public final boolean zzc(com.google.android.gms.internal.ads.zzazk r6) {
            r5 = this;
            java.lang.Object r0 = r5.zzb
            monitor-enter(r0)
            java.util.List r1 = r5.zzc     // Catch: java.lang.Throwable -> L67
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L67
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L64
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.ads.zzazk r2 = (com.google.android.gms.internal.ads.zzazk) r2     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.ads.internal.util.zzg r3 = r3.zzi()     // Catch: java.lang.Throwable -> L67
            boolean r3 = r3.zzP()     // Catch: java.lang.Throwable -> L67
            r4 = 1
            if (r3 != 0) goto L3d
            boolean r3 = r6.equals(r2)     // Catch: java.lang.Throwable -> L67
            if (r3 != 0) goto L9
            java.lang.String r2 = r2.zzd()     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r6.zzd()     // Catch: java.lang.Throwable -> L67
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L9
            r1.remove()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            return r4
        L3d:
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.ads.internal.util.zzg r3 = r3.zzi()     // Catch: java.lang.Throwable -> L67
            boolean r3 = r3.zzQ()     // Catch: java.lang.Throwable -> L67
            if (r3 != 0) goto L9
            boolean r3 = r6.equals(r2)     // Catch: java.lang.Throwable -> L67
            if (r3 != 0) goto L9
            java.lang.String r2 = r2.zzf()     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r6.zzf()     // Catch: java.lang.Throwable -> L67
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L9
            r1.remove()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            return r4
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            r6 = 0
            return r6
        L67:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r6
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zzazk r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            java.util.List r1 = r2.zzc     // Catch: java.lang.Throwable -> L11
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r3 = 1
            return r3
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r3 = 0
            return r3
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }
}

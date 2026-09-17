package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaqt {
    protected static final java.util.Comparator zza = null;
    private final java.util.List zzb;
    private final java.util.List zzc;
    private int zzd;

    static {
            com.google.android.gms.internal.ads.zzaqs r0 = new com.google.android.gms.internal.ads.zzaqs
            r0.<init>()
            com.google.android.gms.internal.ads.zzaqt.zza = r0
            return
    }

    public zzaqt(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.zzb = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 64
            r2.<init>(r0)
            r1.zzc = r2
            r2 = 0
            r1.zzd = r2
            return
    }

    private final synchronized void zzc() {
            r2 = this;
            monitor-enter(r2)
        L1:
            int r0 = r2.zzd     // Catch: java.lang.Throwable -> L1e
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r1) goto L1c
            java.util.List r0 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L1e
            java.util.List r1 = r2.zzc     // Catch: java.lang.Throwable -> L1e
            r1.remove(r0)     // Catch: java.lang.Throwable -> L1e
            int r1 = r2.zzd     // Catch: java.lang.Throwable -> L1e
            int r0 = r0.length     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 - r0
            r2.zzd = r1     // Catch: java.lang.Throwable -> L1e
            goto L1
        L1c:
            monitor-exit(r2)
            return
        L1e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void zza(byte[] r4) {
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L2d
            int r0 = r4.length     // Catch: java.lang.Throwable -> L2a
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r1) goto L9
            goto L2d
        L9:
            java.util.List r1 = r3.zzb     // Catch: java.lang.Throwable -> L2a
            r1.add(r4)     // Catch: java.lang.Throwable -> L2a
            java.util.List r1 = r3.zzc     // Catch: java.lang.Throwable -> L2a
            java.util.Comparator r2 = com.google.android.gms.internal.ads.zzaqt.zza     // Catch: java.lang.Throwable -> L2a
            int r1 = java.util.Collections.binarySearch(r1, r4, r2)     // Catch: java.lang.Throwable -> L2a
            if (r1 >= 0) goto L1b
            int r1 = -r1
            int r1 = r1 + (-1)
        L1b:
            java.util.List r2 = r3.zzc     // Catch: java.lang.Throwable -> L2a
            r2.add(r1, r4)     // Catch: java.lang.Throwable -> L2a
            int r4 = r3.zzd     // Catch: java.lang.Throwable -> L2a
            int r4 = r4 + r0
            r3.zzd = r4     // Catch: java.lang.Throwable -> L2a
            r3.zzc()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L2a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L2d:
            monitor-exit(r3)
            return
    }

    public final synchronized byte[] zzb(int r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
        L2:
            java.util.List r1 = r3.zzc     // Catch: java.lang.Throwable -> L2d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2d
            if (r0 >= r1) goto L29
            java.util.List r1 = r3.zzc     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L2d
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L2d
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2d
            if (r2 < r4) goto L26
            int r4 = r3.zzd     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 - r2
            r3.zzd = r4     // Catch: java.lang.Throwable -> L2d
            java.util.List r4 = r3.zzc     // Catch: java.lang.Throwable -> L2d
            r4.remove(r0)     // Catch: java.lang.Throwable -> L2d
            java.util.List r4 = r3.zzb     // Catch: java.lang.Throwable -> L2d
            r4.remove(r1)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)
            return r1
        L26:
            int r0 = r0 + 1
            goto L2
        L29:
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)
            return r4
        L2d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgzr extends java.io.OutputStream {
    private static final byte[] zza = null;
    private final int zzb;
    private final java.util.ArrayList zzc;
    private int zzd;
    private byte[] zze;
    private int zzf;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.android.gms.internal.ads.zzgzr.zza = r0
            return
    }

    zzgzr(int r2) {
            r1 = this;
            r1.<init>()
            r2 = 128(0x80, float:1.794E-43)
            r1.zzb = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzc = r0
            byte[] r2 = new byte[r2]
            r1.zze = r2
            return
    }

    private final void zzc(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgzq r0 = new com.google.android.gms.internal.ads.zzgzq
            byte[] r1 = r2.zze
            r0.<init>(r1)
            java.util.ArrayList r1 = r2.zzc
            r1.add(r0)
            int r0 = r2.zzd
            byte[] r1 = r2.zze
            int r1 = r1.length
            int r0 = r0 + r1
            r2.zzd = r0
            int r0 = r0 >>> 1
            int r1 = r2.zzb
            int r3 = java.lang.Math.max(r3, r0)
            int r3 = java.lang.Math.max(r1, r3)
            byte[] r3 = new byte[r3]
            r2.zze = r3
            r3 = 0
            r2.zzf = r3
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "<ByteString.Output@%s size=%d>"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int r4) {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.zzf     // Catch: java.lang.Throwable -> L19
            byte[] r1 = r3.zze     // Catch: java.lang.Throwable -> L19
            int r1 = r1.length     // Catch: java.lang.Throwable -> L19
            if (r0 != r1) goto Lc
            r0 = 1
            r3.zzc(r0)     // Catch: java.lang.Throwable -> L19
        Lc:
            byte[] r0 = r3.zze     // Catch: java.lang.Throwable -> L19
            int r1 = r3.zzf     // Catch: java.lang.Throwable -> L19
            int r2 = r1 + 1
            r3.zzf = r2     // Catch: java.lang.Throwable -> L19
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L19
            r0[r1] = r4     // Catch: java.lang.Throwable -> L19
            monitor-exit(r3)
            return
        L19:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] r4, int r5, int r6) {
            r3 = this;
            monitor-enter(r3)
            byte[] r0 = r3.zze     // Catch: java.lang.Throwable -> L25
            int r1 = r0.length     // Catch: java.lang.Throwable -> L25
            int r2 = r3.zzf     // Catch: java.lang.Throwable -> L25
            int r1 = r1 - r2
            if (r6 > r1) goto L13
            java.lang.System.arraycopy(r4, r5, r0, r2, r6)     // Catch: java.lang.Throwable -> L25
            int r4 = r3.zzf     // Catch: java.lang.Throwable -> L25
            int r4 = r4 + r6
            r3.zzf = r4     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)
            return
        L13:
            java.lang.System.arraycopy(r4, r5, r0, r2, r1)     // Catch: java.lang.Throwable -> L25
            int r5 = r5 + r1
            int r6 = r6 - r1
            r3.zzc(r6)     // Catch: java.lang.Throwable -> L25
            byte[] r0 = r3.zze     // Catch: java.lang.Throwable -> L25
            r1 = 0
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)     // Catch: java.lang.Throwable -> L25
            r3.zzf = r6     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)
            return
        L25:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized int zza() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.zzd     // Catch: java.lang.Throwable -> L8
            int r1 = r2.zzf     // Catch: java.lang.Throwable -> L8
            int r0 = r0 + r1
            monitor-exit(r2)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzgzs zzb() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.zzf     // Catch: java.lang.Throwable -> L3b
            byte[] r1 = r3.zze     // Catch: java.lang.Throwable -> L3b
            int r2 = r1.length     // Catch: java.lang.Throwable -> L3b
            if (r0 >= r2) goto L19
            if (r0 <= 0) goto L29
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.Throwable -> L3b
            java.util.ArrayList r1 = r3.zzc     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.zzgzq r2 = new com.google.android.gms.internal.ads.zzgzq     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            r1.add(r2)     // Catch: java.lang.Throwable -> L3b
            goto L29
        L19:
            java.util.ArrayList r0 = r3.zzc     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.zzgzq r1 = new com.google.android.gms.internal.ads.zzgzq     // Catch: java.lang.Throwable -> L3b
            byte[] r2 = r3.zze     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3b
            r0.add(r1)     // Catch: java.lang.Throwable -> L3b
            byte[] r0 = com.google.android.gms.internal.ads.zzgzr.zza     // Catch: java.lang.Throwable -> L3b
            r3.zze = r0     // Catch: java.lang.Throwable -> L3b
        L29:
            int r0 = r3.zzd     // Catch: java.lang.Throwable -> L3b
            int r1 = r3.zzf     // Catch: java.lang.Throwable -> L3b
            int r0 = r0 + r1
            r3.zzd = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 0
            r3.zzf = r0     // Catch: java.lang.Throwable -> L3b
            java.util.ArrayList r0 = r3.zzc     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzu(r0)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)
            return r0
        L3b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqv {
    private java.lang.Exception zza;
    private long zzb;
    private long zzc;

    public zzqv() {
            r2 = this;
            r2.<init>()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzb = r0
            r2.zzc = r0
            return
    }

    public final void zza() {
            r2 = this;
            r0 = 0
            r2.zza = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzb = r0
            r2.zzc = r0
            return
    }

    public final void zzb(java.lang.Exception r8) throws java.lang.Exception {
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Exception r2 = r7.zza
            if (r2 != 0) goto La
            r7.zza = r8
        La:
            long r2 = r7.zzb
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L20
            boolean r2 = com.google.android.gms.internal.ads.zzrc.zzK()
            if (r2 != 0) goto L20
            r2 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r0
            r7.zzb = r2
        L20:
            long r2 = r7.zzb
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L37
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L37
            java.lang.Exception r0 = r7.zza
            if (r0 == r8) goto L31
            r0.addSuppressed(r8)
        L31:
            java.lang.Exception r8 = r7.zza
            r7.zza()
            throw r8
        L37:
            r2 = 50
            long r0 = r0 + r2
            r7.zzc = r0
            return
    }

    public final boolean zzc() {
            r7 = this;
            java.lang.Exception r0 = r7.zza
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = com.google.android.gms.internal.ads.zzrc.zzK()
            r2 = 1
            if (r0 == 0) goto Le
            return r2
        Le:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.zzc
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L19
            return r2
        L19:
            return r1
    }
}

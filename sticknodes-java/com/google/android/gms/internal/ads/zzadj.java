package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadj {
    public static com.google.android.gms.internal.ads.zzbk zza(com.google.android.gms.internal.ads.zzadc r2, boolean r3) throws java.io.IOException {
            r0 = 0
            if (r3 == 0) goto L5
            r3 = r0
            goto L7
        L5:
            com.google.android.gms.internal.ads.zzags r3 = com.google.android.gms.internal.ads.zzagu.zza
        L7:
            com.google.android.gms.internal.ads.zzadr r1 = new com.google.android.gms.internal.ads.zzadr
            r1.<init>()
            com.google.android.gms.internal.ads.zzbk r2 = r1.zza(r2, r3)
            if (r2 == 0) goto L1a
            int r3 = r2.zza()
            if (r3 != 0) goto L19
            goto L1a
        L19:
            return r2
        L1a:
            return r0
    }

    public static com.google.android.gms.internal.ads.zzadl zzb(com.google.android.gms.internal.ads.zzek r13) {
            r0 = 1
            r13.zzM(r0)
            int r0 = r13.zzo()
            int r1 = r13.zzd()
            long r1 = (long) r1
            long r3 = (long) r0
            int r0 = r0 / 18
            long[] r5 = new long[r0]
            long[] r6 = new long[r0]
            r7 = 0
        L15:
            if (r7 >= r0) goto L39
            long r8 = r13.zzt()
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L2a
            long[] r5 = java.util.Arrays.copyOf(r5, r7)
            long[] r6 = java.util.Arrays.copyOf(r6, r7)
            goto L39
        L2a:
            r5[r7] = r8
            long r8 = r13.zzt()
            r6[r7] = r8
            r8 = 2
            r13.zzM(r8)
            int r7 = r7 + 1
            goto L15
        L39:
            long r1 = r1 + r3
            int r0 = r13.zzd()
            long r3 = (long) r0
            long r1 = r1 - r3
            int r0 = (int) r1
            r13.zzM(r0)
            com.google.android.gms.internal.ads.zzadl r13 = new com.google.android.gms.internal.ads.zzadl
            r13.<init>(r5, r6)
            return r13
    }
}

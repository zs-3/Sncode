package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzakp {
    public static void zza(com.google.android.gms.internal.ads.zzakq r8, com.google.android.gms.internal.ads.zzaku r9, com.google.android.gms.internal.ads.zzdn r10) {
            int r9 = r8.zza()
            if (r9 == 0) goto L48
            r9 = 0
        L7:
            int r0 = r8.zza()
            if (r9 >= r0) goto L48
            long r3 = r8.zzb(r9)
            java.util.List r2 = r8.zzc(r3)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1c
            goto L3f
        L1c:
            int r0 = r8.zza()
            int r0 = r0 + (-1)
            if (r9 == r0) goto L42
            int r0 = r9 + 1
            long r0 = r8.zzb(r0)
            long r5 = r8.zzb(r9)
            long r5 = r0 - r5
            r0 = 0
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L3f
            com.google.android.gms.internal.ads.zzakn r0 = new com.google.android.gms.internal.ads.zzakn
            r1 = r0
            r1.<init>(r2, r3, r5)
            r10.zza(r0)
        L3f:
            int r9 = r9 + 1
            goto L7
        L42:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L48:
            return
    }
}

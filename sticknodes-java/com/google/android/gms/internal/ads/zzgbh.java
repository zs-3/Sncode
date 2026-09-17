package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgbh {
    static java.lang.Object zza(java.util.Iterator r1) {
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r1.next()
            r1.remove()
            return r0
        Le:
            r1 = 0
            return r1
    }

    static void zzb(java.util.Iterator r1) {
        L0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld
            r1.next()
            r1.remove()
            goto L0
        Ld:
            return
    }

    public static boolean zzc(java.util.Collection r2, java.util.Iterator r3) {
            r0 = 0
        L1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L11
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            r0 = r0 | r1
            goto L1
        L11:
            return r0
    }
}

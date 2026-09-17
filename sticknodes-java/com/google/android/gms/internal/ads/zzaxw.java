package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxw extends com.google.android.gms.internal.ads.zzayc {
    private final com.google.android.gms.internal.ads.zzawv zzh;
    private long zzi;

    public zzaxw(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13, com.google.android.gms.internal.ads.zzawv r14) {
            r7 = this;
            java.lang.String r2 = "fITy8eyNabiNCHuPyNX0x482LGXuzWIuGD/71SlN2nKRI9kSJNQ0LUuMwsl06lrx"
            java.lang.String r3 = "tMANUUGyytjQo/XDHg2IEhabePFT+VIo7wkY/Wjo6Gc="
            r6 = 53
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zzh = r14
            if (r14 == 0) goto L17
            long r8 = r14.zza()
            r7.zzi = r8
        L17:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r7 = this;
            com.google.android.gms.internal.ads.zzawv r0 = r7.zzh
            if (r0 == 0) goto L22
            com.google.android.gms.internal.ads.zzasm r0 = r7.zzd
            java.lang.reflect.Method r1 = r7.zze
            r2 = 0
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            long r5 = r7.zzi
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r4] = r5
            java.lang.Object r1 = r1.invoke(r2, r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.zzP(r1)
        L22:
            return
    }
}
